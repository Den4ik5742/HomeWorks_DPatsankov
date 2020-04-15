package HomeWork2;

import java.util.Scanner;

public class Task_5 {
    public static void main(String[] args){
        double[] Array = getArray();
        sortBubble(Array);
    }

    public static double[] getArray(){
        Scanner in = new Scanner(System.in);

        System.out.println("Введите размер массива:");
        int n = in.nextInt();
        while (n <= 0){
            System.out.println("Неверное значение. Введите размер массива еще раз:");
            n = in.nextInt();
        }

        System.out.print("Исходный массив : ");
        double[] array = new double[n];
        for (int i = 0; i < array.length; i++) {
            array[i] =  Math.random() * 201 - 100;
            System.out.printf("%.1f  ", (array[i]));
        }
        System.out.println(" ");
        return array;
    }

    public static double[] sortBubble(double[] Array) {
        System.out.print("Отсортированый массив : ");
        for (int i = Array.length - 1; i >= 0; i--){
            for(int j = 0; j < i; j++) {
                if (Array[j] < Array[j + 1]) {
                    double variable = Array[j];
                    Array[j] = Array[j + 1];
                    Array[j + 1] = variable;
                }
            }
            System.out.printf("%.1f  ", (Array[i]));
        }
        return Array;
    }
}
