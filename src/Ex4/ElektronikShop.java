package Ex4;

import javax.sound.midi.Instrument;
import java.util.List;

public class ElektronikShop {
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

}
