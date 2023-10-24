/**
 * Clase que representa un producto
 * @author Ricardo Charris
 * @author Vicente Ramirez
 */
public abstract class Producto {
    /**Int que almacena el numero de serie del producto*/
    private int serie;
    public Producto(int serie){
        this.serie = serie;
    }

    /**
     * devuelve el numero de serie del producto
     * @return numero de serie del producto
     */
    public int getSerie(){
        return serie;
    }
    public abstract String consumir();

    /**
     *Describe la clase
     * @return String con la descripcion de la clase Producto
     */
    @Override
    public String toString(){
        return "\nArticulo con Nro. Serie: "+getSerie();
    }
}
