package Ex4;

import java.util.List;

public class ElektronikShop {
    //1
    public int findCheapestKeyboard(List<Keyboard> keyboards){
        Keyboard cheapest = keyboards.getFirst();
        int minPrice = cheapest.price;

        for (Keyboard keyboard : keyboards) {
            if (keyboard.price < minPrice) {
                cheapest = keyboard;
                minPrice = keyboard.price;
            }
        }
        return cheapest.price;
    }

    //2
    public int findExpensiveInstrument(List<Keyboard> keyboards, List<USB> usbDevices){
        int maxPrice = keyboards.getFirst().getPrice();
        for (Keyboard keyboard : keyboards) {
            if (keyboard.price > maxPrice) {
                maxPrice = keyboard.price;
            }
        }

        for (USB usb : usbDevices) {
            if (usb.price > maxPrice) {
                maxPrice = usb.price;
            }
        }

        return maxPrice;
    }

    //3
    public int USBMarkusCanBuy(Human Markus,List<USB> usbDevice){
        int mostExpensiveUSB=-1;
        for(USB device: usbDevice){
            if(device.price > mostExpensiveUSB && device.price<= Markus.buget){
                mostExpensiveUSB=device.price;
            }
        }
        return mostExpensiveUSB;
    }

    //4
    public int howMuchCanMarkusBuy(Human Markus,List<Keyboard> keyboards, List<USB> usbDrives) {
        int maxAmount = -1;
        for (Keyboard keyboard : keyboards) {
            for (USB usb : usbDrives) {
                int totalPrice = keyboard.getPrice() + usb.getPrice();
                if (totalPrice <= Markus.buget) {
                    maxAmount = Math.max(maxAmount, totalPrice);
                }
            }
        }
        return maxAmount;
    }

}
