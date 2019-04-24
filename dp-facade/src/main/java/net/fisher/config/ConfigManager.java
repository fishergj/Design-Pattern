package net.fisher.config;

/**
 * 配置管理器，读取配置文件并将配置信息设置到Model中，采用单例
 */
public class ConfigManager {
    private static ConfigManager manager = null;

    private static ConfigModel model = null;

    private ConfigManager() {

    }

    public static ConfigManager getInstance() {
        if (manager == null) {
            manager = new ConfigManager();
            model = new ConfigModel();
            // 读取配置文件并设置到配置Model中，以下直接赋值
            model.setNeedGenBusiness(true);
            model.setNeedGenDAO(true);
            model.setNeedGenPresentation(true);
        }
        return manager;
    }

    /**
     * 获取配置Model
     * @return
     */
    public ConfigModel getConfigData() {
        return model;
    }
}
