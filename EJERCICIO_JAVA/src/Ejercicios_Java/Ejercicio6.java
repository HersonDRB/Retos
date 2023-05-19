package Ejercicios_Java;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        double nota, suma = 0, promedio = 0;
        int i = 0, resp = 1;
        // Instanciar la clase para capturar las variables
        Scanner leer = new Scanner(System.in);
        while (resp == 1) {
            System.out.println("Digite la calificacion # " + (i + 1));
            nota = leer.nextDouble();
            suma = suma + nota;
            System.out.println("Su calificacion # " + (i + 1) + " es: ");
            System.out.println("¿Desea ingresar otra calificacion?");
            resp = leer.nextInt();
            i = i++; // i=i+i; i=+1, i++

        }
            promedio = (promedio + suma) / i;
            System.out.println("Su promedio es " + promedio);
            leer.close();
        }
    }
