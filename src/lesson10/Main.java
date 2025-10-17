package lesson10;

import java.util.Scanner;

public class Main {
    static void main() {
//        Scanner scanner = null;
//
//        try {
//            scanner = new Scanner(System.in);
//            int result = 10/0;
//        } catch (ArithmeticException arithmeticException) {
//            System.out.println("Деление на ноль запрещено");
//        } finally {
//            scanner.close();
//        }
//
//        double result2 = 5/2;
//        System.out.println(result2);

        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter number: ");
            int number = sc.nextInt();
            System.out.println("You have entered: " + number);
        } catch (Exception exception) {
            System.out.println("Error: enter correct number");
        } finally {
            sc.close();
        }
    }
}
