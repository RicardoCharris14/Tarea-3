package logica;

/**
 * clase que representa un bebestible
 * @author Ricardo Charris
 * @author Vicente Ramirez
 */
public abstract class Bebida extends Producto {
    public Bebida(int serie){
        super(serie);
    }

    /**
     * Da una descripcion de la clase
     * @return String que describe la clase logica.Bebida
     */
    @Override
    public String toString(){
        return "\nlogica.Bebida con Nro. Serie: "+getSerie();
    }

}
