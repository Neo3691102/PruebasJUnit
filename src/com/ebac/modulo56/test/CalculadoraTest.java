package com.ebac.modulo56.test;

import com.ebac.modulo56.Calculadora;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraTest {

    private final int numA = 9;
    private final int numB = 5;
    private static Calculadora calculadora;

    @BeforeAll
    static void setUp(){
        calculadora = new Calculadora();
    }

    @Test
    public void testSuma(){
        //definicion de resultado esperado
        int expected = 14;
        //manda a llamar a la funcionalidad a probar
        int actual = calculadora.Sumar(numA, numB);
        //hacemos la validacion
        assertEquals(expected, actual);
    }

    @Test
    public void testResta(){
        //definicion de resultado esperado
        int expected = 4;
        //manda a llamar a la funcionalidad a probar
        int actual = calculadora.Resta(numA, numB);
        //hacemos la validacion
        assertEquals(expected, actual);
    }

    @Test
    public void testMultiplicacion(){
        //definicion de resultado esperado
        int expected = 45;
        //manda a llamar a la funcionalidad a probar
        int actual = calculadora.Multiplicacion(numA, numB);
        //hacemos la validacion
        assertEquals(expected, actual);
    }

    @Test
    public void testDivision(){
        //definicion de resultado esperado
        double expected = 1.8;
        //manda a llamar a la funcionalidad a probar
        double actual = calculadora.Division(numA, numB);
        //hacemos la validacion
        assertEquals(expected, actual);
    }
}
