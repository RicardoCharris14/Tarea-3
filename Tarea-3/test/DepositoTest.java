import logica.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DepositoTest {

    @Test
    void DepositoMonedas() {
        Deposito<Moneda> monedas = new Deposito<>();
        Moneda m1 = new Moneda5000();
        Moneda tmp;
        monedas.addElemento(m1);
        tmp = monedas.getElemento();
        assertEquals(tmp, m1);
    }

    @Test
    void DepositoProductos() {
        Deposito<Producto> productos = new Deposito<>();
        Producto p1 = new Snickers(1);
        Producto tmp;
        productos.addElemento(p1);
        tmp = productos.getElemento();
        assertEquals(tmp, p1);
    }
}