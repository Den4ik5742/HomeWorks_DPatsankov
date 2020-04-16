package HomeWork2;

import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args){
        double[] generatedArray = getArray();
        int indexMaxValue = findMaxValue(generatedArray);
        int indexMinValue = findMinValue(generatedArray);
        countNegativeSum(generatedArray);
        countProiz(generatedArray, indexMaxValue, indexMinValue);
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

    public static int findMaxValue(double[] generatedArray) {
        double maxValue = generatedArray[0];
        int indexMaxValue = 0;
        for (int i = 0; i < generatedArray.length - 1; i++) {
            if (maxValue <= generatedArray[i + 1]) {
                maxValue = generatedArray[i + 1];
                indexMaxValue = i + 1;
            }
        }
        System.out.printf("\nМаксимальное значение %.2f  ", maxValue);
        return indexMaxValue;
    }

    public static int findMinValue(double[] generatedArray) {
        double minValue = generatedArray[0];
        int indexMinValue = 0;
        for (int i = 0; i < generatedArray.length-1; i++) {
            if (minValue >= generatedArray[i+1])
            {
                minValue = generatedArray[i+1];
                indexMinValue = i+1;
            }
        }
        System.out.printf("\nМинимальное значение %.2f  ", minValue);
        return indexMinValue;
    }

    public static double countNegativeSum(double[] generatedArray) {
        double sum = 0;
        int countNegativeNumbers = 0;
            for (int i = 0; i < generatedArray.length; i++){
                if (generatedArray[i] < 0){
                    countNegativeNumbers++;
                    sum = sum + generatedArray[i];
                }
            }
        if (countNegativeNumbers < 1){
            System.out.printf("\nСумма: Нет отрицательных чисел");
        }
        if (countNegativeNumbers > 0){
            System.out.printf("\nСумма отрицательных чисел =  %.2f  ", sum);
        }
        return sum;
    }

    public static double countProiz(double[] generatedArray, int indexMinValue, int indexMaxValue) {
        double proiz = 1;
        int countNumbers = 0;
        if (indexMaxValue > indexMinValue)
        {
            for (int i = indexMinValue + 1; i < indexMaxValue; i++){
                countNumbers++;
                proiz = proiz * generatedArray[i];
            }
        }
        else if (indexMaxValue < indexMinValue)
        {
            for (int i = indexMaxValue + 1; i < indexMinValue; i++){
                countNumbers++;
                proiz = proiz * generatedArray[i];
            }
        }

        if (countNumbers == 0){
            System.out.printf("\nПроизведение: Нет чисел между минимальным и максимальным значениямим");
        }
        if (countNumbers > 0){
            System.out.printf("\nПроизведение чисел между минимальным и максимальным элементом =  %.2f  ", proiz);
        }
        return proiz;
    }
}