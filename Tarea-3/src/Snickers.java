/**
 * Alimento dulce llamado Snickers
 * @author Ricardo Charris
 * @author Vicente Ramirez
 */
public class Snickers extends Dulce {
    public Snickers(int serie){
        super(serie);
    }

    /**
     * Simula la accion de comer un Snickers
     * @return String que indica que se consumio el Snickers
     */
    public String consumir(){
        return "Me comi un Snickers";
    }

    /**
     * Describe la clase
     * @return String con la descripcion de la clase Snickers
     */
    @Override
    public String toString(){
        return "\nDulce: Snickers | Nro. Serie: "+getSerie();
    }
}
