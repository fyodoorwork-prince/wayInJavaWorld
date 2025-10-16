package lesson8;

public class Value {
    static void main() {
        int number = 10;
        changeValue(number);
        System.out.println("Value after changing: " + number);
        int num = changeValue(number);
        System.out.println(num);


    }

    public static int changeValue(int num) {
        num = 20;
        return num;
    }
}
