package HomeWork4.Task1;

public class Mouse extends Animal implements IMove, IEatable{

    public Mouse(String name, String type, String family, String breed) {
        super(name, type, family, breed);
    }

    @Override
    public void speak() {
        System.out.println("Пи-пи-пи");
    }

    @Override
    public void eatable() {
        System.out.println("Может быть съедена любым животным");
    }

    @Override
    public void move() {
        System.out.println("Может бежать");
    }
}
