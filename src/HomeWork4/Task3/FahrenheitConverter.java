package HomeWork4.Task3;

public class FahrenheitConverter implements Converter {
    @Override
    public double convert(double celsius) {
        return 1.8 * celsius + 32;
    }
}