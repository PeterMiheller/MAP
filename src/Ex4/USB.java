package Ex4;

public class USB extends ElectricInstrument{
    public USB(double price) {
        super(price);
    }

    @Override
    public double getPrice() {
        return price;
    }
}
