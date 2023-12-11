package Adapter;

public class VISA_Adapter_MIR implements PaySystemMIR {
    private PaySystemVISA VISA;

    public VISA_Adapter_MIR(PaySystemVISA VISA) {
        this.VISA = VISA;
    }

    @Override
    public double getRUB() {
        return VISA.getDollar() / 20.0; // пусть хотя бы здесь доллар будет по 20 :)
    }
}
