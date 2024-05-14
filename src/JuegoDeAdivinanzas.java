import java.util.Random;
import java.util.Scanner;

public class JuegoDeAdivinanzas {
    public static void main(String[] args) {


        int numeroAleatorio = new Random().nextInt(100);
        System.out.println(numeroAleatorio);

        Scanner teclado = new Scanner(System.in);
        System.out.println("Escoge tu primer numero, del 1 al 100");
        int numeroEscogido = teclado.nextInt();

        if (numeroEscogido == numeroAleatorio){
            System.out.println("Lograstes adivinar el numero aleatorio ");
        } else {
            System.out.println("Sigue intentando");
        }

        for (int i = 1; i <= 5 ; i++) {

            switch (i) {
                case 1:
                    System.out.println();
                    break;
                case 2:
                    System.out.println();
                    break;
                case 3:
                    System.out.println();
                    break;
                case 4:
                    System.out.println();
                    break;
                case 5:
                    System.out.println();
                    break;
                default:
                    System.out.println("No lograste adivinar el número, juego terminado");
            }

        }









    }
}
