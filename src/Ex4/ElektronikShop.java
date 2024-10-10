package Ex4;

import javax.sound.midi.Instrument;
import java.util.List;

public class ElektronikShop {
    //1
    public double findCheapestKeyboard(List<Keyboard> keyboards){
        Keyboard cheapest = keyboards.getFirst();
        double minPrice = cheapest.price;

        for (Keyboard keyboard : keyboards) {
            if (keyboard.price < minPrice) {
                cheapest = keyboard;
                minPrice = keyboard.price;
            }
        }
        return cheapest.price;
    }

    //2
    public double findExpensiveInstrument(List<ElectricInstrument> device){
        ElectricInstrument expensive = device.getFirst();
        double maxPrice = expensive.price;

        for (ElectricInstrument instrument : device) {
            if (instrument.price > maxPrice) {
                expensive = instrument;
                maxPrice = instrument.price;
            }
        }
        return expensive.price;
    }

    //3
    public double USBMarkusCanBuy(Human Markus,List<USB> usbDevice){
        ElectricInstrument expensive_USB= new USB(usbDevice.getFirst().price);
        for(USB device: usbDevice){
            if(device.price > expensive_USB.price && expensive_USB.price<= Markus.buget){
                expensive_USB.price=device.price;
            }
        }
        return expensive_USB.price;
    }



}
