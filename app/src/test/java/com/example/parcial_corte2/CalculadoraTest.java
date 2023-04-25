package com.example.parcial_corte2;

import static org.junit.Assert.assertEquals;

import junit.framework.TestCase;

import org.junit.Before;

public class CalculadoraTest extends TestCase {

    @Before
    public void setUp(){

    }

    public void testSuma() {
        assertEquals(10, Calculadora.suma(6, 4));
        assertEquals(35, Calculadora.suma(24, 11));
    }

    public void testResta() {
        assertEquals(-1, Calculadora.resta(23, 24));
        assertEquals(3, Calculadora.resta(7, 4));
    }
}
