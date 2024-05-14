import java.util.Random;
import java.util.Scanner;

public class JuegoDeAdivinanzas {
    public static void main(String[] args) {

        int numeroAleatorio = new Random().nextInt(100);
        System.out.println(numeroAleatorio);

        Scanner teclado = new Scanner(System.in);

        System.out.println("Bienvenido al juego adivina el numero, escoge un número del 1 al 100. Recuerda que solo tienes " +
                "hasta 5 intentos. ");

        int numeroDeIntentos = 0;

        while(numeroDeIntentos < 5){
                System.out.println("Digita tu numero: ");
                int numeroEscogido = teclado.nextInt();

                if (numeroEscogido == numeroAleatorio){
                    System.out.println("Lograstes adivinar el numero aleatorio, que afortunado eres!!!");
                    break;
                } else {
                    if (numeroEscogido > numeroAleatorio){
                        System.out.println("El numero que digitaste es mayor al numero escondido");
                    } else {
                        System.out.println("El numero que digitaste es menor al numero escondido");
                    }

                }
            numeroDeIntentos++;

            if (numeroDeIntentos == 5) {
                System.out.println("Lo siento, no conseguiste adivinar el número en 5 intentos. El número era " + numeroAleatorio);
            }
        }





//        for (int i = 1; i <= 5 ; i++) {
//
//            switch (i) {
//                case 1:
//                    System.out.println();
//                    break;
//                case 2:
//                    System.out.println();
//                    break;
//                case 3:
//                    System.out.println();
//                    break;
//                case 4:
//                    System.out.println();
//                    break;
//                case 5:
//                    System.out.println();
//                    break;
//                default:
//                    System.out.println("No lograste adivinar el número, juego terminado");
//            }
//
   }

}

