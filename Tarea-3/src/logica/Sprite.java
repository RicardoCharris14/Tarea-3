package logica;

import logica.Bebida;

/**
 * logica.Bebida gaseosa llamada logica.Sprite
 */
public class Sprite extends Bebida {
    public Sprite(int serie){
        super(serie);
    }

    /**
     * Simula la accion de beber una sprite
     * @return String que indica que se bebio la sprite
     */
    public String consumir(){
        return "La Sprite es la mejor bebida del mundo";
    }

    /**
     * Describe la clase
     * @return String con la descripcion de la clase logica.Sprite
     */
    @Override
    public String toString(){
        return "\nlogica.Bebida: logica.Sprite | Nro. Serie: "+getSerie();
    }
}
