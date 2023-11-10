package logica;

/**
 * clase que representa a un comprador
 * @author Ricardo Charris
 * @author Vicente RamÃ­rez
 */
public class Comprador {
    /**
     * indica si el comprador compro algun producto
     */
    private Boolean hayProducto;
    /**
     * indica si es que se consumio el producto
     */
    private SeleccionProductos ProductoConsumido;
    /**
     * variable que guarda la moneda del comprador
     */
    private Moneda moneda;
    /**
     * variable que guarda el mensaje del producto comprado
     */
    private String msgProducto;
    /**
     * variable que guarda el vuelto de la compra
     */
    private int vuelto;

    /**
     * constructor de Comprador que inicializa las variables
     * @param moneda recibe una moneda
     */
    public Comprador(Moneda moneda) {
        hayProducto = false;
        ProductoConsumido = SeleccionProductos.NULO;
        vuelto = 0;
        msgProducto = null;
        this.moneda = moneda;
    }

    /**
     * Compra un producto en expendedor y se calcula el vuelto del producto.
     * @param exp expendedor en el que se realiza la compra
     * @param seleccion se usa para elegir el producto a comprar
     * @throws PagoInsuficienteException cuando el pago no satisface el precio total del producto lanza esta exception
     * @throws PagoIncorrectoException cuando se ingresa una moneda null o no valida lanza esta exception
     * @throws NoHayProductoException cuando selecciona un producto inexistente o agotado lanza esta exception
     */
    public void comprarProducto(Expendedor exp, SeleccionProductos seleccion) throws PagoInsuficienteException, PagoIncorrectoException, NoHayProductoException{
        exp.comprarProducto(moneda, seleccion);
        moneda = null;

        Moneda tmp = exp.getVuelto();
        while(tmp != null) {
            vuelto += tmp.getValor();
            tmp = exp.getVuelto();
        }
    }

    /**
     * retira el producto del expendedor, lo consume y guarda un mensaje sobre el producto
     */
    public void consumirProducto(Expendedor exp){
        Producto producto = exp.getProducto();
        if(producto != null) {
            msgProducto = producto.consumir();
        }
    }
    public Moneda getMoneda(){
        return moneda;
    }
    public int getVuelto(){
        int vueltoTmp = vuelto;
        vuelto = 0;
        return vueltoTmp;
    }
    public String getMsgProducto(){
        return msgProducto;
    }
    public SeleccionProductos getProductoConsumido(){
        return ProductoConsumido;
    }
    public void setProductoConsumido(SeleccionProductos productoConsumido){
        this.ProductoConsumido = productoConsumido;
    }
    public Boolean getHayProducto(){
        return hayProducto;
    }
    public void setHayProducto(Boolean hayProducto){
        this.hayProducto = hayProducto;
    }
}