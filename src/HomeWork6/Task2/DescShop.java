package HomeWork6.Task2;

import java.util.Map;
import java.util.Queue;

public class DescShop {

    public static void getResult(Queue<Peoples> peoples, Map<String, Double> items) {
        int counter = 1;
        for (Peoples people : peoples) {
            System.out.printf("\nПокупатель номер %d по имени %s купил: \n", counter, people.getName());
            for (int i = 0; i < people.getGoods().length; i++) {
                System.out.printf("%s стоимостью %.2f; ", people.getGoods()[i], getFinalPrice(items, people.getGoods()[i]));
            }
            System.out.println();
            counter++;
        }
    }

    public static double getFinalPrice(Map<String, Double> items, String key) {
        return items.get(key);
    }
}
