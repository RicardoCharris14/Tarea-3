/**
 * Bebida gaseosa llamada Sprite
 */
public class Sprite extends Bebida{
    public Sprite(int serie){
        super(serie);
    }

    /**
     * Simula la accion de beber una sprite
     * @return String que indica que se bebio la sprite
     */
    public String consumir(){
        return "Me bebi una sprite";
    }

    /**
     * Describe la clase
     * @return String con la descripcion de la clase Sprite
     */
    @Override
    public String toString(){
        return "\nBebida: Sprite | Nro. Serie: "+getSerie();
    }
}
