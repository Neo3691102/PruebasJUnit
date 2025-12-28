package com.ebac.modulo56;

public class Calculadora {
    public int Sumar(int... numeros){
        return new Suma().calcular(numeros);
    }

    public int Resta(int... numeros){
        return new Resta().calcular(numeros);
    }

    public int Multiplicacion(int... numeros){
        return new Multiplicacion().calcular(numeros);
    }

    public double Division(int a, int b){
        return new Division().calcular(a, b);
    }
}
