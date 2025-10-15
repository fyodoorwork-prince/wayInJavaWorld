package lesson5;

public class Calculator {
    public int sum(int a, int b){
        return a + b;
    }

    public int sub(int a, int b){
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public double divide(int a, int b){
        if (b == 0) {
            System.out.println("Error; Division by zero");
            return 0;
        }
        return (double) a/b;
    }

    static void main() {
        Calculator calc = new Calculator();
        System.out.println(calc.sum(1, 1));
        System.out.println(calc.sub(10, 2));
        System.out.println(calc.multiply(10, 20));
        System.out.println(calc.divide(5, 2));
    }
}
