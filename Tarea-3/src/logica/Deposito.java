package logica;

import java.util.ArrayList;

/**
 * logica.Deposito que guarda varios productos de un solo tipo
 * @param <T> indica que clase de objeto contendra el deposito
 * @author Ricardo Charris
 * @author Vicente Ramirez
 */
public class Deposito<T> {
    /**guarda varios productos del tipo T */
    private ArrayList<T> elementos;
    public Deposito(){
        elementos = new ArrayList<>();
    }

    /**
     * Añade un objeto del tipo T al ArrayList de productos
     * @param item objeto que sera añadido al ArrayList productos
     */
    public void addElemento(T item){
        elementos.add(item);
    }

    /**
     * Saca un producto del ArrayList productos y lo devuelve
     * @return objeto de tipo T del ArrayList productos
     */
    public T getElemento(){
        if(elementos.isEmpty()){
            return null;
        }
        else{
            return elementos.remove(0);
        }
    }

    /**
     * Describe la clase DepositoProducto
     * @return String que da una descripcion de la clase
     */
    public String toString(){
        return "\nlogica.Deposito que contiene objetos de tipo T";
    }


}
