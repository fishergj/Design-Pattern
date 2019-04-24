package net.fisher.client;

import net.fisher.module.Business;
import net.fisher.module.DAO;
import net.fisher.module.Presentation;

/**
 * 普通客户端类
 */
public class ClientWithNoDP {
    public static void main(String[] args) {
        // 没有使用模式，需要对三个模块各自调用
        new Presentation().generate();
        new Business().generate();
        new DAO().generate();
    }
}
