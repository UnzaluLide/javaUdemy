package com.company.seccion113.programacionJava.enumeraciones;

import static com.company.seccion113.programacionJava.enumeraciones.Dias.LUNES;

public class Main {
    public static void main(String[] args) {
        System.out.println("Valor 1:"+ LUNES);
        System.out.println(Continentes.AFRICA.getPaises());

        indicarDia(LUNES);
    }

    public static void indicarDia(Dias dia){

        switch (dia){
            case LUNES:
                System.out.println("primer día de la semana");
                break;
            case MARTES:
                //TODO resto de días

        }
    }

}
