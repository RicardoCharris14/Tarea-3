/**
 * Clase abstracta.
 * Familia de los alimentos de sabor dulce
 * @author Ricardo Charris
 * @author Vicente Ramirez
 */
public abstract class Dulce extends Producto {
    public Dulce(int serie){
        super(serie);
    }

    /**
     * Describe la clase
     * @return String que da una descripcion de la clase Dulce
     */
    @Override
    public String toString(){
        return "\nDulce con Nro. Serie: "+getSerie();
    }
}
