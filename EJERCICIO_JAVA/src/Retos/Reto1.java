package Retos;

public class Reto1 {
    public static void main(String[] rgs) {

        double temp = 350, centi = 0;

        System.out.println("Bienvenido al programa para convertir los grados Fahrenheit (°F) a Centígrados (°C)\ncon la siguiente operacion: (350-32)/1.8\n");
        centi = (temp - 32) / 1.8;

        System.out.println("La temperatura para precalentar el horno es:" + centi);
    }
}