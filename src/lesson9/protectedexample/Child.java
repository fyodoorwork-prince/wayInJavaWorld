package lesson9.protectedexample;

import lesson9.Parent;

public class Child extends Parent {

    static int[] arr;

    static {
        for (int i = 0; i < arr.length; i++) {

        }
    }

    public static class Child2 {

    }

    public void useProtected() {
        System.out.println(this.message);
        displayMessage();
    }

    static void main() {
        Child child = new Child();
        child.useProtected();

        System.out.println(Parent.staticField);

        Child child1 = new Child();
        System.out.println(Parent.staticField);


    }
}
