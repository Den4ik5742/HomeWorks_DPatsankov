package HomeWork3.Task_1;

import java.util.ArrayList;
import java.util.List;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Students> students = new ArrayList<>();
        students.add(new Students("Ivan", "Ivanov", "27.12.2000", 2));
        students.add(new Students("Petr", "Petrov", "20.10.2002", 1));
        students.add(new Students("Maria", "Ivanova", "04.07.1999", 4));
        students.add(new Students("Lev", "Vasilev", "04.03.1999", 4));
        students.add(new Students("Denis", "Patsankov", "27.12.2000", 3));
        students.add(new Students("Anton", "Tolstoi", "03.07.2001", 1));
        Scanner in = new Scanner(System.in);
        System.out.println("Введите курс:");
        int course = in.nextInt();
        while (course < 1 || course > 5) {
            System.out.println("Курс должен быть от 1 до 5. Введите курс еще раз:");
            course = in.nextInt();
        }
        Students.printStudents(students, course);
    }
}

