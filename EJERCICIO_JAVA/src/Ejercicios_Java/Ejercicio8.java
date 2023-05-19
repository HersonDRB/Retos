package Ejercicios_Java;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {

        String comentario, respuesta = "si";
        int edad = 0;

        try (Scanner leer = new Scanner(System.in)) {

            do {
                System.out.println("Ingresa tu edad por favor: ");
                edad = leer.nextInt();
                if (edad >= 18);
                System.out.println("Por favor ingrese un comentario: ");
                comentario = leer.next();
                System.out.println("Quieres ingresar un nuevo comentario?: ");
                respuesta = leer.next();
            } while (respuesta == "si");

            System.out.println("El total de comentarios que escribiste fueron: "+comentario);
            

        }

    }
}