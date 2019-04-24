package net.fisher.config;

/**
 * 描述配置数据Model
 */
public class ConfigModel {
    /**
     * 是否需要生成表现层
     */
    private boolean needGenPresentation = true;

    /**
     * 是否需要生成业务层
     */
    private boolean needGenBusiness = true;

    /**
     * 是否需要生成数据层
     */
    private boolean needGenDAO = true;

    public boolean isNeedGenBusiness() {
        return needGenBusiness;
    }

    public void setNeedGenBusiness(boolean needGenBusiness) {
        this.needGenBusiness = needGenBusiness;
    }

    public boolean isNeedGenDAO() {
        return needGenDAO;
    }

    public void setNeedGenDAO(boolean needGenDAO) {
        this.needGenDAO = needGenDAO;
    }

    public boolean isNeedGenPresentation() {
        return needGenPresentation;
    }

    public void setNeedGenPresentation(boolean needGenPresentation) {
        this.needGenPresentation = needGenPresentation;
    }
}
