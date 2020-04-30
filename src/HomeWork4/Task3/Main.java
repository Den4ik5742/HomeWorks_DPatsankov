package HomeWork4.Task3;

public class Main {
    public static void main(String[] args) {
        CelsiusConverter celsiusConverter = new CelsiusConverter(23);
        FahrenheitConverter fahrenheitConverter = new FahrenheitConverter();
        KelvinConverter kelvinConverter = new KelvinConverter();
        System.out.println("Градусы в цельсиях : " + celsiusConverter.getCelsius());
        System.out.println("Градусы в фаренгейтах : " + fahrenheitConverter.convert(celsiusConverter.getCelsius()));
        System.out.println("Градусы в кельвинах : " + kelvinConverter.convert(celsiusConverter.getCelsius()));
    }
}