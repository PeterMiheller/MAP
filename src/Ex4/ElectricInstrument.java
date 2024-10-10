package Ex4;

public abstract class ElectricInstrument {
    double price;

    public ElectricInstrument(double price) {
        this.price = price;
    }

    public abstract double getPrice();
}
