package lesson11.boundedjeneric;

public class BoundedGenericsExample {
    static void main() {
        NumberBox<Integer> intBox = new NumberBox<>(10);
        System.out.println(intBox.doubleValue());

        NumberBox<Double> numberNumberBox = new NumberBox<>(15.5);
        System.out.println(numberNumberBox.doubleValue());


    }
}
