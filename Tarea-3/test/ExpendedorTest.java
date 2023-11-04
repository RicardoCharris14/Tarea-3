import logica.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExpendedorTest {

    @Test
    void TestCompraCorrecta(){
        Producto producto = null;
        String comprobacion = null;
        Moneda m1 = new Moneda500();
        Expendedor exp1 = new Expendedor(3);
        try{
            producto = exp1.comprarProducto(m1,SeleccionProductos.Snickers);
        }catch(PagoInsuficienteException e){
            comprobacion = e.getMessage();
        }catch(PagoIncorrectoException e){
            comprobacion = e.getMessage();
        }catch(NoHayProductoException e){
            comprobacion = e.getMessage();
        }
        assertEquals("Me comi un logica.Snickers",producto.consumir());
    }

    @Test
    void TestMonedaNull() {
        Producto producto = null;
        String comprobacion = null;
        Moneda m1 = null;
        Expendedor exp1 = new Expendedor(3);
        try{
            producto = exp1.comprarProducto(m1,SeleccionProductos.Super8);
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
        Producto producto = null;
        String comprobacion = null;
        Moneda m1 = new Moneda100();
        Expendedor exp1 = new Expendedor(3);
        try{
            producto = exp1.comprarProducto(m1,SeleccionProductos.Fanta);
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
        Producto producto = null;
        String comprobacion = null;
        Moneda m1 = new Moneda1000();
        Expendedor exp1 = new Expendedor(3);
        try{
            producto = exp1.comprarProducto(m1,SeleccionProductos.Pinguino);
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
        Producto producto = null;
        String comprobacion = null;
        Moneda m1 = new Moneda1000();
        Expendedor exp1 = new Expendedor(0);
        try{
            producto = exp1.comprarProducto(m1,SeleccionProductos.Sprite);
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
        Producto producto = null;
        String comprobacion = null;
        Moneda m1 = new Moneda1500();
        Expendedor exp1 = new Expendedor(0);
        try{
            producto = exp1.comprarProducto(m1,SeleccionProductos.Sprite);
        }catch(PagoInsuficienteException e){
            comprobacion = e.getMessage();
        }catch(PagoIncorrectoException e){
            comprobacion = e.getMessage();
        }catch(NoHayProductoException e){
            comprobacion = e.getMessage();
        }
        assertEquals(null,producto);
        assertEquals(m1,exp1.getVuelto());
    }
}