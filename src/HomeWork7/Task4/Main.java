package HomeWork7.Task4;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String text = "Hello World Denis!";
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
            String fileName = in.next();
            try {
                BufferedReader reader = new BufferedReader(new FileReader(fileName));
                StringBuilder stringBuilder = new StringBuilder();
                String line;
                while ((line = reader.readLine()) != null) {
                    stringBuilder.append(line);
                }
                String str = stringBuilder.toString();
                String[] subStr;
                String delimeter = " ";
                subStr = str.split(delimeter);
                for (int i = subStr.length - 1; i >= 0; i--) {
                    System.out.print(subStr[i] + " ");
                }
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


