package HomeWork5.lesson;


public class FindSquare {
    public static void main(String[] args) {
        Circle circle = new Circle(0);
        Rectangle rectangle = new Rectangle(0, 10);
        Triangle triangle = new Triangle(0, 7);
        try {
            System.out.println("Площадь круга : " + circle.getSquare());
        } catch (MyException e) {
            e.printStackTrace();
        }
        try {
            System.out.println("Площадь прямоугольник :  " + rectangle.getSquare());
        } catch (MyException e) {
            e.printStackTrace();
        }
        try {
            System.out.println("Площадь треугольника : " + triangle.getSquare());
        } catch (MyException e) {
            e.printStackTrace();
        }
    }
}
