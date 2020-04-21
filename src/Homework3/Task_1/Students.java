package HomeWork3.Task_1;

import java.util.List;

public class Students {
    private String name;
    private String surname;
    private String dateOfBirthday;
    private int course;

    public Students(String name, String surname, String dateOfBirthday, int course) {
        this.name = name;
        this.surname = surname;
        this.dateOfBirthday = dateOfBirthday;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getDateOfBirthday() {
        return dateOfBirthday;
    }

    public void setDateOfBirthday(String dateOfBirthday) {
        this.dateOfBirthday = dateOfBirthday;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public static void printStudents(List<Students> students, int course) {
        int counter = 0;
        System.out.printf("Студенты %d-го курса : \n", course);
        for (Students student : students) {
            if (student.course == course) {
                System.out.println(student.name);
                counter++;
            }
        }
        if (counter == 0) {
            System.out.printf("Студентов %d-го курса нету\n", course);
        }
    }
}
