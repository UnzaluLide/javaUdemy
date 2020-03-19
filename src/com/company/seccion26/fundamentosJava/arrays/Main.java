package com.company.seccion26.fundamentosJava.arrays;


import com.company.seccion21.fundamentosJava.herencia.Persona;

public class Main {

    public static void main(String[] args) {
        String nombres []={"Lidia","Txetxu","Kimetz","inhar"};
        for (int i=0;i<nombres.length;i++){
            System.out.println(nombres[i]);
        }

        for (String nombre : nombres) {
            System.out.println(nombre);
        }

        //Persona arrayPersonas[] = new Persona[];
        Persona persona[]=new Persona[4];
        persona[1]=new Persona("LIDIA");
        for (Persona persona1 : persona) {
            System.out.println("aaa" +persona1);
        }
    }
}
