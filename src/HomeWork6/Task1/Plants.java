package HomeWork6.Task1;

import java.util.Map;

public class Plants {
    public static void getList(Map<String, String> plants) {
        for (Map.Entry<String, String> plant : plants.entrySet()) {
            System.out.println(plant.getKey() + ": " + plant.getValue());
        }
    }

    public static void getType(Map<String, String> plants, String key) {
        System.out.println(plants.get(key));
    }
}
