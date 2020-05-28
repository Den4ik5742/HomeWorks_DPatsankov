package HomeWork7.Task1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        String text = "Hello World!";
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("D://test.txt");
            byte[] buffer = text.getBytes();
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

            FileInputStream fin;
            String filename = in.next();
            try {
                fin = new FileInputStream(filename);
                System.out.printf("File size : %d bytes \n", fin.available());
                int max = fin.read();
                int i;
                while ((i = fin.read()) != -1) {
                    if (i > max) {
                        max = i;
                    }
                }
                System.out.println(max);
                System.out.println((char) max);
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
}

