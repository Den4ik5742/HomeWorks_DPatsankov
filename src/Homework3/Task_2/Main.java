package HomeWork3.Task_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Действия: Сумма(+), Вычитание(-), Деление(/), Умножение(*), а в степени b(^)");
        System.out.println("Введите a:");
        double a = in.nextDouble();
        System.out.println("Введите действие:");
        String op = in.next();
        System.out.println("Введите b:");
        double b = in.nextDouble();
        Calculator calculator = new Calculator();
        calculator.setA(a);
        calculator.setB(b);
        System.out.printf("a = %.2f, b = %.2f\n", calculator.getA(), calculator.getB());
        calculator.mathAction(op);
    }
}

