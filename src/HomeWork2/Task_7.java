package HomeWork2;

import java.util.Scanner;

public class Task_7 {
    public static void main(String[] args){
        getArray();
    }

    public static int[][] getArray(){
        Scanner in = new Scanner(System.in);

        System.out.println("Введите количество строк массива:");
        int size1 = in.nextInt();
        while (size1 <= 0){
            System.out.println("Неверное значение. Введите size1 еще раз:");
            size1 = in.nextInt();
        }

        System.out.println("Введите минимальную длинну строки:");
        int minValue = in.nextInt();
        while (minValue <= 0){
            System.out.println("Минимальное значение не должно быть меньше 1. Введите minValue еще раз:");
            minValue = in.nextInt();
        }

        System.out.println("Введите максимальную длинну строки:");
        int maxValue = in.nextInt();
        while (maxValue <= minValue){
            System.out.println("Максимальное значение не должно быть меньше или равно минимальному. Введите maxValue еще раз:");
            maxValue = in.nextInt();
        }

        int[][] array = new int[size1][];
        System.out.printf("Итоговый зубчатый массив : \n  ");
        for (int i = 0; i < array.length; i++) {
            int size2 = (int) (Math.random() * maxValue) + minValue;
            System.out.println();
            array[i] = new int[size2];
            for(int j = 0; j < array[i].length; j++) {
                array[i][j] =  ((int)(Math.random() * 201) - 100);
                System.out.print(" " + array[i][j]);
            }
        }
        return array;
    }
}
