package Ejercicios_Java;

import java.util.Scanner;

public class Ejercicio {
    public static void main(String[] args) {

        String instru_nombre, instru_apellido, instru_clase;

        try (Scanner leer = new Scanner(System.in)) {
            System.out.println("===================================================================================");
            System.out.println("|                    Lista de los Instructores - Ficha2687378                     |");
            System.out.println("===================================================================================");
            System.out.println("|                                                                                 |");
            System.out.println("|  Tatiana Cabrera - Lenguaje Avanzado de Java.                                   |");
            System.out.println("|                                                                                 |");
            System.out.println("|  Henry Cancedo - Consulta y SQL Extendido Relacionales y No Relacionales.       |");
            System.out.println("|                                                                                 |");
            System.out.println("|  Margarita Guarin - Prototipo Avanzado Interfaces Responsive                    |");
            System.out.println("|                                                                                 |");
            System.out.println("|  Uldarico Andrade - Python Basico.                                              |");
            System.out.println("|                                                                                 |");
            System.out.println("|  Paola Ballen - Fundamentos de JavaScript Moderno.                              |");
            System.out.println("|                                                                                 |");
            System.out.println("|  Jennifer Fajardo - Realizacion y Estimación Propuesta Tecnica-Diseño Proyecto. |");
            System.out.println("|                                                                                 |");
            System.out.println("===================================================================================");

            System.out.println("Ingresa el nombre del instructor por favor: ");
            instru_nombre = leer.next();
            System.out.println("Ingresa el apellido del instructor por favor: ");
            instru_apellido = leer.next();
            System.out.println("Ingresa la clase que enseña el instructor por favor: ");
            instru_clase = leer.next();
        }

        System.out.println("El nombre del Instructor es: " + instru_nombre + "\nEl apellido del instructor es: "
                + instru_apellido + "\nLa clase que enseña el Instructor es: " + instru_clase);
    }
}
