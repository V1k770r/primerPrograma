public class Main2 {
    public static void main(String[] args) {

        double temperaturaCelsius = 32.0;
        double tempreraturaFahrenheit = (temperaturaCelsius * 1.8) + 32;

        System.out.println(tempreraturaFahrenheit);

        int temperaturaFahrenheitEntero = (int) tempreraturaFahrenheit;
        System.out.println(String.format("La temperatura en Fahrenheit entera es de %d",temperaturaFahrenheitEntero) );

    }
}
