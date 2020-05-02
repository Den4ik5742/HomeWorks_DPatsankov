package HomeWork4.Task1;

public class Dog extends Animal implements IMove, IEat{

    public Dog(String name, String type, String family, String breed) {
        super(name, type, family, breed);
    }

    @Override
    public void speak() {
        System.out.println("Гав-Гав");
    }

    @Override
    public void move() {
        System.out.println("Может бежать");
    }

    @Override
    public void eat() {
        System.out.println("Может съесть кого захочет");
    }
}
