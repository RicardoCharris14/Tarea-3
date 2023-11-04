package logica;

/**
 * Esta clase es abstracta, hereda las monedas e implementa la interfaz Comparable *
 * @author Vicente Ramírez
 * @author Ricardo Charris
 */

public abstract class Moneda  implements Comparable <Moneda>{
    /**cuenta cuantas instancias hay de la clase*/
    private static int contador = 0;
    private int serie;
    /**
     * Metodo constructor de logica.Moneda
     */
    public Moneda(){
        contador += 1;
        serie = contador;
    }

    /**
     *  devuelve el numero de serie de la moneda
     *  @return devuelve el hashcode de la moneda
     */
    public int getSerie(){
        return serie;
    }



    /**
     * funcion abstracta que retorna el valor de la moneda
     * @return devuelve el valor de la moneda
     */
    public abstract int getValor();


    /**
     *  Metodo que compara el valor de las monedas
     * @param moneda Es el objeto comparado
     * @return devuelve 1, -1, 0 dependiendo el caso
     */
    public int compareTo(Moneda moneda){
        if(this.getValor() > moneda.getValor()){
            return 1;
        }
        else if (this.getValor() < moneda.getValor()){
                return -1;
        }
        else {
            return 0;
        }

    }

}



