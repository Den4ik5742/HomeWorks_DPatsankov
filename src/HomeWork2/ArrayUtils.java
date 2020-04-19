package HomeWork2;

import java.util.Scanner;

public class ArrayUtils {
    public static int checkRowsSize(int rows){
        while (rows <= 0){
            Scanner in = new Scanner(System.in);
            System.out.println("Неверное значение. Введите количество строк еще раз:");
            rows = in.nextInt();
        }
        return rows;
    }

    public static int checkColumnssSize(int columns){
        while (columns <= 0){
            Scanner in = new Scanner(System.in);
            System.out.println("Неверное значение. Введите количество столбцов еще раз:");
            columns = in.nextInt();
        }
        return columns;
    }

}
