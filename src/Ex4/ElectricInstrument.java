package Ex4;

public abstract class ElectricInstrument {
    int price;

    public ElectricInstrument(int price) {
        this.price = price;
    }

    public abstract int getPrice();
}
