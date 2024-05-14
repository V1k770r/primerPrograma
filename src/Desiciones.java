public class Desiciones {

    public static void main(String[] args) {

        int fechaDeLanzamiento = 2020;
        boolean incluidoEnElPlan = true;
        double notaDeLaPelicula = 8.2;
        String tipoPlan = "plus";

        //<editor-fold desc="Codigo que prueba los operadores relacionales">
//             if ( fechaDeLanzamiento > 2022){
//            System.out.println("Peliculas mas populares");
//            } else {
//            System.out.println("Peliculas Retro que aun vale la pena ver");
//        }
        //</editor-fold>

        if(incluidoEnElPlan && tipoPlan.equals("plus")){
            System.out.println("Disfruta de su pelicula");
        } else {
            System.out.println("Pelicula no disponible para su plan actual");
        }

    }
}
