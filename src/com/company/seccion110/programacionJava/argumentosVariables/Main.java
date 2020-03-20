package com.company.seccion110.programacionJava.argumentosVariables;

public class Main {

    public static void main(String[] args) {
        imprimirNumeros(5, 3, 5, 6, 7, 8, 8);
    }

    /**
     * Varargs debe ser el último elemento de parámetros declarados
     *
     * @param numeros
     */
    public static void imprimirNumeros(int... numeros) {
        if (numeros.length >= 1) {
            System.out.print(numeros[0]);
        }
        for (int i = 1; i < numeros.length; i++) {
            System.out.print("," + numeros[i]);
        }

    }
}


