package lesson7;

public class Main {
    static void main() {
//        Animal dog = new Dog();
//        Animal cat = new Cat();
//
//
//        Animal[] animals = {dog, cat};
//
//        for (Animal animal : animals) {
//            animal.sound();
//        }
//
//        for (int i = 0; i < animals.length; i++) {
//            if (animals[i] instanceof Dog) {
//                Dog dog1 = (Dog) animals[i];
//                dog1.sound();
//            } else {
//                Cat cat1 = (Cat) animals[i];
//                cat1.sound();
//            }
//        }

        Dog dog = new Dog();
        Cat cat = new Cat();

        Animal[] animals = {dog, cat};

        for (Animal animal : animals) {
            if (animal instanceof Dog) {
                Dog dog1 = (Dog) animal;
                dog1.sound();
                dog1.someMethod();
            } else if (animal instanceof Cat) {
                Cat cat1 = (Cat) animal;
                cat1.sound();
                cat1.someMethod();
            }
        }
    }
}
