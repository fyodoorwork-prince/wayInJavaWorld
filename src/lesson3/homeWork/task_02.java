package lesson3.homeWork;

import java.util.Scanner;

public class task_02 {
    /**
     Задача 2: Калькулятор с использованием switch-case

     Напишите программу, которая запрашивает у пользователя два числа и оператор (+, -, *, /)
     и выполняет соответствующую операцию с этими числами. Используйте switch-case для выбора операции.
     Программа должна выводить результат операции.
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b;

        System.out.println("Enter first number: ");
        a = sc.nextDouble();
        System.out.println("Enter second number: ");
        b = sc.nextDouble();

        System.out.println("Enter operator (+, -, *, /): ");
        char operator = sc.next().charAt(0);
        double result;

        switch (operator) {
            case '+':
                result = a + b;
                System.out.println("Result: " + result);
                break;
                case  '-':
                result = a - b;
                System.out.println("Result: " + result);
                break;
                case '*':
                result = a * b;
                System.out.println("Result: " + result);
                break;
                case '/':
                result = a / b;
                System.out.println("Result: " + result);
                break;
                default:
                System.out.println("Invalid operator");
                break;
        }
        sc.close();


    }
}
