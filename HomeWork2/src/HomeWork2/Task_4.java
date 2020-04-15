package HomeWork2;

import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args){
        double[] Array = getArray();
        int indexMaxValue = findMaxValue(Array);
        int indexMinValue = findMinValue(Array);
        countNegativeSum(Array, indexMaxValue, indexMinValue);
        countProiz(Array, indexMaxValue, indexMinValue);
    }

    public static double[] getArray(){
        Scanner in = new Scanner(System.in);

        System.out.println("Введите размер вектора:");
        int n = in.nextInt();
        while (n <= 0){
            System.out.println("Неверное значение. Введите размер вектора еще раз:");
            n = in.nextInt();
        }

        double[] array = new double[n];
        for (int i = 0; i < array.length; i++) {
            array[i] =  Math.random() * 201 - 100;
            System.out.printf("%.2f  ", (array[i]));

        }
        return array;
    }

    public static int findMaxValue(double[] Array) {
        double maxValue = Array[0];
        int indexMaxValue = 0;
        for (int i = 0; i < Array.length - 1; i++) {
            if (maxValue <= Array[i + 1]) {
                maxValue = Array[i + 1];
                indexMaxValue = i + 1;
            }
        }
        System.out.printf("\nМаксимальное значение %.2f  ", maxValue);
        return indexMaxValue;
    }

    public static int findMinValue(double[] Array) {
        double minValue = Array[0];
        int indexMinValue = 0;
        for (int i = 0; i < Array.length-1; i++) {
            if (minValue >= Array[i+1])
            {
                minValue = Array[i+1];
                indexMinValue = i+1;
            }
        }
        System.out.printf("\nМинимальное значение %.2f  ", minValue);
        return indexMinValue;
    }

    public static double countNegativeSum(double[] Array, int indexMinValue, int indexMaxValue) {
        double sum = 0;
        int countNegativeNumbers = 0;
        if (indexMaxValue > indexMinValue)
        {
            for (int i = indexMinValue + 1; i < indexMaxValue; i++){
                if (Array[i] < 0){
                    countNegativeNumbers++;
                    sum = sum + Array[i];
                }
            }
        }
        else if (indexMaxValue < indexMinValue)
        {
            for (int i = indexMaxValue + 1; i < indexMinValue; i++){
                if (Array[i] < 0){
                    countNegativeNumbers++;
                    sum = sum + Array[i];
                }
            }
        }

        if (countNegativeNumbers == 0){
            System.out.printf("\nСумма: Нет отрицательных чисел между минимальным и максимальным значениямим");
        }
        if (countNegativeNumbers > 0){
            System.out.printf("\nСумма отрицательных чисел между минимальным и максимальным элементом =  %.2f  ", sum);
        }
        return sum;
    }

    public static double countProiz(double[] Array, int indexMinValue, int indexMaxValue) {
        double proiz = 1;
        int countNumbers = 0;
        if (indexMaxValue > indexMinValue)
        {
            for (int i = indexMinValue + 1; i < indexMaxValue; i++){
                countNumbers++;
                proiz = proiz * Array[i];
            }
        }
        else if (indexMaxValue < indexMinValue)
        {
            for (int i = indexMaxValue + 1; i < indexMinValue; i++){
                countNumbers++;
                proiz = proiz * Array[i];
            }
        }

        if (countNumbers == 0){
            System.out.printf("\nПроизведение: Нет отрицательных чисел между минимальным и максимальным значениямим");
        }
        if (countNumbers > 0){
            System.out.printf("\nПроизведение чисел между минимальным и максимальным элементом =  %.2f  ", proiz);
        }
        return proiz;
    }
}