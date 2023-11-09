import logica.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompradorTest {

    @Test
    void TestCompraCorrecta() {
        String comprobacion = null;
        Moneda m1 = new Moneda500();
        Expendedor exp1 = new Expendedor(3);
        Comprador comprador = null;
        try{
            comprador = new Comprador(m1, SeleccionProductos.COCACOLA, exp1);
        }catch(PagoInsuficienteException e){
            comprobacion = e.getMessage();
        }catch(PagoIncorrectoException e){
            comprobacion = e.getMessage();
        }catch(NoHayProductoException e){
            comprobacion = e.getMessage();
        }
        assertEquals(100,comprador.getVuelto());
        assertEquals("Me bebi una cocacola", comprador.queConsumiste());
    }

    @Test
    void TestMonedaNull() {
        String comprobacion = null;
        Moneda m1 = null;
        Expendedor exp1 = new Expendedor(3);
        Comprador comprador = null;
        try{
            comprador = new Comprador(m1, SeleccionProductos.SNICKERS, exp1);
        }catch(PagoInsuficienteException e){
            comprobacion = e.getMessage();
        }catch(PagoIncorrectoException e){
            comprobacion = e.getMessage();
        }catch(NoHayProductoException e){
            comprobacion = e.getMessage();
        }
        assertEquals("\nNo se ha ingresado una moneda.",comprobacion);
    }
    @Test
    void TestPagoInsuficiente(){
        String comprobacion = null;
        Moneda m1 = new Moneda100();
        Expendedor exp1 = new Expendedor(3);
        Comprador comprador = null;
        try{
            comprador = new Comprador(m1, SeleccionProductos.SPRITE, exp1);
        }catch(PagoInsuficienteException e){
            comprobacion = e.getMessage();
        }catch(PagoIncorrectoException e){
            comprobacion = e.getMessage();
        }catch(NoHayProductoException e){
            comprobacion = e.getMessage();
        }
        assertEquals(m1,exp1.getVuelto());
        assertEquals("\nEl monto ingresado es insuficiente.",comprobacion);
    }
    @Test
    void TestEleccionIncorrecta(){
        String comprobacion = null;
        Moneda m1 = new Moneda1000();
        Expendedor exp1 = new Expendedor(4);
        Comprador comprador = null;
        try{
            comprador = new Comprador(m1, SeleccionProductos.PINGUINO, exp1);
        }catch(PagoInsuficienteException e){
            comprobacion = e.getMessage();
        }catch(PagoIncorrectoException e){
            comprobacion = e.getMessage();
        }catch(NoHayProductoException e){
            comprobacion = e.getMessage();
        }
        assertEquals(m1,exp1.getVuelto());
        assertEquals("\nSeleccion de producto invalida.",comprobacion);
    }
    @Test
    void TestProductoAgotado(){
        String comprobacion = null;
        Moneda m1 = new Moneda1000();
        Expendedor exp1 = new Expendedor(0);
        Comprador comprador = null;
        try{
            comprador = new Comprador(m1, SeleccionProductos.SNICKERS, exp1);
        }catch(PagoInsuficienteException e){
            comprobacion = e.getMessage();
        }catch(PagoIncorrectoException e){
            comprobacion = e.getMessage();
        }catch(NoHayProductoException e){
            comprobacion = e.getMessage();
        }
        assertEquals("\nNo hay disponibilidad del producto que se solicitó.",comprobacion);
        assertEquals(m1,exp1.getVuelto());
    }
    @Test
    void TestMonedaNoValida(){
        String comprobacion = null;
        Moneda m1 = new Moneda5000();
        Expendedor exp1 = new Expendedor(0);
        Comprador comprador = null;
        try{
            comprador = new Comprador(m1, SeleccionProductos.SUPER8, exp1);
        }catch(PagoInsuficienteException e){
            comprobacion = e.getMessage();
        }catch(PagoIncorrectoException e){
            comprobacion = e.getMessage();
        }catch(NoHayProductoException e){
            comprobacion = e.getMessage();
        }
        assertEquals(null,comprador.queConsumiste());
        assertEquals(m1.getValor(),comprador.getVuelto());
    }
}