package grafica;
import logica.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;

public class PanelExpendedor extends JPanel {
    private Expendedor exp;
    private SeleccionMonedas seleccionM;
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
    private Image imMoneda;
    private JButton btnSprite;
    private JButton btnCoca;
    private JButton btnFanta;
    private JButton btnSnickers;
    private JButton btnSuper8;
    private JTextArea txtEntradaM;
    private final int numProductos = 5;
    private int numSprites = numProductos;
    private int numCocas = numProductos;
    private int numFantas = numProductos;
    private int numSnickers = numProductos;
    private int numSuper8 = numProductos;

    public PanelExpendedor() {
        exp = new Expendedor(numProductos);
        seleccionM = SeleccionMonedas.NULO;

        depSprite = new PanelDepositoSprite(numProductos);
        depCoca = new PanelDepositoCoca(numProductos);
        depFanta = new PanelDepositoFanta(numProductos);
        depSnickers = new PanelDepositoSnickers(numProductos);
        depSuper8 = new PanelDepositoSuper8(numProductos);
        depCompra = new PanelProductoComprado();

        imSprite = new ImageIcon("src/grafica/imagenes/sprite.png");
        imCoca = new ImageIcon("src/grafica/imagenes/coca.png");
        imFanta = new ImageIcon("src/grafica/imagenes/fanta.png");
        imSnickers = new ImageIcon("src/grafica/imagenes/snickers.png");
        imSuper8 = new ImageIcon("src/grafica/imagenes/super8.png");

        btnSprite = new JButton();
        btnCoca = new JButton();
        btnFanta = new JButton();
        btnSnickers = new JButton();
        btnSuper8 = new JButton();

        txtEntradaM = new JTextArea(" Ingrese moneda\n(100, 500,o 1000)");


        this.add(depSprite);
        this.add(depCoca);
        this.add(depFanta);
        this.add(depSnickers);
        this.add(depSuper8);
        this.add(depCompra);
        this.add(btnSprite);
        this.add(btnCoca);
        this.add(btnFanta);
        this.add(btnSnickers);
        this.add(btnSuper8);
        this.add(txtEntradaM);

        eventosBotones();
        clickDepCompra();

        this.setLayout(null);
        setBackground(Color.cyan);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        //medidas
        int ladoBtn = 76;
        int anchoDepositos = 300;
        int altoDepositos = 110;
        //expendedor
        g.drawRect(0, 0, 500, 750);
        g.setColor(Color.GRAY);
        g.fillRect(0, 0, 500, 750);
        g.setColor(Color.BLACK);
        //lineas divisorias de las estanterias
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(Color.BLACK);
        g2.setStroke(new BasicStroke(2.0f));
        g2.fillRect(11, 11, 308, 566);
        g2.setColor(Color.GRAY);
        g2.drawLine(15, 126, 315, 126);
        g2.drawLine(15, 238, 315, 238);
        g2.drawLine(15, 350, 315, 350);
        g2.drawLine(15, 462, 315, 462);
        //estante de productos
        depSprite.setBounds(15, 15, anchoDepositos, altoDepositos);
        depCoca.setBounds(15, 127, anchoDepositos, altoDepositos);
        depFanta.setBounds(15, 239, anchoDepositos, altoDepositos);
        depSnickers.setBounds(15, 351, anchoDepositos, altoDepositos);
        depSuper8.setBounds(15, 463, anchoDepositos, altoDepositos);
        //bandeja de salida
        g.setColor(Color.BLACK);
        g.drawRect(70, 600, 190, 50);
        depCompra.setBounds(71, 601, 188, 48);
        //manija de la bandeja de salida
        g.fillRect(132, 610, 66, 7);
        //entrada de moneda
        g2.drawRect(357, 335, 106, 41);
        txtEntradaM.setBounds(360, 338, 100, 35);
        txtEntradaM.setEditable(false);
        txtEntradaM.setOpaque(true);
        txtEntradaM.setBackground(Color.BLUE);
        txtEntradaM.setForeground(Color.WHITE);
        g.fillRect(390, 388, 40, 100);
        g.setColor(Color.GRAY);
        g.fillRect(395, 393, 30, 90);
        g.setColor(Color.WHITE);
        g.fillRect(405, 400, 10, 76);

        //boton sprite
        btnSprite.setBounds(327, 50, ladoBtn, ladoBtn);
        btnSprite.setFocusPainted(false);
        Icon a = new ImageIcon(imSprite.getImage().getScaledInstance(ladoBtn, ladoBtn, Image.SCALE_DEFAULT));
        btnSprite.setIcon(a);
        //boton Cocacola
        btnCoca.setBounds(417, 50, ladoBtn, ladoBtn);
        btnCoca.setFocusPainted(false);
        Icon b = new ImageIcon(imCoca.getImage().getScaledInstance(ladoBtn, ladoBtn, Image.SCALE_DEFAULT));
        btnCoca.setIcon(b);
        //boton fanta
        btnFanta.setBounds(327, 135, ladoBtn, ladoBtn);
        btnFanta.setFocusPainted(false);
        Icon c = new ImageIcon(imFanta.getImage().getScaledInstance(ladoBtn, ladoBtn, Image.SCALE_DEFAULT));
        btnFanta.setIcon(c);
        //boton Snickers
        btnSnickers.setBounds(417, 135, ladoBtn, ladoBtn);
        btnSnickers.setFocusPainted(false);
        Icon d = new ImageIcon(imSnickers.getImage().getScaledInstance(ladoBtn, ladoBtn, Image.SCALE_DEFAULT));
        btnSnickers.setIcon(d);
        //boton Super8
        btnSuper8.setBounds(372, 220, ladoBtn, ladoBtn);
        btnSuper8.setFocusPainted(false);
        Icon e = new ImageIcon(imSuper8.getImage().getScaledInstance(ladoBtn, ladoBtn, Image.SCALE_DEFAULT));
        btnSuper8.setIcon(e);
        //Monedas de compra
        switch (seleccionM){
            case MONEDA100 -> {
                imMoneda = new ImageIcon("src/grafica/imagenes/moneda100.png").getImage();
                g.drawImage(imMoneda,420,400,76,76,this);
            }
            case MONEDA500 -> {
                imMoneda = new ImageIcon("src/grafica/imagenes/moneda500.png").getImage();
                g.drawImage(imMoneda,420,400,76,76,this);
            }
            case MONEDA1000 -> {
                imMoneda = new ImageIcon("src/grafica/imagenes/moneda1000.png").getImage();
                g.drawImage(imMoneda,420,400,76,76,this);
            }
            case MONEDA5000 -> {
                imMoneda = new ImageIcon("src/grafica/imagenes/moneda5000.png").getImage();
                g.drawImage(imMoneda,420,400,76,76,this);
            }
            default -> {
            }
        }
    }
    public void setSeleccionM(SeleccionMonedas seleccionM){
        this.seleccionM = seleccionM;
    }

    public void eventosBotones() {
        btnSprite.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e1) {
                Moneda m = new Moneda1000();
                try{
                    exp.comprarProducto(m, SeleccionProductos.SPRITE);
                    depCompra.setSeleccion(SeleccionProductos.SPRITE);
                    numSprites-=1;
                    depSprite.setNumProductos(numSprites);

                }catch(PagoInsuficienteException e){
                    System.out.println(e.getMessage());
                }catch(PagoIncorrectoException e){
                    System.out.println(e.getMessage());
                }catch(NoHayProductoException e){
                    System.out.println(e.getMessage());
                }
                repaint();
            }
        });
        btnCoca.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e1){
                Moneda m = new Moneda1000();
                try{
                    exp.comprarProducto(m, SeleccionProductos.COCACOLA);
                    depCompra.setSeleccion(SeleccionProductos.COCACOLA);
                    numCocas-=1;
                    depCoca.setNumProductos(numCocas);

                }catch(PagoInsuficienteException e){
                    System.out.println(e.getMessage());
                }catch(PagoIncorrectoException e){
                    System.out.println(e.getMessage());
                }catch(NoHayProductoException e){
                    System.out.println(e.getMessage());
                }
                repaint();
            }
        });
        btnFanta.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e1){
                Moneda m = new Moneda1000();
                try{
                    exp.comprarProducto(m, SeleccionProductos.FANTA);
                    depCompra.setSeleccion(SeleccionProductos.FANTA);
                    numFantas-=1;
                    depFanta.setNumProductos(numFantas);

                }catch(PagoInsuficienteException e){
                    System.out.println(e.getMessage());
                }catch(PagoIncorrectoException e){
                    System.out.println(e.getMessage());
                }catch(NoHayProductoException e){
                    System.out.println(e.getMessage());
                }
                repaint();
            }
        });
        btnSnickers.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e1){
                Moneda m = new Moneda1000();
                try{
                    exp.comprarProducto(m, SeleccionProductos.SNICKERS);
                    depCompra.setSeleccion(SeleccionProductos.SNICKERS);
                    numSnickers-=1;
                    depSnickers.setNumProductos(numSnickers);

                }catch(PagoInsuficienteException e){
                    System.out.println(e.getMessage());
                }catch(PagoIncorrectoException e){
                    System.out.println(e.getMessage());
                }catch(NoHayProductoException e){
                    System.out.println(e.getMessage());
                }
                repaint();
            }
        });
        btnSuper8.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e1){
                Moneda m = new Moneda1000();
                try{
                    exp.comprarProducto(m, SeleccionProductos.SUPER8);
                    depCompra.setSeleccion(SeleccionProductos.SUPER8);
                    numSuper8-=1;
                    depSuper8.setNumProductos(numSuper8);

                }catch(PagoInsuficienteException e){
                    System.out.println(e.getMessage());
                }catch(PagoIncorrectoException e){
                    System.out.println(e.getMessage());
                }catch(NoHayProductoException e){
                    System.out.println(e.getMessage());
                }
                repaint();
            }
        });
    }
    public void clickDepCompra(){
        depCompra.setSeleccion(SeleccionProductos.NULO);
        repaint();
    }
}