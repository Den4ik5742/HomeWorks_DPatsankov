package HomeWork4.Task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Том", "Всеядное", "Кошачьи", "Сиамский");
        Dog dog = new Dog("Рекс", "Всеядное", "Собачьи", "Овчарка");
        Mouse mouse = new Mouse("Мики Маус", "Травоядное", "Мышиные", "Полевая");
        Scanner in = new Scanner(System.in);
        System.out.println("Выберите животное:\n 1.Кот\n 2.Собака \n 3.Мышь \n");
        int number = in.nextInt();
        switch (number) {
            case 1:
                System.out.printf("Информация о животном :\nИмя: %s, Тип: %s, Семейство: %s, Порода: %s\n", cat.getName(), cat.getType(), cat.getFamily(), cat.getBreed());
                System.out.print(cat.getName() + " Может издать звук "); cat.speak();
                System.out.print(cat.getName() + " "); cat.move();
                System.out.print(cat.getName() + " "); cat.eat();
                System.out.print(cat.getName() + " "); cat.eatable();
                break;
            case 2:
                System.out.printf("Информация о животном :\nИмя: %s, Тип: %s, Семейство: %s, Порода: %s\n", dog.getName(), dog.getType(), dog.getFamily(), dog.getBreed());
                System.out.print(dog.getName() + " Может издать звук "); dog.speak();
                System.out.print(dog.getName() + " "); dog.move();
                System.out.print(dog.getName() + " "); dog.eat();
                break;
            case 3:
                System.out.printf("Информация о животном :\nИмя: %s, Тип: %s, Семейство: %s, Порода: %s\n", mouse.getName(), mouse.getType(), mouse.getFamily(), mouse.getBreed());
                System.out.print(mouse.getName() + " Может издать звук "); mouse.speak();
                System.out.print(mouse.getName() + " "); mouse.move();
                System.out.print(mouse.getName() + " "); mouse.eatable();;
                break;
            default:
                System.out.println("Такого животного нет");
                break;
        }
    }
}