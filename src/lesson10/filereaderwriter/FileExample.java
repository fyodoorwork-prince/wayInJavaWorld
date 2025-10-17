package lesson10.filereaderwriter;

import java.io.*;

public class FileExample {


    static void main() {
//        String filePath = "example.txt";
//
//        try (FileWriter writer = new FileWriter(filePath);
//             BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
//            writer.write("Hi, Java IO!");
//            writer.flush();
//
//            String line;
//            while ((line = reader.readLine()) != null) {
//                System.out.println(line);
//            }
//        } catch (IOException e) {
//            System.out.println("Ошибка при работе с файлом: " + e.getMessage());
//        }

        String sourceFile = "source.txt";
        String destFile = "destination.txt";

        try (FileInputStream in = new FileInputStream(sourceFile);
             FileOutputStream out = new FileOutputStream(destFile)) {
            byte[] buffer = new byte[8 * 1024];
            int bytesRead;
            while ((bytesRead = in.read(buffer)) != -1) {
                out.write(buffer, 0, bytesRead);
            }
            System.out.println("Копирование завершено");
        } catch (IOException e) {
            System.out.println("Ошибка при работе с файлами: " + e.getMessage());
        }

    }
}
