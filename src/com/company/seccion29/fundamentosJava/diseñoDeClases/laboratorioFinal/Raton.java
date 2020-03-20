package com.company.seccion29.fundamentosJava.diseñoDeClases.laboratorioFinal;

public class Raton extends DispositivoEntrada {
    private int idRaton;
    private static int contadorRatones=1;

    public Raton(String tipoEntrada, String marca) {
        super(tipoEntrada, marca);
        this.idRaton=contadorRatones;
        contadorRatones++;
    }

    public Raton(String marca) {
        super(marca);
        super.setTipoEntrada("Ratón");
        this.idRaton = contadorRatones;
        contadorRatones++;
    }

    @Override
    public String toString() {
        return
                "Ratón"+ String.format("%03d",idRaton)+
                super.toString();
    }
}
