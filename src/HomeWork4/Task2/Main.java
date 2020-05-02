package HomeWork4.Task2;

public class Main {
    public static void main(String[] args) {
        Ball ball = new Ball(2);
        Cylinder cylinder = new Cylinder(5, 10);
        Pyramid pyramid = new Pyramid(10, 5);
        Box box = new Box(800);
        System.out.println("Объем контейнера " + box.getVolume());
        System.out.println("Объем шара " + ball.getVolume());
        System.out.println(box.add(ball));
        System.out.println("Объем контейнера после добавления фигуры " + box.getVolume());
        System.out.println("Объем пирамиды " + pyramid.getVolume());
        System.out.println(box.add(pyramid));
        System.out.println("Объем контейнера после добавления фигуры " + box.getVolume());
        System.out.println("Объем цилиндра " + cylinder.getVolume());
        System.out.println(box.add(cylinder));
        System.out.println();
    }
}
