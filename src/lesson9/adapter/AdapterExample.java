package lesson9.adapter;

public class AdapterExample {
    static void main() {
        MicroUsbPhone phone = new MicroUsbPhone();
        USB adapter = new UsbAdapter(phone);
        adapter.connectionWithMicroUsbCable();

        UsbPhone usbPhone = new UsbPhone();
        USB adapter2 = new UsbAdapter(usbPhone);
        adapter2.connectionWithUsbCable();

    }
}
