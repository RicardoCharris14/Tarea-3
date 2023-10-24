/**
 * Enumeracion que contiene los productos y sus precios.
 * @author Ricardo Charris
 * @author Vicente Ramirez
 */
public enum SeleccionProductos {
    /**Constantes que hacen alucion a los diferentes productos*/
    Sprite(1000),Cocacola(400),Fanta(300),Snickers(100),Super8(200),Pinguino(500);
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
