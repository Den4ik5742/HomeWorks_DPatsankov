package HomeWork6.Task4;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Car> cars = new LinkedList<>();
        cars.add(new Car("BMW", "X6", 2000, "Disel", "Sedan"));
        cars.add(new Car("AUDI", "A4", 1996, "Disel", "Universale"));
        cars.add(new Car("Ford", "Fusion", 2003, "Disel", "Hatchback"));
        cars.add(new Car("BMW", "X6", 2003, "Benzin", "Hatchback"));
        cars.add(new Car("Opel", "Astra G", 2009, "Benzin", "Sedan"));

        boolean flag = true;
        while (flag) {
            System.out.println("\n1.Добавить авто \n2.Найти авто \n3.Купить авто \n4.Список всех авто \n");
            Scanner in = new Scanner(System.in);
            int selectedPoint = in.nextInt();
            switch (selectedPoint) {
                case 1: {
                    Car.addCar(cars);
                    break;
                }
                case 2: {
                    Car.findCar(cars);
                    break;
                }
                case 3: {
                    try {
                        Car.removeCarFromListByLine(cars);
                    } catch (MyException e) {
                        e.printStackTrace();
                    }
                    break;
                }
                case 4: {
                    Car.getListCar(cars);
                    break;
                }
            }
        }
    }
}

