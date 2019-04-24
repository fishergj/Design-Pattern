package net.fisher.usewithconfigurabledp;

import net.fisher.module.Api;
import net.fisher.dp.ConfigurableFactory;

public class ClientConfigurableFactory {
    public static void main(String[] args) {
        Api api = ConfigurableFactory.createApi();
        api.doSomething("可配置的简单工厂测试！");
    }
}
