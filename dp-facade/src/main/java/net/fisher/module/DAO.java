package net.fisher.module;

import net.fisher.config.ConfigManager;
import net.fisher.config.ConfigModel;

/**
 * 生成数据层代码
 */
public class DAO {
    public void generate() {
        ConfigModel model = ConfigManager.getInstance().getConfigData();
        if (model.isNeedGenDAO()) {
            System.out.println("正在生成数据层代码");
        }
    }
}
