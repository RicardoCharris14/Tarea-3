package logica;

/**
 * Esta clase es un objeto de moneda de 5000 que extiende de la clase moneda
 * @author Vicente Ramírez
 * @author Ricardo Charris
 */
public class Moneda5000 extends Moneda {
    /**
     * constructor de moneda de 5000
     */
    public Moneda5000(){
        super();
    }

    /**
     * getter del valor de moneda
     * @return devuelve 5000
     */
    public int getValor(){
        return 5000;
    }

    /**
     * metodo toString de logica.Moneda5000
     * @return deuvelve logica.Moneda5000 en forma de string
     */
    @Override
    public String toString() {
        return "logica.Moneda con valor de $1500";
    }
}
