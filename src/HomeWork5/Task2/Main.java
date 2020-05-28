package HomeWork5.Task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите большую букву английского алфавита");
        String letter = in.next();
        System.out.println(Alphabet.valueOf(letter).getLetterPosition());
    }
}
