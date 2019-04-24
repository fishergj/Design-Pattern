package net.fisher.usewithdp;

import net.fisher.module.Api;
import net.fisher.dp.Factory;

public class ClientFactory {
    public static void main(String[] args) {
        Api api = Factory.createApi(1);
        api.doSomething("正在使用工厂模式！");
    }

}
