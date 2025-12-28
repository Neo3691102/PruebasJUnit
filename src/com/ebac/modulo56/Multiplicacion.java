package com.ebac.modulo56;

public class Multiplicacion implements Operacion<Integer> {

    @Override
    public Integer calcular(int... numeros) {
        int resultado = 1;
        for (int numero: numeros){
            resultado = resultado * numero;
        }
        return resultado;
    }
}
