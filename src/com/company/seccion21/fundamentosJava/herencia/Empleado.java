package com.company.seccion21.fundamentosJava.herencia;

public class Empleado extends Persona{

    private int idEmpleado;
    private double sueldo;
    private static int contadorEmpleado=1;

    public Empleado(String nombre, char genero, int edad, String direccion, int idEmpleado, double sueldo) {
        super(nombre, genero, edad, direccion);
        this.idEmpleado = ++contadorEmpleado;
        this.sueldo = sueldo;
        contadorEmpleado++;
    }

    public Empleado(String nombre) {
        super(nombre);
        this.idEmpleado = contadorEmpleado;
        this.sueldo = sueldo;
        contadorEmpleado++;
    }

    public int getIdEmpleado() {
        return idEmpleado=contadorEmpleado++;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public static int getContadorEmpleado() {
        return contadorEmpleado;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "idEmpleado=" + idEmpleado+" "+
                super.getNombre()+" "+
                ", sueldo=" + sueldo +
                '}';
    }
}
