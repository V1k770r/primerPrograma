//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("Hello World");

        int fechaDeLanzamiento = 1999;
        boolean incluidoEnElPlan = true;
        double notaDeLaPelicula = 8.2;

        double media = (8.2 + 6.0 + 9.0) / 3;
        System.out.println(media);

        String sinopsis1 = """
                Matrix es una paradoja
                La mejor pelicula del fin del milemio            
                Fue lanzada en: 
                """ + fechaDeLanzamiento;
        String sinopsis2 = """
                Ademas gracias a las encuentas realizadas 
                se obtuvo que la notaDelaPelicula asciende a:
                """ + notaDeLaPelicula;

        System.out.println(sinopsis1);
        System.out.println();
        System.out.println(sinopsis2);

        String contraseña = "123456";
        if(contraseña.equals("12345")){
            System.out.println("Acceso autorizado!");
        } else {
            System.out.println("Contraseña incorrecta");
        }

//        String nombre = "Maria";
//        int edad = 30;
//        double valor = 55.9999;
//        System.out.println(String.format("Mi nombre es %s, tengo %d años y hoy gasté %.2f dolares", nombre, edad, valor));

        String nombre2 = "Juan";
        int aulas = 4;

        String mensaje= """
                  Hola, %s!
                  Bienvenido al curso de Java.
                  Tendremos %d aulas para mostrarte lo que es necesario para que puedas dar tu primeros pasos en este lenguaje                  """.formatted(nombre2, aulas);

    /*    Por ejemplo, %s indica que se insertará una cadena en el marcador de posición, %d indica un valor entero y %f indica un valor decimal.
    */

//        System.out.println(mensaje);
//
//        int x = 10;
//        double y = x;

        int clasificacion = (int) (media / 2);
        System.out.println(clasificacion);



    }
}