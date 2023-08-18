package Arreglos;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Example_1 {
    public static void main(String[] args) {

    String [] array_1=new String[4];
    float [] array_2=new float[5];
    int [] a=new int[3];
    int [] c= {2,1,8,3,4};
    a[1]=30;
        System.out.println(c.length);     //Imprime el tamaño del arreglo
        System.out.println(Array.get(a,1));     //el array, y la posicion de un número.
        Array.set(a,0,32);
        Arrays.sort(a);
        int  buscar= Arrays.binarySearch(a,0);  //Para buscar si esta
        if (!Arrays.equals(a,c)){
            System.out.println("Son diferentes");
        }
    }
}
