package lesson4;

import java.util.Scanner;

public class Recursion {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println(factorial(20));
        System.out.println(recursiveFactorial(20));

    }


    public static long factorial(int number) {
        long result = 1;
        for (int i = 2; i <= number; i++) {
            result  *= i;
        }
        return result;
    }

    public static long recursiveFactorial(int number) {
        if (number <= 1) return 1;
        return number * recursiveFactorial(number - 1);
    }
}
