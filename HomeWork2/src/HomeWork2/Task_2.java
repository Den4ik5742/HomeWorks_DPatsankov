package HomeWork2;

import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.println("Введите число n:");
        int n = in.nextInt();
        while (n <= 0){
            System.out.println("Неверное значение. Введите число еще раз:");
            n = in.nextInt();
        }

        String result = getDay(n);
        System.out.printf("%d-ый день %s\n", n, result);
    }

    public static String getDay(int n){
        String result = "";
        switch (n%7) {
            case 1:
                result = "Понедельник";
                break;
            case 2:
                result = "Вторник";
                break;
            case 3:
                result = "Среда";
                break;
            case 4:
                result = "Четверг";
                break;
            case 5:
                result = "Пятница";
                break;
            case 6:
                result = "Суббота";
                break;
            case 0:
                result = "Воскресенье";
                break;
        }
        return result;
    }

}
