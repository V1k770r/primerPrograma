import java.util.Scanner;

public class Evaluaciones {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        double nota = 0, mediaEvaluaciones = 0, totalEvaluaciones = 0;

        while(nota != -1) {

            System.out.println("Escribe la nota que la darias a la pelicula Matrix");
            nota = teclado.nextDouble();

            if(nota != -1){
                //mediaEvaluaciones = mediaEvaluaciones + nota;
                mediaEvaluaciones += nota;
                totalEvaluaciones++;
            }
        }
        System.out.println("La media de evaluaciones para Matrix es: " + mediaEvaluaciones / totalEvaluaciones);
        }


}

