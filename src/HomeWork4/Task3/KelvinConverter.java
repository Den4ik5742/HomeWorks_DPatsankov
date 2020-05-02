package HomeWork4.Task3;

public class KelvinConverter implements Converter {
    @Override
    public double convert(double celsius) {
        return celsius + 273.15;
    }
}