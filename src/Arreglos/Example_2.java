package Arreglos;

import java.lang.reflect.Array;

public class Example_2 {
    public static void main(String[] args) {

    String [] names= {"Juanita","Ana","Jas"};
    int [] numbers={1,2,3};
    float [] x= new float[5];
        System.out.println(numbers.length);
        x[0]=1.5f;
        x[1]=1.8f;
        Array.set(x,2,3.42f);
        System.out.println(x[1]);   //Trallendo la posición
        System.out.println(Array.get(x,1)); //también trae la posición
        for (float i:x) {
            System.out.println(i);
        }

    }
}