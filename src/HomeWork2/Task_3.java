package HomeWork2;

import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args){
        getArray();
    }

    public static String[][] getArray(){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество строк:");
        int rows = in.nextInt();
        ArrayUtils checkSizeRows = new ArrayUtils();
        rows = checkSizeRows.checkRowsSize(rows);
        System.out.println("Введите количество столбцов:");
        int columns = in.nextInt();
        ArrayUtils checkSizeColumn = new ArrayUtils();
        columns = checkSizeColumn.checkColumnssSize(columns);
        String[][] array = new String[rows][columns];
        for (int i = 0; i < array.length; i++) {
            System.out.println();
            for(int j = 0; j < array[i].length; j++) {
                array[i][j] = "*";
                System.out.print((array[i][j]));
            }
        }
        return array;
    }
}
