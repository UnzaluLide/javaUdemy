package com.company.seccion113.programacionJava.enumeraciones;

public enum Continentes {
    AFRICA(53),
    EUROPA(46),
    ASIA(32),
    AMERICA(33),
    OCEANIA(14);

    private final int paises;

    Continentes(int paises) {
        this.paises = paises;
    }

    public int getPaises() {
        return paises;
    }
}
