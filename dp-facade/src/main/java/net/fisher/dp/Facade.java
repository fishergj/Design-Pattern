package net.fisher.dp;

import net.fisher.module.Business;
import net.fisher.module.DAO;
import net.fisher.module.Presentation;

/**
 * 外观模式
 */
public class Facade {
    private Facade() {

    }

    public static void generate() {
        new Presentation().generate();
        new Business().generate();
        new DAO().generate();
    }
}
