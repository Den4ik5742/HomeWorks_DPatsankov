package HomeWork4.Task2;

public class Pyramid extends Shape {
    private double s;
    private double h;

    public Pyramid(double s, double h) {
        this.s = s;
        this.h = h;
    }

    @Override
    public double getVolume() {
        return s * h * 1 / 3;
    }
}
