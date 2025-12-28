package com.ebac.modulo56;

public class Suma implements Operacion<Integer> {

    @Override
    public Integer calcular(int... numeros) {
        int resultado = 0;
        for (int numero : numeros){
            resultado += numero;
        }
        return resultado;
    }
}
