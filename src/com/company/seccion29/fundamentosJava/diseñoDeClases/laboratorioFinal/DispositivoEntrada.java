package com.company.seccion29.fundamentosJava.diseñoDeClases.laboratorioFinal;

public class DispositivoEntrada {

    private String tipoEntrada;
    private String marca;

    public DispositivoEntrada(String tipoEntrada, String marca) {
        this.tipoEntrada = tipoEntrada;
        this.marca = marca;
    }

    //constructor sólo con marca, el tipoEntrada se setea en cada dispositivo de entrada
    //al crear un objeto teclado, ratón ya se sobrenetiende el tipo de entrada
    public DispositivoEntrada(String marca) {
        this.marca = marca;
    }

    public String getTipoEntrada() {
        return tipoEntrada;
    }

    public void setTipoEntrada(String tipoEntrada) {
        this.tipoEntrada = tipoEntrada;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return
                " marca='" + marca + '\''
                ;
    }
}
