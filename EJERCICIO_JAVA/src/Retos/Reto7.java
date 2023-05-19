package Retos;

import java.util.Scanner;
import java.util.Random;

public class Reto7 {
    public static void main(String[] args) {
        try (Scanner leer = new Scanner(System.in)) {
            Random random = new Random();

            int eleccion, otravez = 1, resultado = random.nextInt(3);

            System.out.println("Bienvenido al programa para jugar piedra, papel y tijera\n");

            do {
                System.out.print("Elige piedra (0), papel (1) o tijera (2): ");
                eleccion = leer.nextInt();

                if (eleccion > resultado) {
                    System.out.println("Ganaste");
                } else if (eleccion == resultado) {
                    System.out.println("Empate");
                } else {
                    System.out.println("Perdiste");
                }

                System.out.println("¿Quieres volver a jugar?: (1)Si o (2)No");
                otravez = leer.nextInt();
            } while (otravez == 1);

            System.out.println("Gracias por jugar");
        }
    }
}