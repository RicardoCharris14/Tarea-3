import logica.Moneda;
import logica.Moneda1000;
import logica.Moneda1500;
import logica.Moneda500;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MonedaTest {
    @Test
    void TestCompareTo() {
        int prueba;
        Moneda m1 = new Moneda1500();
        Moneda m2 = new Moneda1000();
        Moneda m3 = new Moneda1000();
        prueba = m1.compareTo(m2);
        assertEquals(1,prueba);
        prueba = m2.compareTo(m1);
        assertEquals(-1,prueba);
        prueba = m2.compareTo(m3);
        assertEquals(0,prueba);
    }
    @Test
    void TestGetValor(){
        Moneda m1 = new Moneda500();
        assertEquals(500,m1.getValor());
    }
}