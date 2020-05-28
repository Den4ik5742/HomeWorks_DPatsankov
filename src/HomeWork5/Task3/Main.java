package HomeWork5.Task3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите индекс");
        int index = in.nextInt();
        Object[] x = new Object[]{1, 2, 3, "srk", true, 4.4, 'Q'};
        System.out.println(ElementsClass.getElements(x, index));
    }
}
