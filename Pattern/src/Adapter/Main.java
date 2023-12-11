package Adapter;

public class Main {
    public static void main(String[] args) {
        VISA_Adapter_MIR visa = new VISA_Adapter_MIR(new Dollar(50));
        System.out.println(visa.getRUB());
        MIR_Adapter_VISA mir = new MIR_Adapter_VISA(new Rubles(2.5));
        System.out.println((mir.getDollar()));
    }
}
