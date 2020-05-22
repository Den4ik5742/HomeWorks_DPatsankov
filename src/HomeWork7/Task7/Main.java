package HomeWork7.Task7;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите дату yyyy/mm/dd_HH:MM:SS");
        String ipAddress = in.nextLine();
        Pattern pattern = Pattern.compile("([0-9]{4})/(0?[1-9]|1?[0-2])/(0?[1-9]|1?[0-9]|2?[0-9]|3?[0-1])\\s(0?[0-9]|1?[0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9]");
        Matcher matcher = pattern.matcher(ipAddress);
        boolean isDateFormate = matcher.matches();
        if (isDateFormate) {
            System.out.println("Дата");
        } else {
            System.out.println("не дата");
        }
    }
}
