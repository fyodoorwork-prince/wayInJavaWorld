package lesson9;

public class Parent {

    public static int staticField;
    protected String message = "Hello from Parent class";

    public Parent() {
        staticField++;
    }

    protected void displayMessage() {
        System.out.println(message);
    }
}
