package lesson9.singletone;

import static lesson9.singletone.Singleton.getSingletonInstance;

public class Main {
    static void main() {
        Singleton singleton = getSingletonInstance();
        System.out.println(singleton);

        Singleton singleton1 = getSingletonInstance();
        System.out.println(singleton1);

    }
}
