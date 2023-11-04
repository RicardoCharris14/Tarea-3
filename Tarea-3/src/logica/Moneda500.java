package logica;

import logica.Moneda;

/**
 * Esta clase es un objeto de moneda de 500 que extiende de la clase moneda
 * @author Vicente Ramírez
 * @author Ricardo Charris
 */
public class Moneda500 extends Moneda {
    /**
     * constructor de moneda de 500
     */
    public Moneda500(){
        super();
    }

    /**
     * getter del valor de moneda
     * @return devuelve 500
     */
    public int getValor(){
        return 500;
    }

    /**
     * metodo toString de logica.Moneda500
     * @return deuvelve logica.Moneda500 en forma de string
     */
    @Override
    public String toString() {
        return "logica.Moneda con valor de $500";
    }
}
