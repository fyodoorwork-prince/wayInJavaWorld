package lesson10.customexeption;

public class CustomExceptionExample {
    public static void validateAge(int age) throws InvalidAgeException {
        if (age < 0 || age > 120) {
            throw new InvalidAgeException("Возраст должен быть от 0 до 120 лет.");
        }
        System.out.println("Возраст действителен: " + age);
    }

    static void main(String[] args) {
        try {
            validateAge(25);
            validateAge(-5);
        } catch (InvalidAgeException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

}
