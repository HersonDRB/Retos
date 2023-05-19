package Ejercicios_Java;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        double nota, suma = 0, promedio = 0;
        int i=0, resp;
        // Instanciar la clase para capturar las variables
        Scanner leer = new Scanner(System.in);
        do {
            System.out.println("Digite la calificacion # " + (i + 1));
            nota = leer.nextDouble();
            suma = suma + nota;
            System.out.println("Su calificacion # " + (i + 1) + " es: ");
            System.out.println("¿Desea ingresar otra calificacion?");
            resp = leer.nextInt();
            i = i++; // i=i+i; i=+1, i++
            System.out.println("Valor final de i: " + i);
        } while (resp == 1);

        promedio = (promedio + suma) / i;
        System.out.println("Su promedio es " + promedio);
        leer.close();
    }
}