package logica;

/**
 * clase que representa a un comprador
 * @author Ricardo Charris
 * @author Vicente RamÃ­rez
 */
public class Comprador {
    /**
     * variable que guarda la moneda del comprador
     */
    private Moneda moneda;
    /**
     * variable que guarda el producto del comprador
     */
    private Producto productoComprado;
    /**
     * variable que guarda el vuelto de la compra
     */
    private int vuelto;

    /**
     * constructor de Comprador que inicializa las variables
     * @param moneda recibe una moneda
     */
    public Comprador(Moneda moneda) {
        vuelto = 0;
        productoComprado = null;
        this.moneda = moneda;
    }

    /**
     * Compra un producto en expendedor, el producto es consumido y se calcula el vuelto del producto.
     * @param exp expendedor en el que se realiza la compra
     * @param seleccion se usa para elegir el producto a comprar
     * @throws PagoInsuficienteException cuando el pago no satisface el precio total del producto lanza esta exception
     * @throws PagoIncorrectoException cuando se ingresa una moneda null o no valida lanza esta exception
     * @throws NoHayProductoException cuando selecciona un producto inexistente o agotado lanza esta exception
     */
    public void comprarProducto(Expendedor exp, SeleccionProductos seleccion) throws PagoInsuficienteException, PagoIncorrectoException, NoHayProductoException{
        exp.comprarProducto(moneda, seleccion);
        moneda = null;
        productoComprado = exp.getProducto();

        Moneda tmp = exp.getVuelto();
        while(tmp != null) {
            vuelto += tmp.getValor();
            tmp = exp.getVuelto();
        }
    }

    /**
     * consume el producto
     * @return retorna string sobre que producto se consumio
     */
    public String consumirProducto(){
        String productoConsumido = null;
        if(productoComprado != null) {
            productoConsumido = productoComprado.consumir();
        }
        return productoConsumido;
    }

    /**
     * getter de vuelto
     * @return devuelve vuelto
     */
    public int getVuelto(){
        return vuelto;
    }
}