/**
 * Bebida gaseosa llamada Fanta
 * @author Ricardo Charris
 * @author Vicente Ramirez
 */
public class Fanta extends Bebida{
    public Fanta(int serie){
        super(serie);
    }

    /**
     * Simula el consumo de una fanta
     * @return String que indica que se bebio una fanta
     */
    public String consumir(){
        return "Me bebi una fanta";
    }

    /**
     * Describe la clase
     * @return String con la descripcion de la clase Fanta
     */
    @Override
    public String toString(){
        return "\nBebida: Fanta | Nro. Serie: "+getSerie();
    }
}
