package net.fisher.module.impl;

import net.fisher.module.Api;

/**
 * 对接口的实现
 */
public class ApiAImpl implements Api {
    @Override
    public void doSomething(String s) {
        System.out.println("Now in ApiAImpl. The input s == "  + s);
    }
}
