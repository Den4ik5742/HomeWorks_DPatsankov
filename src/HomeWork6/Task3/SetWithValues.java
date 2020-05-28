package HomeWork6.Task3;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SetWithValues {
    public static void getSetWithValues(Map<String, String> plants) {
        Set<String> setWithValues = new HashSet<>();
        for (Map.Entry<String, String> plant : plants.entrySet()) {
            setWithValues.add(plant.getValue());
        }
        System.out.println(setWithValues);
    }
}
