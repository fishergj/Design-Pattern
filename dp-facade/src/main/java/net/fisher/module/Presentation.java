package net.fisher.module;

import net.fisher.config.ConfigManager;
import net.fisher.config.ConfigModel;

/**
 * 生成表现层的模块
 */
public class Presentation {
    public void generate() {
        ConfigModel model = ConfigManager.getInstance().getConfigData();
        if (model.isNeedGenPresentation()) {
            System.out.println("正在生成表现层代码！");
        }
    }
}
