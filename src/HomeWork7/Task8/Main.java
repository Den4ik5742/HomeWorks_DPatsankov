package HomeWork7.Task8;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите Url адрес");
        String url = in.next();
        Pattern pattern = Pattern.compile("^(http|https)://\\w+\\.\\w{2,3}/$");
        Matcher matcher = pattern.matcher(url);
        if (matcher.find()) {
            System.out.println("Верный Url");
        } else {
            System.out.println("Не верный Url");
        }
    }
}

