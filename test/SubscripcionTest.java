package test;

import org.junit.jupiter.api.Test;
import src.Subscripcion;

import static org.junit.jupiter.api.Assertions.*;

class SubscripcionTest {
    @Test
    public void testPrecioPorMes() {
        double espera = 100;
        Subscripcion s = new Subscripcion(200, 2);
        double resultado = s.precioPorMes();
        assertEquals(espera, resultado, 0);
    }

    @Test
    public void testPrecioPorMes2() {
        double espera = 67.66666666666667;
        Subscripcion s = new Subscripcion(200, 3);
        double resultado = s.precioPorMes();
        assertEquals(espera, resultado, 0);
    }
}