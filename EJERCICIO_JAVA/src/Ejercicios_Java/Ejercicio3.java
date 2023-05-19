package Ejercicios_Java;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        String genero, uñas, labial;
        int corbatas, pantalones, cinturones;
        double cabello;

        Scanner leer = new Scanner(System.in);
        System.out.println("Digite su genero 'hombre' o 'mujer':");
        genero = leer.nextLine();

        if (genero.equals("hombre")) {
            System.out.println("¿Cuantas corbatas tienes?: ");
            corbatas = leer.nextInt();
            System.out.println("¿Cuantos pantalones tiene?: ");
            pantalones = leer.nextInt();
            System.out.println("¿Cuantos cinturones tienes?:");
            cinturones = leer.nextInt();
            System.out.println("Tienes " + corbatas + " corbata(s), " + pantalones + " pantalon(es) y " + cinturones+ " corbata(s)");

        } else if (genero.equals("mujer")) {
            System.out.println("¿Cuanto mide su cabello en centimetros?: ");
            cabello = leer.nextDouble();
            System.out.println("¿Que color de uñas tienes?: ");
            uñas=leer.next();
            System.out.println("¿De que color es tu labial?");
            labial=leer.next();
            System.out.println("Tu cabello mide "+cabello+"cm , el color de tus uñas es "+uñas+" y el color de tu labial es "+labial);

        } else {
            System.out.println("No se ha seleccionado ningun genero");
        }
        leer.close();
    }
}