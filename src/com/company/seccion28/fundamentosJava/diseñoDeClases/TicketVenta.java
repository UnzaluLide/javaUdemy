package com.company.seccion28.fundamentosJava.diseñoDeClases;

public class TicketVenta {
    private int idTicket;
    private Producto [] productos;
    private static int contadorTicket=1;
    private static final int MAX_PRODUCTOS=10;
    private int contadorProductos;
    private static final int TICKET_CHAR=32;

    public TicketVenta() {
        this.idTicket = contadorTicket;
        this.productos = new Producto[MAX_PRODUCTOS];
        contadorTicket++;
    }

    public int getIdTicket() {
        return idTicket;
    }

    public Producto[] getProductos() {
        return productos;
    }

    public void setProductos(Producto[] productos) {
        this.productos = productos;
    }

    public static int getContadorTicket() {
        return contadorTicket;
    }

    public static void setContadorTicket(int contadorTicket) {
        TicketVenta.contadorTicket = contadorTicket;
    }

    public static int getMaxProductos() {
        return MAX_PRODUCTOS;
    }

    public int getContadorProductos() {
        return contadorProductos;
    }

    public void setContadorProductos(int contadorProductos) {
        this.contadorProductos = contadorProductos;
    }

    public void agregarProductos(Producto producto){
        this.productos[contadorProductos]=producto;
        contadorProductos++;
    }

    public double calcularTotal(){
        double total=0;
        for (int i = 0; i <contadorProductos ; i++) {
            total=total+productos[i].getPrecio();
        }
        return  total;
    }

    public int contadorCaracteresProducto(){
        int max=0;
        int []caracteres=new int[MAX_PRODUCTOS];
        int contador;
        for (int i = 0; i <contadorProductos ; i++) {
            caracteres[i]=productos[i].getNombre().length();
            //contador=productos[i].getNombre().length();
            //System.out.println(caracteres[i]);
        }
        //obtener el mayor valor del array de caracteres
        for (int cont = 0; cont < contadorProductos; cont++)
        {
            if (caracteres[cont] > max)
            {
                max = caracteres[cont];
            }
        }
        return max;
    }
    //recursividad para imprimir tantos * como caracteres
    private void printStar(int n ){
        //n=this.contadorCaracteresProducto();
        if(n > 0){
            System.out.print("*");
            printStar(n-1);
        }
    }

    public void imprimirTicket(){
        System.out.println("Ticket #"+this.getIdTicket());
        //System.out.println(contadorCaracteresProducto());
        printStar(contadorCaracteresProducto()+TICKET_CHAR);
        System.out.println(" \n");
        for (int i = 0; i <contadorProductos ; i++) {
            System.out.println(productos[i]);
        }
        System.out.println("TOTAL= "+calcularTotal());
        //System.out.println(contadorCaracteresProducto());
    }
}
