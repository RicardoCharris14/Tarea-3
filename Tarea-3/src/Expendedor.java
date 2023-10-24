/**
 * clase que simula un expendedor de productos para consumir
 * @author Vicente Ramírez
 * @author Ricardo Charris
 */
public class Expendedor {
    /**
     * variable que crea un deposito donde guarda el tipo Cocacola
     */
    private Deposito<Cocacola> depositoCoca;
    /**
     * variable que crea un deposito donde guarda el tipo Sprite
     */
    private Deposito<Sprite> depositSprite;
    /**
     * variable que crea un deposito donde guarda el tipo Fanta
     */
    private Deposito<Fanta> depositoFanta;
    /**
     * variable que crea un deposito donde guarda el tipo Snickers
     */
    private Deposito<Snickers> depositoSnickers;
    /**
     * variable que crea un deposito donde guarda el tipo Super8
     */
    private Deposito<Super8> depositoSuper8;
    /**
     * variable que crea un deposito donde guarda las monedas
     */
    private Deposito<Moneda> monedas;

    /**
     * constructor de Expendedor que crea instancias para cada producto y
     * crea un objeto del tipo de producto seleccionado segun su numero de serie
     * @param numProducto indica el numero del producto que se desea comprar
     */

    public Expendedor(int numProducto) {
        depositoCoca = new Deposito<>();
        depositSprite = new Deposito<>();
        depositoFanta = new Deposito<>();
        depositoSuper8 = new Deposito<>();
        depositoSnickers = new Deposito<>();
        monedas = new Deposito<>();

        for (int i = 0; i < numProducto; i++) {
            Cocacola bebida1  = new Cocacola(100 + i);
            depositoCoca.addElemento(bebida1);
            Sprite bebida2 = new Sprite(200 + i);
            depositSprite.addElemento(bebida2);
            Fanta bebida3 = new Fanta(300  + i);
            depositoFanta.addElemento(bebida3);
            Snickers dulce1 = new Snickers(400 + i);
            depositoSnickers.addElemento(dulce1);
            Super8 dulce2 = new Super8(500 + i);
            depositoSuper8.addElemento(dulce2);
        }
        System.out.println("EXPENDEDOR CREADO\n\nPrecios de los productos:\n-CocaCola: $"+SeleccionProductos.Cocacola.getPrecio()+
                "\n-Sprite: $"+SeleccionProductos.Sprite.getPrecio()+"\n-Fanta: $"+SeleccionProductos.Fanta.getPrecio()+
                "\n-Snickers: $"+SeleccionProductos.Snickers.getPrecio()+"\n-Super8: $"+SeleccionProductos.Super8.getPrecio()+
                "\n\nHay "+numProducto+" unidades de cada producto.");
    }
    public Moneda getMoneda(){
        return monedas.getElemento();
    }

    /**
     * Esta funcion resuelve la parte logica al momento de comprar un producto evuluando las siguientes posibilidades:
     * 1) Si la moneda es nula, lanza una exception
     * 2) Si el valor de la moneda es distinto de los valores requeridos
     * 3) Si el valor de la moneda es mayor que el precio del producto, para crear instancia del producto seleccionado, si no existe el producto lanza una exception
     * 4) Si el producto no es nulo, calcula el vuelto en monedas de 100 y los guarda en una variable. Si es nulo lanza una exception
     * 5) Si finalmente se cumplen todas las condiciones bien, retorna el producto
     * 6) Si el valor de la moneda es menor que el precio del producto, lanza una exception
     *
     * @param m recibe la moneda que ingresa el comprador
     * @param n_producto recibe la seleccion del producto de la maquina expendedora
     * @return devuelve el producto si cumple con las condiciones del metodo
     */

    public Producto comprarProducto(Moneda m, SeleccionProductos n_producto )throws PagoInsuficienteException, PagoIncorrectoException, NoHayProductoException{
        if (m==null){
            throw new PagoIncorrectoException("\nNo se ha ingresado una moneda.\n");
        }
        if (m.getValor()!= 100 && m.getValor()!= 500 && m.getValor()!=1000) {
            monedas.addElemento(m);
            return null;
        }
        else if(m.getValor()>=n_producto.getPrecio()){
            Producto producto1;
            switch(n_producto) {
                case Cocacola:
                    producto1 = depositoCoca.getElemento();
                    break;
                case Sprite:
                    producto1 = depositSprite.getElemento();
                    break;
                case Fanta:
                    producto1 = depositoFanta.getElemento();
                    break;
                case Snickers:
                    producto1 = depositoSnickers.getElemento();
                    break;
                case Super8:
                    producto1 = depositoSuper8.getElemento();
                    break;
                default:
                    monedas.addElemento(m);
                    throw new  NoHayProductoException("\nSeleccion de producto invalida.\n");

            }

            if(producto1 != null){
                int NumMonedas=(m.getValor()-n_producto.getPrecio())/100;
                for(int i=0;i<NumMonedas;i++) {
                    Moneda moneda = new Moneda100();
                    monedas.addElemento(moneda);
                }
            }
             else{
                System.out.println(m.getValor());
                 monedas.addElemento(m);
                 throw new NoHayProductoException("\nNo hay disponibilidad del producto que se solicitó.\n");

            }
            return producto1;
        }
        else{
            monedas.addElemento(m);
            throw new PagoInsuficienteException("\nEl monto ingresado es insuficiente.\n");
        }

    }

    /**
     * metodo que encapsula al vuelto
     * @return devuelve vuelto en monedas de 100
     */
    public Moneda getVuelto() {
        return monedas.getElemento();
    }

    /**
     * metodo toString de Expendedor
     * @return devuelve en forma de string las propiedades de Expendedor de forma mas legible
     */

    @Override
    public String toString() {
        return "Expendedor tiene las siguientes propiedades: " + "\ndepositoCoca=" + depositoCoca +  "\ndepositoSprite=" + depositSprite + "\ndepositoFanta=" + depositoFanta + "\ndepositoSnickers=" + depositoSnickers +
                "\ndepositoSuper8=" + depositoSuper8 + "\nmonedas=" + monedas;
    }
}


