package com.ebac.modulo56;

public class Division implements Operacion<Double> {

    @Override
    public Double calcular(int... numeros) {
        if(numeros[1] == 0){
            System.out.println("Error, division por cero no valida");
            return -1.0;
        }
        return (double) numeros[0] / numeros[1];
    }
}
