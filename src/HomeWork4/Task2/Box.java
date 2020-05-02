package HomeWork4.Task2;

public class Box extends Shape {
    private double volume;

    public Box(double volume) {
        this.volume = volume;
    }

    @Override
    public double getVolume() {
        return volume;
    }

    public boolean add(Shape shape) {
        boolean result = true;
        if (volume >= shape.getVolume()) {
            volume -= shape.getVolume();
        } else if (volume < shape.getVolume()) {
            result = false;
            System.out.println("В контейнере нет места для этой фигуры");
        }
        return result;
    }
}
