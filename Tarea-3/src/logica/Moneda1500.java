package logica;

import logica.Moneda;

/**
 * Esta clase es un objeto de moneda de 1500 que extiende de la clase moneda
 * @author Vicente Ramírez
 * @author Ricardo Charris
 */
public class Moneda1500 extends Moneda {
    /**
     * constructor de moneda de 1500
     */
    public Moneda1500(){
        super();
    }

    /**
     * getter del valor de moneda
     * @return devuelve 1500
     */
    public int getValor(){
        return 1500;
    }

    /**
     * metodo toString de logica.Moneda1500
     * @return deuvelve logica.Moneda1500 en forma de string
     */
    @Override
    public String toString() {
        return "logica.Moneda con valor de $1500";
    }
}
