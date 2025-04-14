public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenido a Screen Match");
        System.out.println("Película: Matrix");

        int fechaDeLanzamiento = 1999;
        boolean incluidoEnElPlan = true;
        double notaDeLaPelicula = 8.2;

        double media = (8.2 + 6.0 + 9.0) / 3 ;
        System.out.println(media);

        String sinopsis = """
                Matrix es una paradoja
                La mejor pelicula del fin del milenio
                Fue lanzada en: 
                """ + fechaDeLanzamiento;
        System.out.println(sinopsis);

        int clasificacion = (int) (media / 2);
        System.out.println(clasificacion);

        double temperaturaEnCelsius = 30.4;
        double temperaturaEnFahrenheit = (temperaturaEnCelsius * 1.8) + 32;

        String mensaje = String.format("La temperatura de %f Celsius es equivalente a %f Fahrenheit", temperaturaEnCelsius, temperaturaEnFahrenheit);

        System.out.println(mensaje);

        int temperaturaEnFahrenheitEntero = (int) temperaturaEnFahrenheit;
        System.out.println("La temperatura en Fahrenheit entera es: " + temperaturaEnFahrenheitEntero);
    }

}