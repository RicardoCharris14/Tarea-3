package grafica;
import javax.swing.*;
import java.awt.*;

public class PanelExpendedor extends JPanel {
    private PanelDepositoSprite depSprite;
    private PanelDepositoCoca depCoca;
    private PanelDepositoFanta depFanta;
    private PanelDepositoSnickers depSnickers;
    private PanelDepositoSuper8 depSuper8;
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


        btnSprite = new JButton("1");
        this.add(btnSprite);
        btnCoca = new JButton("2");
        this.add(btnCoca);
        btnFanta = new JButton("3");
        this.add(btnFanta);
        btnSnickers = new JButton("4");
        this.add(btnSnickers);
        btnSuper8 = new JButton("5");
        this.add(btnSuper8);

        this.setLayout(null);
        setBackground(Color.cyan);
    }

    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        //expendedor
        g.drawRect(0, 0,400,600);
        g.setColor(Color.GRAY);
        g.fillRect(0, 0,400,600);
        g.setColor(Color.BLACK);
        //estante de productos
        depSprite.setBounds(10,10,268,85);
        depCoca.setBounds(10,97,268,85);
        depFanta.setBounds(10,184,268,85);
        depSnickers.setBounds(10,271,268,85);
        depSuper8.setBounds(10,358,268,85);
        //lineas divisorias de las estanterias
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(Color.BLACK);
        g2.setStroke(new BasicStroke(2.0f));
        g2.drawRect(7,7,274,439);
        //bandeja de salida
        g.setColor(Color.BLACK);
        g.drawRect(  70 ,   480, 150,40);
        //manija de la bandeja de salida
        g.fillRect(  120,  490, 50, 5);
        //boton sprite
        btnSprite.setBounds(  285,   50,50,50);
        btnSprite.setFocusPainted(false);
        //boton Cocacola
        btnCoca.setBounds(  345,   50,50,50);
        btnCoca.setFocusPainted(false);
        //boton fanta
        btnFanta.setBounds(  285,  110,50,50);
        btnFanta.setFocusPainted(false);
        //boton Snickers
        btnSnickers.setBounds(  345,   110,50,50);
        btnSnickers.setFocusPainted(false);
        //boton Super8
        btnSuper8.setBounds(  315,  170,50,50);
        btnSuper8.setFocusPainted(false);
    }
}