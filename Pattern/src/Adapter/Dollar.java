package Adapter;

public class Dollar implements PaySystemVISA{
    double dollar = 0.0;

    public Dollar(double dollar) {
        this.dollar = dollar;
    }

    @Override
    public double getDollar() {
        return dollar;
    }
}
