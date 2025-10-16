package lesson8.Interface;

public class Main {
    static void main() {
        Shape circle = new Circle(4.0);
        Shape rectangle = new Rectangle(5.0, 7.0);

        System.out.println("Circle Area: " + circle.calculateArea());
        System.out.println("Circle Perimeter: " + circle.calculatePerimeter());

        System.out.println("Rectangle Area: " + rectangle.calculateArea());
        System.out.println("Rectangle Perimeter: " + rectangle.calculatePerimeter());

    }
}
