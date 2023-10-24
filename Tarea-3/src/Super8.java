/**
 * Alimento dulce llamado Super8
 * @author Ricardo Charris
 * @author Vicente Ramirez
 */
public class Super8 extends Dulce {
    public Super8(int serie){
        super(serie);
    }

    /**
     * Simula que se comio el Super8
     * @return String que indica que ya se comio el Super8
     */
    public String consumir(){
        return "Me comi un Super8";
    }

    /**
     * Entrega una descripcion de la clase
     * @return String con la descripcion de la clase Super8
     */
    @Override
    public String toString(){
        return "\nDulce: Super8 | Nro. Serie: "+getSerie();
    }
}
