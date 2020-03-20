package com.company.seccion29.fundamentosJava.diseñoDeClases.laboratorioFinal;

public class Computadora {
    private int idComputadora;
    private static int contadorComputadoras = 1;
    private String nombre;
    private Monitor monitor;
    private Teclado teclado;
    private Raton raton;

    public Computadora(String nombre, Monitor monitor, Teclado teclado, Raton raton) {
        this.idComputadora = contadorComputadoras;
        this.nombre = nombre;
        this.monitor = monitor;
        this.teclado = teclado;
        this.raton = raton;
        contadorComputadoras++;
    }

    public int getIdComputadora() {
        return idComputadora;
    }

    public static int getContadorComputadoras() {
        return contadorComputadoras;
    }

    public static void setContadorComputadoras(int contadorComputadoras) {
        Computadora.contadorComputadoras = contadorComputadoras;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Teclado getTeclado() {
        return teclado;
    }

    public void setTeclado(Teclado teclado) {
        this.teclado = teclado;
    }

    public Raton getRaton() {
        return raton;
    }

    public void setRaton(Raton raton) {
        this.raton = raton;
    }

    @Override
    public String toString() {
        return "Computadora"+ String.format("%03d",idComputadora)+": "+"'"+ nombre +"'"+"\n"+
                "-"+monitor +"\n"+
                "-"+teclado +"\n"+
                "-" + raton+"\n";

       /*         "*********************************************"+"\n";
        for (int i = 0; i <contadorComputadoras ; i++) {
            System.out.println();
        }*/
    }
}