package Retos;

import java.util.Scanner;

public class Reto6 {
    public static void main(String[] args) {
        int producto, precio, totalcompra = 0;

        try (Scanner capturar = new Scanner(System.in)) {

            System.out.println("Bienvenido al programa de simulacion de un supermercado\n");

            System.out.println("¿Cual es la cantidad de productos que va a elegir?: ");
            producto = capturar.nextInt();

            for (int i = 0; i < producto; i++) {
                System.out.println("¿Cual es el precio del producto " + (i + 1)+"?");
                precio = capturar.nextInt();
                totalcompra = totalcompra + precio;
            }
            System.out.println("El total de la compra es: " + totalcompra);
        }
    }
}