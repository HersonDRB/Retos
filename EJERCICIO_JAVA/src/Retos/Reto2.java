package Retos;

import java.util.Scanner;

public class Reto2 {
    public static void main(String[] rgs) {
        String padre, enfermera, bebe;
        double peso, meses, dosis = 0;

        try (Scanner leer = new Scanner(System.in)) {

            System.out.println("Bienvenido al programa para saber cual es la cantidad de dosis que se le debe aplicar al bebe\n");

            System.out.println("Por favor ingrese el nombre del Padre o Madre:");
            padre = leer.nextLine();
            System.out.println("Por favor ingrese el nombre de la enfermera:");
            enfermera = leer.nextLine();
            System.out.println("Por favor ingrese el nombre del bebe:");
            bebe = leer.nextLine();
            System.out.println("Ingrese por favor el peso del bebe en kilogramos:");
            peso = leer.nextDouble();
            System.out.println("Ingrese por favor los meses de nacido del bebe: ");
            meses = leer.nextDouble();
            dosis = ((peso + 10) / (meses * 10) * 8);

            System.out.println("La dosis que se le debe aplicar al bebe es: " + dosis + "%" +
                    "\nEl nombre del padre/madre es: " + padre + "\nEl nombre de la enfermera es: " + enfermera +
                    "\nEl nombre del bebe es: " + bebe);
        }
    }
}
