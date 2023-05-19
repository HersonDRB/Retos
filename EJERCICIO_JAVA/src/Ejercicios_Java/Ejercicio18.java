package Ejercicios_Java;

import java.util.Scanner;

public class Ejercicio18 {
    public static void main(String[] args) {
        
        int n;
        int []numeros;

        Scanner leer=new Scanner(System.in);

        System.out.println("¿Cuantos números quieres ingresar?: ");
        n = leer.nextInt();
        numeros = new int[n];

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("El número " + i + " es: ");
            numeros[i] = leer.nextInt();
        }


    }
}
