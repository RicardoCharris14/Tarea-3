/**
 * Esta clase es un objeto de moneda de 1000 que extiende la clase moneda
 * @author Vicente Ramírez
 * @author Ricardo Charris
 */
public class Moneda1000 extends Moneda{
    /**
     * constructor de moneda de 1000
     */
    public Moneda1000(){
        super();
    }
    /**
     * getter del valor de moneda
     * @return devuelve 1000
     */
    public int getValor(){
        return 1000;
    }

    /**
     * metodo toString de Moneda1000
     * @return deuvelve Moneda1000 en forma de string
     */

    @Override
    public String toString() {
        return "Moneda con valor de $1000";
    }
}
