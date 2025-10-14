package lesson3.homeWork;

import java.util.Scanner;

public class task_01 {
/** Задача 1: Сумма положительных чисел
 Напишите программу, которая использует цикл while для суммирования положительных чисел,
 вводимых пользователем. Ввод продолжается до тех пор,
 пока пользователь не введёт отрицательное число.
 При вводе отрицательного числа программа должна завершить цикл и вывести общую сумму положительных чисел.*/
    public static void main(String[] args) {
        int sum = 0;
        int number;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter number: ");
            number = sc.nextInt();
            if (number < 0) {
                break;
            }
            sum += number;
        }
        System.out.println("Sum of positive numbers: " + sum);
        sc.close();
    }
}
