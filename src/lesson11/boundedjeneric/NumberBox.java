package lesson11.boundedjeneric;

import java.util.LinkedList;

public class NumberBox<T extends Number> {
    private T number;

    public NumberBox(T number) {
        this.number = number;
    }

    public double doubleValue() {
        return number.doubleValue();
    }
}
