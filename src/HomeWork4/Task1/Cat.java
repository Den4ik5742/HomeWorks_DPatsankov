package HomeWork4.Task1;

public class Cat extends Animal implements IMove, IEat, IEatable{

    public Cat(String name, String type, String family, String breed) {
        super(name, type, family, breed);
    }

    @Override
    public void speak() {
        System.out.println("Мяу-Мяу");
    }

    @Override
    public void move() {
        System.out.println("Может бежать");
    }

    @Override
    public void eat() {
        System.out.println("Может съесть мышь");
    }

    @Override
    public void eatable() {
        System.out.println("Может быть съденым собакой");
    }
}
