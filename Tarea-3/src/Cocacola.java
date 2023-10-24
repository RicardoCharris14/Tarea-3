/**
 * Bebida gaseosa llamada CocaCola
 * @author Ricardo Charris
 * @author Vicente Ramirez
 */
public class Cocacola extends Bebida{
    public Cocacola(int serie){
        super(serie);
    }

    /**
     * simula que se consume una CocaCola
     * @return String que indica que se bebio una CocaCola
     */
    public String consumir(){
        return "Me bebi una cocacola";
    }

    /**
     * Describe la clase CocaCola
     * @return String con la descripcion de la clase CocaCola
     */
    @Override
    public String toString(){
        return "\nBebida: CocaCola | Nro. Serie: "+getSerie();
    }


}
