package Retos;
import java.util.Random;
import java.util.Scanner;

public class Reto4 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Random random = new Random();

            int eleccion, resultado = random.nextInt(2);

            System.out.println("Bienvenido al programa para jugar cara y sello\n");

            System.out.print("Elige cara (0) o sello (1): ");
            eleccion = scanner.nextInt();

            if (eleccion == resultado) {
                System.out.println("Ganaste");
            } else {
                System.out.println("Perdiste");
            }
        }
    }
}