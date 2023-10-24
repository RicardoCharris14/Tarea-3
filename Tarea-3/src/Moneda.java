/**
 * Esta clase es abstracta, hereda las monedas e implementa la interfaz Comparable *
 * @author Vicente Ramírez
 * @author Ricardo Charris
 */

public abstract class Moneda  implements Comparable <Moneda>{
    /**
     * Metodo constructor de Moneda
     */
    public Moneda(){
    }
//REVISAR EL HASCODE DEL METODO
    /**
     *  obtiene el hashcode de moneda, lo transforma a hexadecimal y lo representa como un String
     *  @return devuelve el hashcode de la moneda
     */
    public String getSerie(){
        int hashCode = System.identityHashCode(this);
        String hexHashCode = Integer.toHexString(hashCode);
        return "0x"+hexHashCode;
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



