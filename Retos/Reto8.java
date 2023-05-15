package Retos;

import java.util.Scanner;
import java.util.Random;

public class Reto8 {
    public static void main(String[] args) {

        try (Scanner leer = new Scanner(System.in)) {
            Random random = new Random();

            int denuevo = 1, resultado = random.nextInt(2);

            System.out.println("Bienvenido al programa para jugar cara y sello\n");

            do {
                System.out.print("Elige cara (0) o sello (1): ");
                int eleccion = leer.nextInt();

                if (eleccion == resultado) {
                    System.out.println("Ganaste");
                } else {
                    System.out.println("Perdiste");
                }
                System.out.println("¿Quieres seguir jugando?: (1)Si o (2)No");
                denuevo=leer.nextInt();

            } while (denuevo == 1);

            System.out.println("El juego ha terminado, gracias por jugar");
        }
    }
}
