package logica;

import logica.Dulce;

/**
 * Alimento dulce llamado logica.Snickers
 * @author Ricardo Charris
 * @author Vicente Ramirez
 */
public class Snickers extends Dulce {
    public Snickers(int serie){
        super(serie);
    }

    /**
     * Simula la accion de comer un logica.Snickers
     * @return String que indica que se consumio el logica.Snickers
     */
    public String consumir(){
        return "Me comi un logica.Snickers";
    }

    /**
     * Describe la clase
     * @return String con la descripcion de la clase logica.Snickers
     */
    @Override
    public String toString(){
        return "\nlogica.Dulce: logica.Snickers | Nro. Serie: "+getSerie();
    }
}
