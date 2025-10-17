package lesson9.observer;

public class Main {
    static void main() {
        Publisher publisher = new Publisher();
        Observer alice = new Subscriber("Alice");
        Observer oleg = new Subscriber("Oleg");

        publisher.subscribe(alice);
        publisher.subscribe(oleg);

        alice.update("Some message");
        oleg.update("Another message");
    }
}
