import java.util.Scanner;

public class Desafio1 {
    public static void main(String[] args) {

        //aplicacion bancaria
        //menu de opciones

        //Organizar las variables al inicio del programa
        String nombre = "Tony Stark";
        String tipoDeCuenta = "Corriente";
        double saldo = 1599.99;
        int opcion = 0;

        String descripcion = """
                *******************************************
                
                Nombre del cliente: %s
                Tipo de cuenta: %s
                Saldo disponible: %f$
                """;

        System.out.printf((descripcion) + "%n",nombre,tipoDeCuenta,saldo);

        //<editor-fold desc="Otra forma de realizarlo">
        //        String nombre3 = “Karla”;
//        int aulas = 4;
//
//        String mensaje= """
//                  Hola, %s!
//                  Bienvenido al curso de Java.
//                  Tendremos %d aulas para mostrarte lo que es necesario para que puedas dar tu primeros pasos en este lenguaje
//                  """.formatted(nombre3, aulas);
//
//        System.out.println(mensaje);
        //</editor-fold>

        Scanner sc = new Scanner(System.in);

        while (opcion != 9 ){
            String Menu = """
                    ******************************************
                    **Escriba el numero de la opcion deseada**
                    1 - Consultar saldo
                    2 - Retirar
                    3 - Depositar
                    9 - Salir
                    """;

            System.out.println(Menu);
            opcion = sc.nextInt();

            sc.nextLine();

            switch (opcion){
                case 1:
                    System.out.println("Tu saldo Actualizado es de: \n" + saldo + " $");
                    break;
                case 2:
                        System.out.println("Ingrese el monto a retirar");
                        double saldoRetirar = sc.nextDouble();
                        if (saldo < saldoRetirar){
                            System.out.println("Saldo insuficiente");
                        } else {
                            saldo -= saldoRetirar;
                        }
                        System.out.println("Saldo restante: " + saldo + "$");
                    break;
                case 3:
                    System.out.println("Ingrese el monto a depositar");
                    saldo += sc.nextDouble();
                    System.out.println("Saldo actual: " + saldo + "$");
                    break;
                case 9:
                    System.out.println("Fin del programa, muchas gracias por usar nuestros Servicios");
                    break;
                default:
                    System.out.println("Por favor escoge una opcion correcta");
            }
        }
    }
}
