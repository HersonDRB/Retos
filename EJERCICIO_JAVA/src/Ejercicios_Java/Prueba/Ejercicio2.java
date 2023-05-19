package Ejercicios_Java.Prueba;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        
        double recaudo1, recaudo2, recaudo3, recaudo_total,recaudo_equipo;
        Scanner leer=new Scanner(System.in);

        System.out.println("Ingrese cual fue la cantidad que se ganaron en boleteria en el primer partido, por favor: ");
        recaudo1=leer.nextDouble();
        System.out.println("Ingrese cual fue la cantidad que se ganaron en boleteria en el segundo partido, por favor: ");
        recaudo2=leer.nextDouble();
        System.out.println("Ingrese cual fue la cantidad que se ganaron en boleteria en el tercer partido, por favor: ");
        recaudo3=leer.nextDouble();
        recaudo_total=recaudo1+recaudo2+recaudo3;

        System.out.println("El recaudo total en el mes fue de: "+recaudo_total);

        recaudo_equipo= recaudo1*0.2;
        recaudo_equipo= recaudo1*0.3;
        recaudo_equipo= recaudo1*0.4;
        System.out.println("El recaudo total del equipo es de: "+recaudo_equipo);

    }
}
