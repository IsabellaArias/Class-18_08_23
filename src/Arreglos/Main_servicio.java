package Arreglos;

import java.lang.reflect.Array;

public class Main_servicio {
    public static void main(String[] args) {
        ServicioCelular [] servicio=new ServicioCelular[2];
        int [][] x=new int[2][3];   //matriz 2 indica la cantidad de filas y 3 la cantidad de columnas
        String nombre;

        //nombre.substring(nombre);   //estudiar metodos del string

        Cliente cliente=new Cliente("ToribioEsteban",5252);
        Array.set(servicio,0,new ServicioCelular(cliente,"3135520749"));
        System.out.println(servicio[0].toString());
        System.out.println(servicio[0].getCliente()); //imprime la información del cliente
        System.out.println(servicio[0].getPhoneNumber()); //solo se imprime un número
    }
}
