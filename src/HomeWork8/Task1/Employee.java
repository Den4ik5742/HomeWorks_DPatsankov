package HomeWork8.Task1;

public class Employee {
    String name, surname, position, stage;

    public Employee(String name, String surname, String position, String stage) {
        this.name = name;
        this.surname = surname;
        this.position = position;
        this.stage = stage;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPosition() {
        return position;
    }

    public String getStage() {
        return stage;
    }
}
