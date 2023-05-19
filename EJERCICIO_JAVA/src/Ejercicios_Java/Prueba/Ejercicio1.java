package Ejercicios_Java.Prueba;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {

        int num;
        Scanner leer = new Scanner(System.in);

        System.out.println("Bienvenido, el programa mostrara el número que digite si es par o impar");
        System.out.println("Digite el número por favor: ");
        num = leer.nextInt();
        
        if (num%2=0){
        System.out.println("El número que ha ingresado es par");
        }else{
            System.out.println("El número no es par");
        }
    }
}
