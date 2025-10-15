package lesson5;

public class Persson {
    private String name;
    private int age;
    private int account;

    public Persson() {
    }

    public void setAccount(int account) {
        this.account = account;
    }

    public int getAccount() {
        return account;
    }



    public Persson(String name, int age, int account) {
        this.name = name;
        this.age = age;
    }

    void sayHello() {
        System.out.println("Hello, my name is " + name + " and I am " + age + " years old");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Persson{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", account=" + account +
                '}';
    }
}
