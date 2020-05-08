package HomeWork5.lesson;

public class Circle extends Shape {
    private double r;

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public double getSquare() throws MyException {
        if (r > 0) {
            return Math.PI * Math.pow(r, 2);
        } else {
            throw new MyException("Радиус должен быть больше 0");
        }
    }
}
