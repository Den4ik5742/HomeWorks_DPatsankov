package HomeWork5.lesson;

public class Triangle extends Shape {

    private double a;
    private double h;

    public Triangle(double a, double h) {
        this.a = a;
        this.h = h;
    }

    @Override
    public double getSquare() throws MyException {
        if (a > 0 && h > 0) {
            return a * h * 1 / 2;
        } else {
            throw new MyException("Сторона и высота должны быть больше 0");
        }
    }
}
