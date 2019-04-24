package net.fisher.module.impl;

import net.fisher.module.Api;

/**
 * 对接口的实现
 */
public class ApiBImpl implements Api {
    @Override
    public void doSomething(String s) {
        System.out.println("Now in ApiBImpl. The input s == " + s);
    }
}
