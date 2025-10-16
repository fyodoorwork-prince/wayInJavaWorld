package lesson8;

import lesson8.multipleimlementarion.MultiFunctionDevice;

public class Main {
    static void main() {
//        Vehicle car = new Car();
//        Vehicle bike = new Bike();
//
//        car.startEngin();
//        bike.startEngin();
//
//        car.stopEngin();
//        bike.stopEngin();

//        MultiFunctionDevice multiFunctionDevice = new MultiFunctionDevice();
//        multiFunctionDevice.print("Hello, world!");
//        System.out.println(multiFunctionDevice.scan());

        MyObject myObject = new MyObject();
        myObject.value = 10;

        modifyObject(myObject);
        System.out.println("Value after modification: " + myObject.value);




    }

    public static void modifyObject(MyObject object) {
        object.value = 20;
    }
}
