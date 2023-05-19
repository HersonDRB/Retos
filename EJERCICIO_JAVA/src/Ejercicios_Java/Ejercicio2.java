package Ejercicios_Java;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        String color;
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese un color que se muestra a continuación: \nverde\nrojo\nmorado\namarillo");
        color = leer.next();

        if (color.equals("verde")) {
            System.out.println("El color verde es la manzana");
        } else if (color.equals("rojo")) {
            System.out.println("El color rojo es la fresa");
        } else if (color.equals("morado")) {
            System.out.println("El color morado es la mora");
        } else if (color.equals("amarillo")) {
            System.out.println("El color amarillo es el banano");
    
        } else {
            System.out.println("No ha seleccionado ningun color");
        }
        leer.close();
    }
}