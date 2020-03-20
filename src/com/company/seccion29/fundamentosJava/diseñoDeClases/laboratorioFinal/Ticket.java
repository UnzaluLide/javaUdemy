package com.company.seccion29.fundamentosJava.diseñoDeClases.laboratorioFinal;

public class Ticket {
    private int idTicket;
    private Computadora[]computadoras;
    private int contadorComputadoras;
    private static int contadorTickets=1;
    private static final int MAX_COMPUTADORAS=4;

    public Ticket() {
        this.idTicket = contadorTickets;
        this.computadoras = new Computadora[MAX_COMPUTADORAS];
        contadorTickets++;
    }

    public int getIdTicket() {
        return idTicket;
    }

    public Computadora[] getComputadoras() {
        return computadoras;
    }

    public void setComputadoras(Computadora[] computadoras) {
        this.computadoras = computadoras;
    }

    public int getContadorComputadoras() {
        return contadorComputadoras;
    }

    public void setContadorComputadoras(int contadorComputadoras) {
        this.contadorComputadoras = contadorComputadoras;
    }

    public static int getContadorTickets() {
        return contadorTickets;
    }

    public static void setContadorTickets(int contadorTickets) {
        Ticket.contadorTickets = contadorTickets;
    }

    public static int getMaxComputadoras() {
        return MAX_COMPUTADORAS;
    }

    public void agregarComputadora(Computadora computadora){
        if(contadorComputadoras<MAX_COMPUTADORAS){
            this.computadoras[contadorComputadoras]=computadora;
            contadorComputadoras++;
        }else{
            System.out.println("has pasado el número de computadoras máximas permitidas por ticket");
        }



    }

    public void printTicket(){
        System.out.println("Ticket#"+this.getIdTicket());
        int n=0;
        for (int i = 0; i <contadorComputadoras ; i++) {
            System.out.print(computadoras[i]);
            System.out.println("******************************************************************************************");
        }
    }
}
