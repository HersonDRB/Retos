package Retos;

import java.util.Scanner;

public class Reto5 {
    public static void main(String[] args) {
        
        int fecha;

        try (Scanner leer = new Scanner(System.in)) {
            System.out.println("Bienvenido al programa para ver su signo zodiacal con sus caracteristicas\n");

            System.out.println("Por favor ingrese un numero para elegir su signo en base a las fechas: ");
            System.out.println("(1) Aries: del 21 de marzo al 19 de abril.\n(2) Tauro: del 20 de abril al 20 de mayo.\n(3) Géminis: del 21 de mayo al 20 de junio.\n(4) Cáncer: del 21 de junio al 22 de julio.\n(5) Leo: del 23 de julio al 22 de agosto.\n(6) Virgo: del 23 de agosto al 22 de septiembre.\n(7) Libra: del 23 de septiembre al 22 de octubre.\n(8) Escorpio: del 23 de octubre al 21 de noviembre.\n(9) Sagitario: del 22 de noviembre al 21 de diciembre.\n(10) Capricornio: del 22 de diciembre al 19 de enero.\n(11) Acuario: del 20 de enero al 18 de febrero.\n(12) Piscis: del 19 de febrero al 20 de marzo.");
            fecha=leer.nextInt();
        }

        if(fecha==1){
            System.out.println("Tu signo es Aries, eres una persona rebosante de energía y entusiasmo; avanzada y aventurera, adoras la libertad, los retos y las nuevas ideas.");
        }else if(fecha==2){
            System.out.println("Tu signo es Tauro, eres persona con una gran fuerza de voluntad constancia, tenacidad y decisión.");
        }else if(fecha==3){
            System.out.println("Tu signo es Geminis, eres una persona intelectual, curioso y muy activa.");
        }else if(fecha==4){
            System.out.println("Tu signo es Cancer, eres una persona emocional, intituiva y espiritual, eres altamente soñador y te gusta refugiarte demasiado en la fantasia.");
        }else if(fecha==5){
            System.out.println("Tu signo es Leo, eres una persona creativa y abierta, tienes ambicion, valor, fuerza, autonomía y total seguridad en ti mismo, sabes a dónde quieres llegar y nada ni nadie podrá evitarlo.");
        }else if(fecha==6){
            System.out.println("Tu signo es Virgo, eres una persona con un espíritu crítico, precisión, reserva, paciencia y convencionalismo.");
        }else if(fecha==7){
            System.out.println("Tu singno es Libra, eres una persona con elegancia, encanto, diplomacia y buen gusto, amas la belleza, eres muy curioso por naturaleza y odias los conflictos.");
        }else if(fecha==8){
            System.out.println("Tu signo es Escorpio, eres una persona con mucha imaginación e intuición, además de una gran capacidad para el análisis, fuerza de voluntad y firmeza, aunque también eres muy sensible y emocional contigo mismo y con el entorno.");
        }else if(fecha==9){
            System.out.println("Tu signo es Sagitario, eres unas persona versatil, adoras las aventuras y buscas nuevos horizontes, tienes una mente abierta a nuevas ideas y experiencias y mantienes una actitud decidida ante la adversidad");
        }else if(fecha==10){
            System.out.println("Tu signo es Capricornio, eres una persona trabajadora, responsable, practica y dispuesta a persistir hasta poder hacer lo necesario para conseguir su objetivo.");
        }else if(fecha==11){
            System.out.println("Tu signo es Acuario, eres una persona con una personalidad fuerte y atractiva, con una gran visión, genio y originalidad");
        }else if(fecha==12){
            System.out.println("Tu signo es Piscis, eres una persona con una personalidad tranquila, paciente y amable. Eres sensible a los sentimientos de los demás y respondes con simpatía y tacto al sufrimiento de los demás.");
        }else{
            System.out.println("El signo no es valido");
        }
    }
}
