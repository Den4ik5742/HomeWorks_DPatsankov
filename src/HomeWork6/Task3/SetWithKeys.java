package HomeWork6.Task3;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SetWithKeys {
    public static void getSetWithKeys(Map<String, String> plants) {
        Set<String> setWithKeys = new HashSet<>();
        for (Map.Entry<String, String> plant : plants.entrySet()) {
            setWithKeys.add(plant.getKey());
        }
        System.out.println(setWithKeys);
    }
}
