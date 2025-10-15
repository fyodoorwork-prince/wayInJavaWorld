package lesson5;

import java.util.Arrays;

public class Oop {
    static void main() {
        Persson ivan = new Persson("Ivan", 33, 1000000);
        ivan.sayHello();

        Persson olga = new Persson("Olga", 27, 500000);
        olga.sayHello();

        Persson kirill = new Persson();
        kirill.sayHello();

        System.out.println(ivan.getName());

        int [] arr = {1, 2,3,4,5};
        System.out.println(Arrays.toString(arr));

        System.out.println(ivan);

    }
}
