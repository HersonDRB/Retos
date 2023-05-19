package Ejercicios_Java;

import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {

        int n, suma = 0;
        int[] numeros;

        try (Scanner leer = new Scanner(System.in)) {
            System.out.println("¿Cuantos números quieres ingresar?: ");
            n = leer.nextInt();
            numeros = new int[n];

            for (int i = 0; i < numeros.length; i++) {
                System.out.println("El número " + i + " es: ");
                numeros[i] = leer.nextInt();
                suma = suma + numeros[i];
            }
        }

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Los números que ingresaste son: " + numeros[i]);
        }
        System.out.println("La suma de los números es: " + suma);

    }
}
