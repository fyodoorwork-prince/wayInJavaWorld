package lesson6;

public class Oop {
    static void main() {
        Person ivan = new Person();
        ivan.setName("Ivan");
        ivan.setAge(-1);
        ivan.displayInfo();

        Animal animal = new Animal("Животное");
        Dog dog = new Dog("Bobik");
        Cat cat = new Cat("Barsik");

        animal.speak();
        dog.speak();

        Client client = new Client();
        client.setAnimal(cat);
        client.getAnimal().speak();

    }
}
