package HomeWork6.Task2;

import java.util.*;

public class Main implements Comparable{
    public static void main(String[] args) {
        Map<String, Double> items = new HashMap<>();
        items.put("Хлеб", 10.0);
        items.put("Молоко", 2.0);
        items.put("Сыр", 30.5);
        items.put("Конфеты", 10.0);
        items.put("Мясо", 55.5);
        items.put("Грибы", 15.0);
        Queue<Peoples> peoples = new PriorityQueue<>();
        peoples.add(new Peoples("Иван", new String[]{"Хлеб", "Молоко", "Сыр"}));
        peoples.add(new Peoples("Сергей", new String[]{"Конфеты", "Мясо", "Грибы", "Хлеб"}));
        peoples.add(new Peoples("Денис", new String[]{"Молоко", "Мясо"}));
        peoples.add(new Peoples("Сергей", new String[]{"Грибы", "Хлеб"}));
        DescShop.getResult(peoples, items);
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
