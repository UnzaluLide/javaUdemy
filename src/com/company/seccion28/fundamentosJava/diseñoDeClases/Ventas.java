package com.company.seccion28.fundamentosJava.diseñoDeClases;

public class Ventas {
    public static void main(String[] args) {
        Producto p1=new Producto( "papel higiénico scottex X4",  3.56);
        Producto p2=new Producto( "chocolate blanco ",  2.52);
        Producto p3=new Producto( "yogourt griego 0%grasa ",  2.99);
    /* System.out.println(p1);
     System.out.println(p2);*/
       TicketVenta t1=new TicketVenta();
        t1.agregarProductos(p1);
        t1.agregarProductos(p2);
        t1.agregarProductos(p3);
        //t1.contadorCaracteresProducto();
        t1.imprimirTicket();
    }

}
