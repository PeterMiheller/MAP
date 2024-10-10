package Ex4;

public class Keyboard extends ElectricInstrument{
    public Keyboard(double price) {
        super(price);
    }

    @Override
    public double getPrice() {
        return price;
    }
}
