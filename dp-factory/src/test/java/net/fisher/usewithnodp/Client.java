package net.fisher.usewithnodp;

import net.fisher.module.Api;
import net.fisher.module.impl.ApiAImpl;

public class Client {
    public static void main(String[] args) {
        Api api = new ApiAImpl();
        api.doSomething("use with no dp!");
    }
}
