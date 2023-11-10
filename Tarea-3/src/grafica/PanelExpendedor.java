package grafica;
import logica.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
/**
 * Clase que simula el panel de expendedor
 * @author Ricardo Charris
 * @author Vicente Ramirez
 */
public class PanelExpendedor extends JPanel {
    private String msgProducto;
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
    private JTextArea etiquetaExcepciones;
    private final int numProductos = 5;
    private int numSprites = numProductos;
    private int numCocas = numProductos;
    private int numFantas = numProductos;
    private int numSnickers = numProductos;
    private int numSuper8 = numProductos;
    private JLabel txtPrecioSprite;
    private JLabel txtPrecioCocacola;
    private JLabel txtPrecioFanta;
    private JLabel txtPrecioSnickers;
    private JLabel txtPrecioSuper8;

    /**
     * Constructor que instancia el expendedor con la cantidad de productos, instancia los depositos de productos y de compra, inicializa las imagenes de los productos,
     * instancia los botones y añade el texto de los precios
     */
    public PanelExpendedor() {
        msgProducto = null;
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
        txtPrecioSprite = new JLabel("$1000");
        txtPrecioCocacola = new JLabel("$400");
        txtPrecioFanta = new JLabel("$300");
        txtPrecioSnickers = new JLabel  ("$100");
        txtPrecioSuper8 = new JLabel("$200");
        etiquetaExcepciones = new JTextArea();
        etiquetaExcepciones.setVisible(false);

        this.add(etiquetaExcepciones);
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
        this.add(txtEntradaM);
        this.add(txtPrecioSprite);
        this.add(txtPrecioCocacola);
        this.add(txtPrecioFanta);
        this.add(txtPrecioSnickers);
        this.add(txtPrecioSuper8);

        this.setLayout(null);
        setBackground(Color.cyan);
    }
    /**
     * Método que añade al  boton Sprite un ActionListener
     * @param actionListener ActionListener que se traspasa desde panel principal
     */
    public void setActionBtnSprite(ActionListener actionListener){
        btnSprite.addActionListener(actionListener);
    }
    /**
     * Método que añade al  boton Coca un ActionListener
     * @param actionListener ActionListener que se traspasa desde panel principal
     */
    public void setActionBtnCoca(ActionListener actionListener){
        btnCoca.addActionListener(actionListener);
    }
    /**
     * Método que añade al  boton Fanta un ActionListener
     * @param actionListener ActionListener que se traspasa desde panel principal
     */
    public void setActionBtnFanta(ActionListener actionListener){
        btnFanta.addActionListener(actionListener);
    }
    /**
     * Método que añade al  boton Snickers un ActionListener
     * @param actionListener ActionListener que se traspasa desde panel principal
     */
    public void setActionBtnSnickers(ActionListener actionListener){
        btnSnickers.addActionListener(actionListener);
    }
    /**
     * Método que añade al  boton Super8 un ActionListener
     * @param actionListener ActionListener que se traspasa desde panel principal
     */
    public void setActionBtnSuper8(ActionListener actionListener){
        btnSuper8.addActionListener(actionListener);
    }
    /**
     * metodo que establece las medidas de los depositos, dibuja el expendedor con sus medidas, tambien dibuja
     * las lineas que dividen al expendedor entre cada producto, establece el estante y la bandeja de salida de
     * los productos, tambien dibuja el espacio donde se ingresarán las monedas, dibuja los iconos de los productos con
     * sus respectivos precios y permite la interaccion entre los distintos tipos de monedas a la hora de comprar
     * @param g the <code>Graphics</code> object to protect
     */
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

        //precios monedas
        txtPrecioSprite.setBounds(347,15,ladoBtn,20);
        txtPrecioSprite.setForeground(Color.BLACK);

        txtPrecioCocacola.setBounds(437,15,ladoBtn,20);
        txtPrecioCocacola.setForeground(Color.BLACK);

        txtPrecioFanta.setBounds(347,125,ladoBtn,20);
        txtPrecioFanta.setForeground(Color.BLACK);

        txtPrecioSnickers.setBounds(447,125,ladoBtn,20);
        txtPrecioSnickers.setForeground(Color.BLACK);

        txtPrecioSuper8.setBounds(397,230,ladoBtn,20);
        txtPrecioSuper8.setForeground(Color.BLACK);

        //boton sprite
        btnSprite.setBounds(327, 35, ladoBtn, ladoBtn);
        btnSprite.setFocusPainted(false);
        Icon a = new ImageIcon(imSprite.getImage().getScaledInstance(ladoBtn, ladoBtn, Image.SCALE_DEFAULT));
        btnSprite.setIcon(a);
        //boton Cocacola
        btnCoca.setBounds(417, 35, ladoBtn, ladoBtn);
        btnCoca.setFocusPainted(false);
        Icon b = new ImageIcon(imCoca.getImage().getScaledInstance(ladoBtn, ladoBtn, Image.SCALE_DEFAULT));
        btnCoca.setIcon(b);
        //boton fanta
        btnFanta.setBounds(327, 145, ladoBtn, ladoBtn);
        btnFanta.setFocusPainted(false);
        Icon c = new ImageIcon(imFanta.getImage().getScaledInstance(ladoBtn, ladoBtn, Image.SCALE_DEFAULT));
        btnFanta.setIcon(c);
        //boton Snickers
        btnSnickers.setBounds(417, 145, ladoBtn, ladoBtn);
        btnSnickers.setFocusPainted(false);
        Icon d = new ImageIcon(imSnickers.getImage().getScaledInstance(ladoBtn, ladoBtn, Image.SCALE_DEFAULT));
        btnSnickers.setIcon(d);
        //boton Super8
        btnSuper8.setBounds(372, 250, ladoBtn, ladoBtn);
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
        //msg de excepciones
        if(msgProducto!=null){
            etiquetaExcepciones.setText(msgProducto);
            etiquetaExcepciones.setBounds(15,getHeight()/3,300,130);
            etiquetaExcepciones.setOpaque(true);
            etiquetaExcepciones.setBackground(Color.RED);
            etiquetaExcepciones.setForeground(Color.WHITE);
            etiquetaExcepciones.setVisible(true);
            etiquetaExcepciones.setFont(new Font("Arial", Font.BOLD, 25));
            etiquetaExcepciones.setMargin(new Insets(10, 20, 10, 20));

            Timer temporizador = new Timer(2000,e1 -> {
                etiquetaExcepciones.setVisible(false);
                msgProducto = null;
            });
            temporizador.setRepeats(false);
            temporizador.start();
        }
    }
    /**
     * setter de SeleccionM
     * @param seleccionM es una constante del Enum SeleccionMonedas
     */
    public void setSeleccionM(SeleccionMonedas seleccionM){
        this.seleccionM = seleccionM;
    }
    /**
     * Comprador compra un producto en el expendedor, le indica al deposito compra que se compro una Sprite, descuenta
     * la cantidad de Sprites que hay en el deposito de Sprites e indica que la moneda ya fue usada, todo esto
     * ocurre si es que no se lanza ninguna excepción, si hay alguna excepcion se guarda el mensaje en una variable y
     * el expendedor retorna el vuelto
     * @param comprador es una referencia a comprador
     */
    public void eventoBtnSprite(Comprador comprador){
        try{
            if(comprador!=null){
                comprador.comprarProducto(exp, SeleccionProductos.SPRITE);
                depCompra.setSeleccion(SeleccionProductos.SPRITE);
                numSprites-=1;
                depSprite.setNumProductos(numSprites);
                setSeleccionM(SeleccionMonedas.NULO);
                comprador.setHayProducto(true);
                comprador.setProductoConsumido(SeleccionProductos.SPRITE);
            }
            else{
                msgProducto = "\nNo se ha ingresado\nuna moneda";
            }

        }catch(PagoInsuficienteException e){
            msgProducto = e.getMessage();
            exp.getVuelto();
        }catch(PagoIncorrectoException e){
            msgProducto = e.getMessage();
            exp.getVuelto();
        }catch(NoHayProductoException e){
            msgProducto = e.getMessage();
            exp.getVuelto();
        }
        repaint();
    }
    /**
     * Comprador compra un producto en el expendedor, le indica al deposito compra que se compro una Cocacola, descuenta
     * la cantidad de Cocacolas que hay en el deposito de Cocacolas e indica que la moneda ya fue usada, todo esto
     * ocurre si es que no se lanza ninguna excepción, si hay alguna excepcion se guarda el mensaje en una variable y
     * el expendedor retorna el vuelto
     * @param comprador es una referencia a comprador
     */
    public void eventoBtnCoca(Comprador comprador){
        try{
            if(comprador!=null){
                comprador.comprarProducto(exp, SeleccionProductos.COCACOLA);
                depCompra.setSeleccion(SeleccionProductos.COCACOLA);
                numCocas-=1;
                depCoca.setNumProductos(numCocas);
                setSeleccionM(SeleccionMonedas.NULO);
                comprador.setHayProducto(true);
                comprador.setProductoConsumido(SeleccionProductos.COCACOLA);
            }
            else{
                msgProducto = "\nNo se ha ingresado\n una moneda";
            }

        }catch(PagoInsuficienteException e){
            msgProducto = e.getMessage();
            exp.getVuelto();
        }catch(PagoIncorrectoException e){
            msgProducto = e.getMessage();
            exp.getVuelto();
        }catch(NoHayProductoException e){
            msgProducto = e.getMessage();
            exp.getVuelto();
        }
        repaint();
    }
    /**
     * Comprador compra un producto en el expendedor, le indica al deposito compra que se compro una Fanta, descuenta
     * la cantidad de Fantas que hay en el deposito de Fantas e indica que la moneda ya fue usada, todo esto
     * ocurre si es que no se lanza ninguna excepción, si hay alguna excepcion se guarda el mensaje en una variable y
     * el expendedor retorna el vuelto
     * @param comprador es una referencia a comprador
     */
    public void eventoBtnFanta(Comprador comprador){
        try{
            if(comprador!=null){
                comprador.comprarProducto(exp, SeleccionProductos.FANTA);
                depCompra.setSeleccion(SeleccionProductos.FANTA);
                numFantas-=1;
                depFanta.setNumProductos(numFantas);
                setSeleccionM(SeleccionMonedas.NULO);
                comprador.setHayProducto(true);
                comprador.setProductoConsumido(SeleccionProductos.FANTA);
            }
            else{
                msgProducto = "\nNo se ha ingresado\n una moneda";
            }

        }catch(PagoInsuficienteException e){
            msgProducto = e.getMessage();
            exp.getVuelto();
        }catch(PagoIncorrectoException e){
            msgProducto = e.getMessage();
            exp.getVuelto();
        }catch(NoHayProductoException e){
            msgProducto = e.getMessage();
            exp.getVuelto();
        }
        repaint();
    }
    /**
     * Comprador compra un producto en el expendedor, le indica al deposito compra que se compro un Snicker, descuenta
     * la cantidad de Snickers que hay en el deposito de Snickers e indica que la moneda ya fue usada, todo esto
     * ocurre si es que no se lanza ninguna excepción, si hay alguna excepcion se guarda el mensaje en una variable y
     * el expendedor retorna el vuelto
     * @param comprador es una referencia a comprador
     */
    public void eventoBtnSnickers(Comprador comprador){
        try{
            if(comprador!=null){
                comprador.comprarProducto(exp, SeleccionProductos.SNICKERS);
                depCompra.setSeleccion(SeleccionProductos.SNICKERS);
                numSnickers-=1;
                depSnickers.setNumProductos(numSnickers);
                setSeleccionM(SeleccionMonedas.NULO);
                comprador.setHayProducto(true);
                comprador.setProductoConsumido(SeleccionProductos.SNICKERS);
            }

            else{
                msgProducto = "\nNo se ha ingresado\n una moneda";
            }

        }catch(PagoInsuficienteException e){
            msgProducto = e.getMessage();
            exp.getVuelto();
        }catch(PagoIncorrectoException e){
            msgProducto = e.getMessage();
            exp.getVuelto();
        }catch(NoHayProductoException e){
            msgProducto = e.getMessage();
            exp.getVuelto();
        }
        repaint();
    }
    /**
     * Comprador compra un producto en el expendedor, le indica al deposito compra que se compro un Super8, descuenta
     * la cantidad de Super8 que hay en el deposito de Super8 e indica que la moneda ya fue usada, todo esto
     * ocurre si es que no se lanza ninguna excepción, si hay alguna excepcion se guarda el mensaje en una variable y
     * el expendedor retorna el vuelto
     * @param comprador es una referencia a comprador
     */
    public void eventoBtnSuper8(Comprador comprador){
        try{
            if(comprador!=null){
                comprador.comprarProducto(exp, SeleccionProductos.SUPER8);
                depCompra.setSeleccion(SeleccionProductos.SUPER8);
                numSuper8-=1;
                depSuper8.setNumProductos(numSuper8);
                setSeleccionM(SeleccionMonedas.NULO);
                comprador.setHayProducto(true);
                comprador.setProductoConsumido(SeleccionProductos.SUPER8);
            }
            else{
                msgProducto = "\nNo se ha ingresado\n una moneda";
            }

        }catch(PagoInsuficienteException e){
            msgProducto = e.getMessage();
            exp.getVuelto();
        }catch(PagoIncorrectoException e){
            msgProducto = e.getMessage();
            exp.getVuelto();
        }catch(NoHayProductoException e){
            msgProducto = e.getMessage();
            exp.getVuelto();
        }
        repaint();
    }

    /**
     *
     * @param comprador
     */
    public void clickDepCompra(Comprador comprador){
        comprador.consumirProducto(exp);
        depCompra.setSeleccion(SeleccionProductos.NULO);
        repaint();
    }
}