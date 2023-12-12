package team.mediasoft.di.container.config;

import team.mediasoft.di.container.service.PaymentSystem;
import team.mediasoft.di.container.service.impl.CashPaymentSystem;

import java.util.Map;

public class JavaConfiguration implements Configuration {

    @Override
    public String getPackageToScan() {
        return "team.mediasoft.di.container";
    }

    @Override
    public Map<Class, Class> getInterfaceToImplementations() {
        return Map.of(PaymentSystem.class, CashPaymentSystem.class);
    }
}
