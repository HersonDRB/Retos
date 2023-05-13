package Retos;

public class Reto1 {
    public static void main(String[] rgs) {
        // Declarar variables
        double temp = 350, centi = 0;
        // Calcular temperatura en grados
        centi = (temp - 32) / 1.8;
        // Mostrar resultados
        System.out.println("Bienvenido al programa para convertir los grados Fahrenheit (°F) a Centígrados (°C)\n");

        System.out.println("La temperatura para precalentar el horno es:" + centi);
    }
}