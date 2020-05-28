package HomeWork6.Task1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Map<String, String> plants = new HashMap<>();
        plants.put("Яблоко", "Фрукт");
        plants.put("Арбуз", "Ягода");
        plants.put("Тюльпан", "Цветы");
        plants.put("Томат", "Овощь");
        plants.put("Виноград", "Ягода");
        plants.put("Огурец", "Овощь");
        plants.put("Роза", "Цветы");
        plants.put("Груша", "Фрукт");
        plants.put("Одуванчик", "Цветы");
        plants.put("Малина", "Ягода");
        Plants.getList(plants);
        Scanner in = new Scanner(System.in);
        System.out.println("Введите фрукт, овощь, ягоду или цветок из списка : ");
        String key = in.next();
        Plants.getType(plants, key);
    }
}
