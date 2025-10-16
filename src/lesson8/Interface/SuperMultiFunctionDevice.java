package lesson8.Interface;

import lesson8.multipleimlementarion.MultiFunctionDevice;

public class SuperMultiFunctionDevice extends MultiFunctionDevice {

    public void someMethod() {
        SuperMultiFunctionDevice multiFunctionDevice = new SuperMultiFunctionDevice();
        multiFunctionDevice.string = "";
    }

    public static void main(String[] args) {
        SuperMultiFunctionDevice superMultifunctionDevice = new SuperMultiFunctionDevice();
        System.out.println(superMultifunctionDevice.string);
    }

}
