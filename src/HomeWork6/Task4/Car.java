package HomeWork6.Task4;

import java.util.List;
import java.util.Scanner;

public class Car {
    private String marka;
    private String model;
    private int year;
    private String oilType;
    private String typeCar;

    public Car(String marka, String model, int year, String oilType, String typeCar) {
        this.marka = marka;
        this.model = model;
        this.year = year;
        this.oilType = oilType;
        this.typeCar = typeCar;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getOilType() {
        return oilType;
    }

    public void setOilType(String oilType) {
        this.oilType = oilType;
    }

    public String getTypeCar() {
        return typeCar;
    }

    public void setTypeCar(String typeCar) {
        this.typeCar = typeCar;
    }

    public static void getListCar(List<Car> cars) {
        if (cars.size() > 0) {
            for (Car i : cars) {
                System.out.printf("Марка %s, Модель %s, Год выпуска %d, Тип топлива %s, Тип кузова %s\n", i.getMarka(), i.getModel(), i.getYear(), i.getOilType(), i.getTypeCar());
            }
        } else {
            System.out.printf("Машин нет в салоне");
        }
    }

    public static void removeCarFromListByLine(List<Car> cars) throws MyException {
        Scanner in = new Scanner(System.in);
        System.out.printf("Список машин :\n");
        getListCar(cars);
        if (cars.size() != 0) {
            System.out.println("Введите номер строки машины которую хотите купить : ");
            int line = in.nextInt();
            if (line > 0) {
                if (line <= cars.size()) {
                    System.out.printf("ПРОДАНА\nМарка %s, Модель %s, Год выпуска %d, Тип топлива %s, Тип кузова %s\n", cars.get(line - 1).getMarka(), cars.get(line - 1).getModel(), cars.get(line - 1).getYear(), cars.get(line - 1).getOilType(), cars.get(line - 1).getTypeCar());
                    cars.remove(line - 1);
                } else {
                    System.out.printf("Такой строки нет в списке\n");
                }
            } else {
                throw new MyException("Значение строки не может быть меньше 1");
            }
        }
    }

    // Вариант с удалением машины по характеристикам
    public static void removeCarFromListByParameters(List<Car> cars) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите марку : ");
        String marka = in.next();
        System.out.println("Введите модель : ");
        String model = in.next();
        System.out.println("Введите год выпуска : ");
        int year = in.nextInt();
        System.out.println("Введите тип топлива : ");
        String oilType = in.next();
        System.out.println("Введите Тип кузова : ");
        String typeCar = in.next();
        for (Car i : cars) {
            if (marka.equals(i.getMarka()) && model.equals(i.getModel()) && year == i.getYear() && oilType.equals(i.getOilType()) && typeCar.equals(i.getTypeCar())) {
                cars.remove(i);
            }
        }
    }

    public static void findCar(List<Car> cars) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите марку : ");
        String marka = in.nextLine();
        System.out.println("Введите Модель : ");
        String model = in.nextLine();
        int count = 0;
        for (Car i : cars) {
            if (marka.equals(i.getMarka()) && model.equals(i.getModel())) {
                System.out.printf("Марка %s, Модель %s, Год выпуска %d, Тип топлива %s, Тип кузова %s\n", i.getMarka(), i.getModel(), i.getYear(), i.getOilType(), i.getTypeCar());
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Такой машины нет в салоне\n");
        }
    }

    public static void addCar(List<Car> cars) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите марку : ");
        String marka = in.next();
        System.out.println("Введите модель : ");
        String model = in.next();
        System.out.println("Введите год выпуска : ");
        int year = in.nextInt();
        System.out.println("Введите тип топлива : ");
        String oilType = in.next();
        System.out.println("Введите Тип кузова : ");
        String typeCar = in.next();
        cars.add(new Car(marka, model, year, oilType, typeCar));
        System.out.println("Машина добавлена в список\n : ");
    }

}

