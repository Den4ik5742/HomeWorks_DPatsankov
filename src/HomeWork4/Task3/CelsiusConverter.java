package HomeWork4.Task3;

public class CelsiusConverter implements Converter {
    private double celsius;

    public CelsiusConverter(double celsius) {
        this.celsius = celsius;
    }

    public double getCelsius() {
        return celsius;
    }

    @Override
    public double convert(double celsius) {
        return celsius;
    }
}