package com.ebac.modulo56;

public class Resta implements Operacion<Integer> {

    @Override
    public Integer calcular(int... numeros) {
        int resultado = numeros[0];
        for (int i = 1; i < numeros.length; i++){
            resultado -= numeros[i];
        }

        return resultado;
    }
}
