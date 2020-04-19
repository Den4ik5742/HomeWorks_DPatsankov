package HomeWork2;

import java.util.Scanner;

public class Task_6 {
    public static void main(String[] args){
        int[][] generatedArray = getArray();
        rechangeArray(generatedArray);
    }

    public static int[][] getArray(){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество строк:");
        int rows = in.nextInt();
        ArrayUtils checkSizeRows = new ArrayUtils();
        rows = checkSizeRows.checkRowsSize(rows);
        System.out.println("Введите количество столбцов:");
        int columns = in.nextInt();
        ArrayUtils checkSizeColumn = new ArrayUtils();
        columns = checkSizeColumn.checkColumnssSize(columns);
        int[][] array = new int[rows][columns];
        System.out.printf("Исходный массив : \n  ");
        for (int i = 0; i < array.length; i++) {
            System.out.println();
            for(int j = 0; j < array[i].length; j++) {
                array[i][j] =  ((int)(Math.random() * 201) - 100);
                System.out.print(" " + array[i][j]);
            }
        }
        return array;
    }

    public static int[][] rechangeArray(int[][] generatedArray){
        System.out.printf("\n");
        System.out.printf("\nИзмененный массив :  ");
        for (int i = 0; i < generatedArray.length; i++) {
            System.out.println();
            for(int j = 0; j < generatedArray[i].length; j++) {
                if (generatedArray[i][j] % 2 == 0)
                {
                    generatedArray[i][j] = 0;
                }
                else if (Math.abs(generatedArray[i][j]) % 2 == 1)
                {
                    generatedArray[i][j] = 1;
                }
                System.out.print(" " + generatedArray[i][j]);
            }
        }
        return generatedArray;
    }
}

