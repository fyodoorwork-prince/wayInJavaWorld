package lesson8.multipleimlementarion;

public class MultiFunctionDevice implements Printable, Scunnerable {

    private String a;
    String b;
    protected String string;

    @Override
    public void print(String message) {
        System.out.println("Printing: " + message);
    }

    @Override
    public String scan() {
        return "Scanning...";
    }


}
