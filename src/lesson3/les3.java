package lesson3;

import java.util.Scanner;

public class les3 {
    static void main() {
        // if, else, for, while, switch
        Scanner sc = new Scanner(System.in);
//        System.out.println("Ente your age: ");
//        int age = sc.nextInt();
//
//        // Проверка возраста
//         if (age < 18) {
//             System.out.println("You are younger then 18");
//         } else if (age >= 18 && age <= 65) {
//             System.out.println("You are an adult");
//         } else {
//             System.out.println("You are old");
//         }

//        System.out.println("Enter number");
//        int number = sc.nextInt();
//
//        int sum = 0;
//
//        for (int i = 1; i < number; i++) {
//            sum += i;
//        }
//        System.out.println("Factorial of number " + number + " = " + sum);

//        int number = 5;
//        int i = 1;
//        while (true) {
//
//            if (i >= number){
//                break;
//            }
//            System.out.println("Dedos");
//            i++;
//        }

        System.out.println("Enter number day week (1-7)");
        int day = sc.nextInt();
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case  6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day");
                break;
        }
        sc.close();
    }
}
