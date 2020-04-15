package HomeWork2;

import java.util.Scanner;

public class Task_6 {
    public static void main(String[] args){
        int[][] Array = getArray();
        rechangeArray(Array);
    }

    public static int[][] getArray(){
        Scanner in = new Scanner(System.in);

        System.out.println("Введите size1:");
        int size1 = in.nextInt();
        while (size1 <= 0){
            System.out.println("Неверное значение. Введите size1 еще раз:");
            size1 = in.nextInt();
        }

        System.out.println("Введите size2:");
        int size2 = in.nextInt();
        while (size2 <= 0){
            System.out.println("Неверное значение. Введите size2 еще раз:");
            size2 = in.nextInt();
        }

        int[][] array = new int[size1][size2];
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

    public static int[][] rechangeArray(int[][] Array){
        System.out.printf("\n");
        System.out.printf("\nИзмененный массив :  ");
        for (int i = 0; i < Array.length; i++) {
            System.out.println();
            for(int j = 0; j < Array[i].length; j++) {
                if (Array[i][j] % 2 == 0)
                {
                    Array[i][j] = 0;
                }
                else if (Math.abs(Array[i][j]) % 2 == 1)
                {
                    Array[i][j] = 1;
                }
                System.out.print(" " + Array[i][j]);
            }
        }
        return Array;
    }
}

