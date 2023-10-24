/**
 * Esta clase es un objeto de moneda de 100 que extiende de la clase moneda
 * @author Vicente Ramírez
 * @author Ricardo Charris
 */
public class Moneda100 extends Moneda {
    /**
     * constructor de moneda de 100
     */
    public Moneda100(){
        super();
    }

    /**
     * getter del valor de moneda
     * @return devuelve 100
     */
    public int getValor(){
        return 100;
    }

    /**
     * metodo toString de Moneda100
     * @return deuvelve Moneda100 en forma de string
     */

    @Override
    public String toString() {
        return "Moneda con valor de $100";
    }
}

