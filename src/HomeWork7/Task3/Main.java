package HomeWork7.Task3;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        String text = in.nextLine();
        FileOutputStream fos = null;
        String reverse = new StringBuffer(text).reverse().toString();
        try {
            fos = new FileOutputStream("D://test.txt");
            byte[] buffer = reverse.getBytes();
            fos.write(buffer, 0, buffer.length);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                if (fos != null) {
                    fos.close();
                }
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
}


