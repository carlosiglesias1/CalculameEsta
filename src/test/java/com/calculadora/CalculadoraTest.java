package com.calculadora;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraTest {
    private final Calculadora calculadora = new Calculadora();

    @Test
    public void sumaTest() {
        assertEquals(3, calculadora.sumar(1f, 2f));
    }

    @Test
    public void restaTest() {
        assertEquals(0, calculadora.restar(2f, 2f));
    }

    @Test
    public void multiplicarTest() {
        assertEquals(25, calculadora.multiplicar(5f, 5f));
    }

    @Test
    public void dividirMalTest() {
        assertEquals(6, calculadora.divide(50f, 10f));
    }

    @Test
    public void dividirTest() {
        assertEquals(5, calculadora.divide(50f, 10f));
    }

    @Test
    public void potenciaTest() {
        assertEquals(1, calculadora.potencia(1f, 0));
    }
}
