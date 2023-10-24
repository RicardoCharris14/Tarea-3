public class Main {
    public static void main(String[] args) {
        Deposito<Moneda> deposito1 = new Deposito<>();
        System.out.println(deposito1.toString());


        Expendedor expe = new Expendedor(5);
        Moneda m = null;
        Comprador comprador = null;

        //compras de todos los productos que se efectua correctamente
        System.out.println("\nCompra de una CocaCola con $500: ");
        m = new Moneda500();
        try {
            comprador = new Comprador(m, SeleccionProductos.Cocacola, expe);
        } catch (PagoIncorrectoException e) {
            System.out.println(e.getMessage());
        } catch (PagoInsuficienteException e) {
            System.out.println(e.getMessage());
        } catch (NoHayProductoException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(comprador.queConsumiste() + ", mi vuelto fue de $" + comprador.getVuelto());


        System.out.println("\nCompra de una Sprite con $1000: ");
        m= new Moneda1000();
        try {
            comprador = new Comprador(m, SeleccionProductos.Sprite, expe);
        } catch (PagoIncorrectoException e) {
            System.out.println(e.getMessage());
        } catch (PagoInsuficienteException e) {
            System.out.println(e.getMessage());
        } catch (NoHayProductoException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(comprador.queConsumiste() + ", mi vuelto fue de $" + comprador.getVuelto());


        System.out.println("\nCompra de una Fanta con $500: ");
        m = new Moneda500();
        try {
            comprador = new Comprador(m, SeleccionProductos.Fanta, expe);
        } catch (PagoIncorrectoException e) {
            System.out.println(e.getMessage());
        } catch (PagoInsuficienteException e) {
            System.out.println(e.getMessage());
        } catch (NoHayProductoException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(comprador.queConsumiste() + ", mi vuelto fue de $" + comprador.getVuelto());


        System.out.println("\nCompra de un Snickers con $100: ");
        m= new Moneda100();
        try {
            comprador = new Comprador(m, SeleccionProductos.Snickers, expe);
        } catch (PagoIncorrectoException e) {
            System.out.println(e.getMessage());
        } catch (PagoInsuficienteException e) {
            System.out.println(e.getMessage());
        } catch (NoHayProductoException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(comprador.queConsumiste() + ", mi vuelto fue de $" + comprador.getVuelto());


        System.out.println("\nCompra de un Super8 con $500: ");
        m= new Moneda500();
        try {
            comprador = new Comprador(m, SeleccionProductos.Super8, expe);
        } catch (PagoIncorrectoException e) {
            System.out.println(e.getMessage());
        } catch (PagoInsuficienteException e) {
            System.out.println(e.getMessage());
        } catch (NoHayProductoException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(comprador.queConsumiste() + ", mi vuelto fue de $" + comprador.getVuelto());


        //Compra tal que el producto esta agotado
        System.out.println("\nCompra de una Cocacola con $500: \n");
        Expendedor exp1 = new Expendedor(0);
        m = new Moneda500();
        try {
            comprador = new Comprador(m, SeleccionProductos.Cocacola, exp1);
        } catch (PagoIncorrectoException e) {
            System.out.println(e.getMessage());
        } catch (PagoInsuficienteException e) {
            System.out.println(e.getMessage());
        } catch (NoHayProductoException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("No quedaban CocaColas.");
        exp1.getMoneda();


        //compra con seleccion de un producto inexistente
        System.out.println("\nCompra de un Pinguino con $1000: ");
        m = new Moneda1000();
        try {
            comprador = new Comprador(m, SeleccionProductos.Pinguino, expe);
        } catch (PagoIncorrectoException e) {
            System.out.println(e.getMessage());
        } catch (PagoInsuficienteException e) {
            System.out.println(e.getMessage());
        } catch (NoHayProductoException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("No vendian pinguinos.");
        exp1.getMoneda();

        //Intento de compra sin moneda
        System.out.println("\nRobo de una Sprite: ");
        m = null;
        try {
            comprador = new Comprador(m, SeleccionProductos.Sprite, expe);
        } catch (PagoIncorrectoException e) {
            System.out.println(e.getMessage());
        } catch (PagoInsuficienteException e) {
            System.out.println(e.getMessage());
        } catch (NoHayProductoException e) {
            System.out.println(e.getMessage());
        }

        //Compra con moneda no valida
        System.out.println("\nCompra de un Snickers con moneda Boliviana: ");
        m = new Moneda1500();
        try {
            comprador = new Comprador(m, SeleccionProductos.Snickers, expe);
        } catch (PagoIncorrectoException e) {
            System.out.println(e.getMessage());
        } catch (PagoInsuficienteException e) {
            System.out.println(e.getMessage());
        } catch (NoHayProductoException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Falta de inclusion en este pais, no aceptan monedas extranjeras.");
        exp1.getMoneda();

        //Compra con menos dinero del valor del producto
        System.out.println("\nPersona en situacion de calle intenta comprar un Super8: ");
        m = new Moneda100();
        try {
            comprador = new Comprador(m, SeleccionProductos.Super8, expe);
        } catch (PagoIncorrectoException e) {
            System.out.println(e.getMessage());
        } catch (PagoInsuficienteException e) {
            System.out.println(e.getMessage());
        } catch (NoHayProductoException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Falta de valores en esta tienda, cero empatia con el projimo.");
        exp1.getMoneda();

        //Impresion del numero de serie de una moneda
        Moneda moneda100 = new Moneda100();
        System.out.println("\nMoneda de 100 pesos con numero de serie: "+moneda100.getSerie());

    }
}