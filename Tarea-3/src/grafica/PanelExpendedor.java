package grafica;
import logica.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/**
 * Clase que simula el panel de expendedor
 * @author Ricardo Charris
 * @author Vicente Ramirez
 */
public class PanelExpendedor extends JPanel {
    private Moneda moneda;
    private String msgProducto;
    private Expendedor exp;
    private SeleccionMonedas seleccionM;
    private SeleccionProductos seleccionProducto;
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
    private Image imMonedaDep;
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
    public void setMoneda(Moneda moneda){
        this.moneda = moneda;
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
     * dibuja el expendedor, los depositos de los productos,las lineas que dividen los depositos de cada producto, la
     * bandeja de salida de los productos, el espacio donde se ingresarán las monedas, el deposito donde se guardarán
     * las monedas recaudadas, tambien dibuja la moneda con la que se va a realizar la compra, ademas crea los botones
     * de los productos con sus respectivos precios y lanza los mensajes cuando ocurre una excepcion
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
        g.setColor(Color.WHITE);
        g.fillRect(357,335,106,41);
        g.setColor(Color.BLACK);
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
        //Deposito monedas
        g.setColor(Color.BLACK);
        g.fillRect(330,500,158,180);
        g.setColor(Color.WHITE);
        g.fillRect(335,505,148,170);
        int posXMonDep = 340;
        int posYMonDep = 510;
        int i =0;
        for(Moneda m : exp.getMonedasRecaudadas().getElementos()){
            if(i==9){
                i=0;
                posYMonDep+=14;
            }
            if(m instanceof Moneda100){
                imMonedaDep = new ImageIcon("src/grafica/imagenes/moneda100.png").getImage();
                g.drawImage(imMonedaDep,posXMonDep+i*14,posYMonDep,28,28,this);
            } else if (m instanceof Moneda500) {
                imMonedaDep = new ImageIcon("src/grafica/imagenes/moneda500.png").getImage();
                g.drawImage(imMonedaDep,posXMonDep+i*14,posYMonDep,28,28,this);
            } else if (m instanceof Moneda1000) {
                imMonedaDep = new ImageIcon("src/grafica/imagenes/moneda1000.png").getImage();
                g.drawImage(imMonedaDep,posXMonDep+i*14,posYMonDep,28,28,this);
            } else if (m instanceof Moneda5000) {
                imMonedaDep = new ImageIcon("src/grafica/imagenes/moneda5000.png").getImage();
                g.drawImage(imMonedaDep,posXMonDep+i*14,posYMonDep,28,28,this);
            }
            i+=1;
        }
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
        g.setColor(Color.CYAN);
        switch (seleccionM){
            case MONEDA100 -> {
                imMoneda = new ImageIcon("src/grafica/imagenes/moneda100.png").getImage();
                g.drawImage(imMoneda,420,400,76,76,this);
                g.drawString("Serie: "+moneda.getSerie(),440,395);
            }
            case MONEDA500 -> {
                imMoneda = new ImageIcon("src/grafica/imagenes/moneda500.png").getImage();
                g.drawImage(imMoneda,420,400,76,76,this);
                g.drawString("Serie: "+moneda.getSerie(),440,395);
            }
            case MONEDA1000 -> {
                imMoneda = new ImageIcon("src/grafica/imagenes/moneda1000.png").getImage();
                g.drawImage(imMoneda,420,400,76,76,this);
                g.drawString("Serie:"+moneda.getSerie(),440,395);
            }
            case MONEDA5000 -> {
                imMoneda = new ImageIcon("src/grafica/imagenes/moneda5000.png").getImage();
                g.drawImage(imMoneda,420,400,76,76,this);
                g.drawString("Serie:"+moneda.getSerie(),440,395);
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
     * Comprador compra una sprite en el expendedor, el expendedor guarda la sprite en el deposito de compra, descuenta
     * la cantidad de sprites que hay en el deposito de sprites y guarda en una variable la informacion de que se compro
     * una sprite, e indica que la moneda ya fue usada, todo esto ocurre si es que no se lanza ninguna excepción, si hay
     * alguna excepcion se guarda el mensaje en una variable y
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
                seleccionProducto = SeleccionProductos.SPRITE;
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
     * Comprador compra una coca cola en el expendedor, el expendedor guarda la coca cola en el deposito de compra,
     * descuenta la cantidad de Super8 que hay en el deposito de coca colas y guarda en una variable la informacion de
     * que se compro una coca cola, e indica que la moneda ya fue usada, todo esto ocurre si es que no se lanza ninguna
     * excepción, si hay alguna excepcion se guarda el mensaje en una variable y el expendedor retorna el vuelto
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
                seleccionProducto = SeleccionProductos.COCACOLA;
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
     * Comprador compra una fanta en el expendedor, el expendedor guarda la fanta en el deposito de compra, descuenta
     * la cantidad de fantas que hay en el deposito de Super8 y guarda en una variable la informacion de que se compro
     * una fanta, e indica que la moneda ya fue usada, todo esto ocurre si es que no se lanza ninguna excepción, si hay
     * alguna excepcion se guarda el mensaje en una variable y
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
                seleccionProducto = SeleccionProductos.FANTA;
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
     * Comprador compra un snickers en el expendedor, el expendedor guarda el snickers en el deposito de compra, descuenta
     * la cantidad de Snickers que hay en el deposito de Snickers y guarda en una variable la informacion de que se compro
     * un snickers, e indica que la moneda ya fue usada, todo esto ocurre si es que no se lanza ninguna excepción, si hay
     * alguna excepcion se guarda el mensaje en una variable y
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
                seleccionProducto = SeleccionProductos.SNICKERS;
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
     * Comprador compra un super8 en el expendedor, el expendedor guarda el super8 en el deposito de compra, descuenta
     * la cantidad de Super8 que hay en el deposito de Super8 y guarda en una variable la informacion de que se compro
     * un super8, e indica que la moneda ya fue usada, todo esto ocurre si es que no se lanza ninguna excepción, si hay
     * alguna excepcion se guarda el mensaje en una variable y
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
                seleccionProducto = SeleccionProductos.SUPER8;
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
     * el comprador retira el producto de la bandeja de salida del expendedor y guarda en una variable una constante con
     * el producto que retiro, se le aviso al deposito compra que no hay ningun producto en su interior y cambia la
     * constante seleccionProducto a NULO
     * @param comprador es el comprador que realiza la compra
     */
    public void clickDepCompra(Comprador comprador){
        comprador.consumirProducto(exp);
        depCompra.setSeleccion(SeleccionProductos.NULO);
        comprador.setProductoConsumido(seleccionProducto);
        seleccionProducto = SeleccionProductos.NULO;
        repaint();
    }

    /**
     *
     */
    public void clickMostradorExpendedor(){
        exp.rellenarDepositos(numProductos);
        depCoca.setNumProductos(numProductos);
        depSprite.setNumProductos(numProductos);
        depFanta.setNumProductos(numProductos);
        depSnickers.setNumProductos(numProductos);
        depSuper8.setNumProductos(numProductos);
        repaint();
    }
}