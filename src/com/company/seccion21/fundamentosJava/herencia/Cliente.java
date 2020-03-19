package com.company.seccion21.fundamentosJava.herencia;

import java.util.Date;

public class Cliente extends  Persona{
    private int idCliente;
    private Date fechaRegistro;
    private boolean vip;
    private static int contadorCliente=1;

    public static int getContadorCliente() {
        return contadorCliente;
    }

    public Cliente(String nombre, char genero, int edad, String direccion) {
        super(nombre, genero, edad, direccion);
    }

    public Cliente(String nombre) {
        super(nombre);
        this.idCliente = contadorCliente;
        this.fechaRegistro = fechaRegistro;
        this.vip = vip;
        contadorCliente++;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public boolean isVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "idCliente=" + idCliente +" "+
                super.getNombre()+" "+
                ", fechaRegistro=" + fechaRegistro +
                ", vip=" + vip +
                '}';
    }
}
