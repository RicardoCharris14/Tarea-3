package logica;

import logica.Expendedor;
import logica.Producto;

/**
 * clase que representa a un comprador
 * @author Ricardo Charris
 * @author Vicente Ramírez
 */
public class Comprador {
    /**
     * variable que guarda el producto que ha consumido el comprador
     */
    private String productoConsumido;
    /**
     * variable que guarda el vuelto de la compra
     */
    private int vuelto;

    /**
     * constructor de logica.Comprador que crea una instancia de logica.Producto, a la que le asigna el precio y su eleccion de acuerdo al enum de logica.SeleccionProductos,
     * si producto comprado existe, el producto es consumido, tambien calcula el vuelto del producto.
     * @param m recibe una moneda
     * @param eleccion hace referencia a los productos del enum
     * @param exp es una refencia a expendedor
     * @throws PagoInsuficienteException cuando el pago no satisface el precio total del producto lanza esta exception
     * @throws PagoIncorrectoException cuando se ingresa una moneda null lanza esta exception
     * @throws NoHayProductoException  cuando selecciona un producto inexistente lanza esta exception
     */
    public Comprador(Moneda m, SeleccionProductos eleccion, Expendedor exp) throws PagoInsuficienteException, PagoIncorrectoException, NoHayProductoException {
        vuelto = 0;
        productoConsumido = null;
        exp.comprarProducto(m, eleccion);
        Producto productoComprado = exp.getProducto();
        if(productoComprado != null) {
            productoConsumido = productoComprado.consumir();
        }
        Moneda tmp = exp.getVuelto();
        while(tmp != null){
            vuelto += tmp.getValor();
            tmp = exp.getVuelto();
        }
    }

    /**
     * metodo que guarda lo que va a consumir el comprador
     * @return devuelve el  producto que va a consumir
     */
    public String queConsumiste(){
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

