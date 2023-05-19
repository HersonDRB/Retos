package Operaciones;

import java.util.Scanner;

public class Division {
    public static void main(String[]rgs) {
        
        int n1, n2, division = 0;
        //Instancia de una clase=Crear un objeto
        //Nombre de la clase, nombre del obeto = palabra reservada (new) estado

        Scanner captura= new Scanner(System.in);

        System.out.println("Bienvenido al programa");
        System.out.println("Dijite el primer numero");
        n1=captura.nextInt();
        System.out.println();
        System.out.println("Dijite el segundo numero");
        n2=captura.nextInt();
        System.out.println("Los numeros son:" + n1 + "y" + n2);
        division=n1 * n2;
        System.out.println("El resultado de la suma es::" + division);
        captura.close();

    }
}
