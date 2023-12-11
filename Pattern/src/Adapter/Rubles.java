package Adapter;

public class Rubles implements PaySystemMIR{
    double rubles = 0.0;

    public Rubles(double rubles) {
        this.rubles = rubles;
    }

    @Override
    public double getRUB() {
        return rubles;
    }
}
