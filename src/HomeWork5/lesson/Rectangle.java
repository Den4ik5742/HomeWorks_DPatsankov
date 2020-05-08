package HomeWork5.lesson;

public class Rectangle extends Shape {

    private double a;
    private double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double getSquare() throws MyException {
        if (a > 0 && b > 0) {
            return a * b;
        } else {
            throw new MyException("Сторона должна быть больше 0");
        }
    }
}
