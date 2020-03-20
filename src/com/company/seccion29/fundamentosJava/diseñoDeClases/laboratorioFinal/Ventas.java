package com.company.seccion29.fundamentosJava.diseñoDeClases.laboratorioFinal;

public class Ventas {
    public static void main(String[] args) {
        Teclado te1=new Teclado("logitech");
        Raton r1=new Raton("logitech");
        Monitor m1=new Monitor("LG", 24);
        Computadora c1=new Computadora("computadora a medida del usuario",m1,te1,r1);

        Teclado te2=new Teclado("Apple Magic keyboard con teclado numérico ");
        Raton r2=new Raton("Apple Magic mouse 2 ");
        Monitor m2=new Monitor("Apple", 21.5);
        Computadora c2=new Computadora("ordenador Mac a medida usuario",m2,te2,r2);

        Teclado te3=new Teclado("Genesis RX66 Pro Teclado Gaming Retroiluminado ");
        Raton r3=new Raton("Newskill Helios Ratón Gaming RGB 10000DPI");
        Monitor m3=new Monitor("MSI Optix MPG341CQR 34\" LED UltraWide QuadHD 144Hz Curva", 34);
        Computadora c3=new Computadora("ordenador gaming a medida usuario",m3,te3,r3);

        Ticket t1=new Ticket();
        t1.agregarComputadora(c1);
        t1.agregarComputadora(c2);
        t1.agregarComputadora(c3);
        t1.printTicket();
    }
}
