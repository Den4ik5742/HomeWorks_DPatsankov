package HomeWork2;

import java.util.Scanner;

public class Task_5 {
    public static void main(String[] args){
        double[] generatedArray = getArray();
        sortBubble(generatedArray);
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

    public static double[] sortBubble(double[] generatedArray) {
        System.out.print("Отсортированый массив : ");
        for (int i = generatedArray.length - 1; i >= 0; i--){
            for(int j = 0; j < i; j++) {
                if (generatedArray[j] < generatedArray[j + 1]) {
                    double variable = generatedArray[j];
                    generatedArray[j] = generatedArray[j + 1];
                    generatedArray[j + 1] = variable;
                }
            }
            System.out.printf("%.1f  ", (generatedArray[i]));
        }
        return generatedArray;
    }
}
