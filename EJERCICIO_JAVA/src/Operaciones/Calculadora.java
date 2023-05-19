package Operaciones;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {

        // Declaramos variables
        int num1, num2;
        double resul1;
        String opcion;
        int resul;

        try (// Instanciar clases
                Scanner capturar = new Scanner(System.in)) {
            // Solicitar datos
            System.out.println(
                    "Seleccione una opcion con un numero : \n1. suma \n2. resta  \n3. multiplicacion \n4. division \n5. potencia");

            // Capturar datos
            opcion = capturar.nextLine();
            System.out.println("Digite el primer numero:");
            num1 = capturar.nextInt();
            System.out.println("Digite el segundo numero:");
            num2 = capturar.nextInt();
        }

        // Generar condiciones
        switch (opcion) {
            case "1":
                resul = num1 + num2;
                System.out.println("El resultado de la suma es: " + resul);
                break;
            case "2":
                resul= num1 - num2;
                System.out.println("El resultado de la resta es: " + resul);
                break;
            case "3":
                resul = num1 * num2;
                System.out.println("El resultado de la multiplicacion es: " + resul);
                break;
            case "4":
                resul = num1 / num2;
                System.out.println("El resultado de la division es: " + resul);
                break;
            case "5":
                resul1 = Math.pow(num1, num2);
                System.out.println("El resultado de la potencia es: " + resul1);
                break;
        }

    }
}
