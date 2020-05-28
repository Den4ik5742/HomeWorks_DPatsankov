package HomeWork6.Task3;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
        for (Map.Entry<String, String> plants : MyMap.getList().entrySet()) {
            System.out.println(plants.getKey() + ": " + plants.getValue());
        }
        SetWithKeys.getSetWithKeys(MyMap.getList());
        SetWithValues.getSetWithValues(MyMap.getList());
    }
}
