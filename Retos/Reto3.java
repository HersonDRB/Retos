package Retos;

import java.util.Random;
import java.util.Scanner;

public class Reto3 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Random random = new Random();

            int resultado = random.nextInt(3);

            System.out.println("Bienvenido al programa para jugar piedra, papel y tijera\n");

            System.out.print("Elige piedra (0), papel (1) o tijera (2): ");
            int eleccion = scanner.nextInt();

            if (eleccion > resultado) {
                System.out.println("Ganaste");
            } else if (eleccion == resultado) {
                System.out.println("Fue un empate");
            } else {
                System.out.println("Perdiste");
            }
        }
    }
}