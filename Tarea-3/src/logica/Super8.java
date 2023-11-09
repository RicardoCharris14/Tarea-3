package logica;

import logica.Dulce;

/**
 * Alimento dulce llamado logica.Super8
 * @author Ricardo Charris
 * @author Vicente Ramirez
 */
public class Super8 extends Dulce {
    public Super8(int serie){
        super(serie);
    }

    /**
     * Simula que se comio el logica.Super8
     * @return String que indica que ya se comio el logica.Super8
     */
    public String consumir(){
        return "El Super8 es dulce no como el corazon de Ella";
    }

    /**
     * Entrega una descripcion de la clase
     * @return String con la descripcion de la clase logica.Super8
     */
    @Override
    public String toString(){
        return "\nlogica.Dulce: logica.Super8 | Nro. Serie: "+getSerie();
    }
}
