package HomeWork7.Task5;

import java.io.*;
import java.util.Objects;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class Main {
    public static void main(String[] args) throws IOException {
        createDir();
        createFiles("D://test/test1.txt");
        createFiles("D://test/test2.txt");
        createFiles("D://test/test3.txt");
        zipFolder(createDir());
        File renamedFile = renameDir(createDir());
        removeDir(renamedFile);
    }

    public static File createDir() {
        File directory = new File("D://test");
        if (!directory.exists()) {
            System.out.println("Directory: " + directory.getName());
            directory.mkdir();
        }
        return directory;
    }

    public static void createFiles(String fileName) {
        String text = "Hello World Denis!";
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(fileName);
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
        }
    }

    private static void zipFolder(File file) {
        try (FileInputStream entry1 = new FileInputStream("D:\\test\\test1.txt");
             FileInputStream entry2 = new FileInputStream("D:\\test\\test2.txt");
             FileInputStream entry3 = new FileInputStream("D:\\test\\test3.txt");
             ZipOutputStream zout = new ZipOutputStream(new FileOutputStream("D:\\test\\test.zip"))) {

            zout.putNextEntry(new ZipEntry("test1.txt"));
            byte[] buffer = new byte[entry1.available()];
            entry1.read(buffer);
            zout.write(buffer);
            zout.closeEntry();

            zout.putNextEntry(new ZipEntry("test2.txt"));
            byte[] buffer2 = new byte[entry2.available()];
            entry2.read(buffer2);
            zout.write(buffer2);
            zout.closeEntry();

            zout.putNextEntry(new ZipEntry("test3.txt"));
            byte[] buffer3 = new byte[entry3.available()];
            entry3.read(buffer3);
            zout.write(buffer3);
            zout.closeEntry();

        } catch (IOException exc) {
            System.out.println("IO error!" + exc);
        }
    }

    public static File renameDir(File file) {
        File newDir = new File("D://NewDirRenamed");
        file.renameTo(newDir);
        return newDir;
    }

    public static void removeDir(File file) {
        for (File item : Objects.requireNonNull(file.listFiles())) {
            item.delete();
        }
        file.delete();
    }
}