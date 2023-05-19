package Ejercicios_Java;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] rgs) {

        int edad;
        try (Scanner leer = new Scanner(System.in)) {
            System.out.println("Ingrese la edad por favor:");
            edad = leer.nextInt();
        }
        if (edad >= 18) {
            System.out.println("Bienvenido a la discoteca");
        } else {
            System.out.println("Usted no puede ingresar por ser menor de edad");
        }

    }

}