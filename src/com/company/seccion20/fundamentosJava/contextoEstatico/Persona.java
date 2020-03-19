package com.company.seccion20.fundamentosJava.contextoEstatico;

public class Persona {

    private int idPersona;
    private String nombre;
    //si no se le asigna ningún valor se le asigna 0 como valor
    //Si se le quita el static se reinicia el valor por cada objeto creado y el contador no se incrementa
    private static int contadorPersonas=1;

    public Persona(String nombre) {
        this.idPersona = contadorPersonas;
        this.nombre = nombre;
        contadorPersonas++;
    }

    public int getIdPersona() {
        return idPersona;
    }

    /*public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }*/

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static int getContadorPersonas() {
        return contadorPersonas;
    }

    public  void setContadorPersonas(int contadorPersonas) {
        this.contadorPersonas = contadorPersonas;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "idPersona=" + idPersona +
                ", nombre='" + nombre + '\'' +
                ", contadorPersonas=" + (contadorPersonas -1)+
                '}';
    }
}
