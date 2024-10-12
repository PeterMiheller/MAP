package Ex4;

public class Keyboard extends ElectricInstrument {
    public Keyboard(int price) {
        super(price);
    }

    @Override
    public int getPrice() {
        return price;
    }


}
