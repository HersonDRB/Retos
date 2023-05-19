package Ejercicios_Java;

import java.util.Scanner;

public class Ejercicio5 {
    // declarar variables

    public static void main(String[] args) {
        double nota, suma = 0, promedio = 0;
        int n;
        // Instanciar la clase para capturar las variables
        Scanner leer = new Scanner(System.in);
        // Solicitar cantidad de notas
        System.out.println("Ingrese la cantidad de notas que va a registrar");
        n = leer.nextInt();
        // crear un bucle
        for (int i = 0; i < n; i++) {
            System.out.println("Digite la calificacion # " + (i + 1));
            nota = leer.nextDouble();
            suma=suma+nota;
            System.out.println("Su calificacion #"+(i+1)+" es: "+nota);
        }
        promedio=(promedio+suma)/n;
        System.out.println("Su promedio es "+promedio);
        leer.close();
    }
}
