package com.ebac.modulo56;

public class Contexto {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        int resultadoSuma = calculadora.Sumar(3,6,9);
        System.out.println("Suma: " + resultadoSuma);

        int resultadoResta = calculadora.Resta(3,6,9);
        System.out.println("Resta: " + resultadoResta);

        int resultadoMult = calculadora.Multiplicacion(3,6,9);
        System.out.println("Multiplicacion: " + resultadoMult);

        double resDivision = calculadora.Division(9,3);
        System.out.println("Division: " + resDivision);
    }
}
