package HomeWork6.Task2;

public class Peoples implements Comparable{
    private String name;
    private String[] goods;

    public Peoples(String name, String[] goods) {
        this.name = name;
        this.goods = goods;
    }

    public String[] getGoods() {
        return goods;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
