package net.fisher.module;

import net.fisher.config.ConfigManager;
import net.fisher.config.ConfigModel;

/**
 * 生成业务层代码
 */
public class Business {
    public void generate() {
        ConfigModel model = ConfigManager.getInstance().getConfigData();
        if (model.isNeedGenBusiness()) {
            System.out.println("正在生成业务层代码");
        }
    }

}
