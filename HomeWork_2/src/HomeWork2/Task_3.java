package HomeWork2;

import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args){
        getArray();
        }

        public static String[][] getArray(){
            Scanner in = new Scanner(System.in);

            System.out.println("Введите size1:");
            int size1 = in.nextInt();
            while (size1 <= 0){
                System.out.println("Неверное значение. Введите size1 еще раз:");
                size1 = in.nextInt();
            }

            System.out.println("Введите size2:");
            int size2 = in.nextInt();
            while (size2 <= 0){
                System.out.println("Неверное значение. Введите size2 еще раз:");
                size2 = in.nextInt();
            }

            String[][] array = new String[size1][size2];
            for (int i = 0; i < array.length; i++) {
                System.out.println();
                for(int j = 0; j < array[i].length; j++) {
                    array[i][j] = "*";
                    System.out.print((array[i][j]));
                }
        }
        return array;
    }
}
