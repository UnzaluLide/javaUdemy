package com.company.seccion29.fundamentosJava.diseñoDeClases.laboratorioFinal;

public class Monitor {
    private int idMonitor;
    private String marca;
    private double tamanio;
    private static int contadorMonitores=1;

    public Monitor(String marca, double tamanio) {
        this.idMonitor = contadorMonitores;
        this.marca = marca;
        this.tamanio = tamanio;
        contadorMonitores++;
    }

    public int getIdMonitor() {
        return idMonitor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getTamanio() {
        return tamanio;
    }

    public void setTamanio(double tamanio) {
        this.tamanio = tamanio;
    }

    public static int getContadorMonitores() {
        return contadorMonitores;
    }

    public static void setContadorMonitores(int contadorMonitores) {
        Monitor.contadorMonitores = contadorMonitores;
    }

    @Override
    public String toString() {
        return "Monitor"+ String.format("%03d",idMonitor)
                + " marca:'" + marca + '\'' +
                " tamaño:" + tamanio +'"';
    }
}
