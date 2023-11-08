package logica;

/**
 * Enumeracion que contiene los productos y sus precios.
 * @author Ricardo Charris
 * @author Vicente Ramirez
 */
public enum SeleccionProductos {
    /**Constantes que hacen alucion a los diferentes productos*/
    SPRITE(1000),COCACOLA(400),FANTA(300),SNICKERS(100),SUPER8(200),PINGUINO(500), NULO (0);
    /**Guarda el precio de cada constante*/
    private final int precio;
    SeleccionProductos(int precio){
        this.precio = precio;
    }

    /**
     * retorna el valor de la variable precio
     * @return Entero con el valor de la variable precio
     */
    public int getPrecio(){
        return precio;
    }
}
