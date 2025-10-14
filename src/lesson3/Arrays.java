package lesson3;

public class Arrays {
    static void main() {
        int [] array;
        int [] array2 = new int[5];
        int [] array3 = {11, 23, 101};

//        System.out.println(array2[2]);
//        System.out.println(array3[2]);

        for (int i = 0; i < array3.length; i++) {
            System.out.println(array3[i]);
        }

        System.out.println();

    }

    public static int funcionDoNothiing(int sum){
        sum += 1;
        return sum;
    }

    public static int sum(int a, int b) {
        int result = a + b;
        return result;
    }

    public static int devide(int a, int b) {
        int result = a / b;
        return result;
    }
}
