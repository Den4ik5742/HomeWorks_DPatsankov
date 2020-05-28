package HomeWork6.Task3;

import java.util.HashMap;
import java.util.Map;

public class MyMap {

    public static Map<String, String> getList() {
        Map<String, String> myMap = new HashMap<>();
        myMap.put("Яблоко", "Фрукт");
        myMap.put("Арбуз", "Ягода");
        myMap.put("Тюльпан", "Цветы");
        myMap.put("Томат", "Овощь");
        myMap.put("Виноград", "Ягода");
        myMap.put("Огурец", "Овощь");
        myMap.put("Роза", "Цветы");
        myMap.put("Груша", "Фрукт");
        myMap.put("Одуванчик", "Цветы");
        myMap.put("Малина", "Ягода");
        return myMap;
    }
}
