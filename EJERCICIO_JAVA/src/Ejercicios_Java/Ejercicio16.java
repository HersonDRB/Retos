package Ejercicios_Java;

import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
        int n;
        String[] apellido;

        // Crear el objeto tipo Array
        apellido = new String[6];
        try (Scanner leer = new Scanner(System.in)) {
            System.out.println("¿Cuantos apellidos quieres ingresar?: ");
            n = leer.nextInt();
            // declarar array
            String[] apellido1;
            apellido1 = new String[n];
            // rellenar array
            apellido[0] = "";
            apellido[1] = "";
            apellido[2] = "";
            apellido[3] = "";
            apellido[4] = "";
            apellido[5] = "";

            /*
             * String[] apellido3 = { "Bulla", "Riveros", "Cotrina", "Capera", "Henao",
             * "Rincon" };
             */

            for (int i = 0; i < apellido1.length; i++) {
                System.out.println("Ingrese el apellido en la posicion " + i + ":");
                apellido1[i] = leer.next();

            }
            for (int i = 0; i < apellido1.length; i++) {
                System.out.println(apellido1[i]);
            }

            String[] apellido2;
            apellido2 = new String[n];
            // rellenar array
            apellido[0] = "";
            apellido[1] = "";
            apellido[2] = "";
            apellido[3] = "";
            apellido[4] = "";
            apellido[5] = "";
            // for each mejorado
            for (String valor : apellido2) {
                System.out.println("Ingrese el apellido: ");
                valor = leer.next();
                System.out.println(valor);

            }
        }

    }
}
