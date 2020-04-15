package HomeWork2;

import java.util.Scanner;

public class Task_8 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number n:");
        int n = in.nextInt();
        while (n <= 1){
            System.out.println("Wrong value. Enter number more than 1:");
            n = in.nextInt();
        }
        int i = 2;
        int count = 2;
        int result = recursionFunc(n, i, count);
        if (result == 2){
            System.out.printf("«Is number %d simple - YES»", n);
        }
        else
        {
            System.out.printf("«Is number %d simple - NO»", n);
        }
    }

    static int recursionFunc(int n, int i, int count) {
        if (n == 2) {
            return count;
        }
        else if (n % i == 0) {
            count++;
            if (i < n / 2) {
                return recursionFunc(n, i + 1, count);
            }
        }
        else if (i < n / 2) {
            return recursionFunc(n, i + 1, count);
       }
        System.out.printf("«Number %d can be divided on %d numbers»\n", n, count);
            return count;
    }
}
