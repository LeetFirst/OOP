package Adapter;

public class MIR_Adapter_VISA implements PaySystemVISA{
    private PaySystemMIR MIR;

    public MIR_Adapter_VISA(PaySystemMIR MIR) {
        this.MIR = MIR;
    }
    @Override
    public double getDollar(){
        return MIR.getRUB() * 20;
    }
}
