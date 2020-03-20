package com.company.seccion29.fundamentosJava.diseñoDeClases.laboratorioFinal;

public class Teclado extends DispositivoEntrada {

    private int idTeclado;
    private static int contadorTeclados=1;


    public Teclado(String tipoEntrada, String marca) {
        super(tipoEntrada, marca);
        this.idTeclado=contadorTeclados;
        contadorTeclados++;
    }

    public Teclado(String marca) {
        super(marca);
        this.setTipoEntrada("teclado");
        this.idTeclado = contadorTeclados;;
        contadorTeclados++;
    }

    @Override
    public String toString() {
        return
                "Teclado"+ String.format("%03d",idTeclado)+
                super.toString();
    }
}
