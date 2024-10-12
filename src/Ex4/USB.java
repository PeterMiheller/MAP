package Ex4;

public class USB extends ElectricInstrument{
    public USB(int price) {
        super(price);
    }

    @Override
    public int getPrice() {
        return price;
    }
}
