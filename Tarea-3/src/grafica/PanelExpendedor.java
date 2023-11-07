package grafica;
import javax.swing.*;
import java.awt.*;

public class PanelExpendedor extends JPanel {
    private PanelDepositoSprite depSprite;
    private PanelDepositoCoca depCoca;
    private PanelDepositoFanta depFanta;
    private PanelDepositoSnickers depSnickers;
    private PanelDepositoSuper8 depSuper8;
    private PanelProductoComprado depCompra;
    private ImageIcon imSprite;
    private ImageIcon imCoca;
    private ImageIcon imFanta;
    private ImageIcon imSnickers;
    private ImageIcon imSuper8;
    private JButton btnSprite;
    private JButton btnCoca;
    private JButton btnFanta;
    private JButton btnSnickers;
    private JButton btnSuper8;
    public PanelExpendedor(){
        depSprite = new PanelDepositoSprite();
        this.add(depSprite);
        depCoca = new PanelDepositoCoca();
        this.add(depCoca);
        depFanta = new PanelDepositoFanta();
        this.add(depFanta);
        depSnickers = new PanelDepositoSnickers();
        this.add(depSnickers);
        depSuper8 = new PanelDepositoSuper8();
        this.add(depSuper8);
        depCompra = new PanelProductoComprado();
        this.add(depCompra);

        imSprite = new ImageIcon("src/grafica/imagenes/sprite.png");
        imCoca = new ImageIcon("src/grafica/imagenes/coca.png");
        imFanta = new ImageIcon("src/grafica/imagenes/fanta.png");
        imSnickers = new ImageIcon("src/grafica/imagenes/snickers.png");
        imSuper8 = new ImageIcon("src/grafica/imagenes/super8.png");

        btnSprite = new JButton();
        this.add(btnSprite);
        btnCoca = new JButton();
        this.add(btnCoca);
        btnFanta = new JButton();
        this.add(btnFanta);
        btnSnickers = new JButton();
        this.add(btnSnickers);
        btnSuper8 = new JButton();
        this.add(btnSuper8);

        this.setLayout(null);
        setBackground(Color.cyan);
    }

    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        //medidas
        int ladoBtn = 76;
        int anchoDepositos = 300;
        int altoDepositos = 110;
        //expendedor
        g.drawRect(0, 0,500,750);
        g.setColor(Color.GRAY);
        g.fillRect(0, 0,500,750);
        g.setColor(Color.BLACK);
        //estante de productos
        depSprite.setBounds(15,15, anchoDepositos, altoDepositos);
        depCoca.setBounds(15,127, anchoDepositos, altoDepositos);
        depFanta.setBounds(15,239, anchoDepositos, altoDepositos);
        depSnickers.setBounds(15,351, anchoDepositos, altoDepositos);
        depSuper8.setBounds(15,463, anchoDepositos, altoDepositos);
        //lineas divisorias de las estanterias
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(Color.BLACK);
        g2.setStroke(new BasicStroke(2.0f));
        g2.drawRect(11,11,308,566);
        //bandeja de salida
        g.setColor(Color.BLACK);
        g.drawRect(  70 ,   600, 190,50);
        depCompra.setBounds(71,601,188,48);
        //manija de la bandeja de salida
        g.fillRect(  132,  610, 66, 7);
        //boton sprite
        btnSprite.setBounds(  327,50,ladoBtn,ladoBtn);
        btnSprite.setFocusPainted(false);
        Icon a = new ImageIcon(imSprite.getImage().getScaledInstance(ladoBtn,ladoBtn,Image.SCALE_DEFAULT));
        btnSprite.setIcon(a);
        //boton Cocacola
        btnCoca.setBounds(  417,   50,ladoBtn,ladoBtn);
        btnCoca.setFocusPainted(false);
        Icon b = new ImageIcon(imCoca.getImage().getScaledInstance(ladoBtn,ladoBtn, Image.SCALE_DEFAULT));
        btnCoca.setIcon(b);
        //boton fanta
        btnFanta.setBounds(  327,  135,ladoBtn,ladoBtn);
        btnFanta.setFocusPainted(false);
        Icon c = new ImageIcon(imFanta.getImage().getScaledInstance(ladoBtn,ladoBtn,Image.SCALE_DEFAULT));
        btnFanta.setIcon(c);
        //boton Snickers
        btnSnickers.setBounds(  417,   135,ladoBtn,ladoBtn);
        btnSnickers.setFocusPainted(false);
        Icon d = new ImageIcon(imSnickers.getImage().getScaledInstance(ladoBtn,ladoBtn,Image.SCALE_DEFAULT));
        btnSnickers.setIcon(d);
        //boton Super8
        btnSuper8.setBounds(  372,  220,ladoBtn,ladoBtn);
        btnSuper8.setFocusPainted(false);
        Icon e = new ImageIcon(imSuper8.getImage().getScaledInstance(ladoBtn,ladoBtn,Image.SCALE_DEFAULT));
        btnSuper8.setIcon(e);
    }
}