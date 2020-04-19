package HomeWork2;

import java.util.Scanner;

public class Task_7 {
    public static void main(String[] args){
        getArray();

    }

    public static int[][] getArray(){
        Scanner in = new Scanner(System.in);

        System.out.println("Введите количество строк массива:");
        int rows = in.nextInt();
        ArrayUtils checkSize = new ArrayUtils();
        rows = checkSize.checkRowsSize(rows);
        System.out.println("Введите минимальную длинну строки:");
        int minValue = in.nextInt();
        while (minValue <= 0){
            System.out.println("Минимальное значение не должно быть меньше 1. Введите минимальную длинну строки еще раз:");
            minValue = in.nextInt();
        }

        System.out.println("Введите максимальную длинну строки:");
        int maxValue = in.nextInt();
        while (maxValue <= minValue){
            System.out.println("Максимальное значение не должно быть меньше или равно минимальному. Введите максимальную длинну строки еще раз:");
            maxValue = in.nextInt();
        }

        int[][] array = new int[rows][];
        System.out.printf("Итоговый зубчатый массив : \n  ");
        for (int i = 0; i < array.length; i++) {
            int columns = (int) (Math.random() * maxValue) + minValue;
            System.out.println();
            array[i] = new int[columns];
            for(int j = 0; j < array[i].length; j++) {
                array[i][j] =  ((int)(Math.random() * 201) - 100);
                System.out.print(" " + array[i][j]);
            }
        }
        return array;
    }
}
