package net.fisher.inter;

import net.fisher.domain.LogModel;

import java.util.List;

public interface LogDbOperateApi {
    /**
     * 新增日志
     * @param model
     */
    public void createLog(LogModel model);

    /**
     * 修改日志
     * @param model
     */
    public void updateLog(LogModel model);

    /**
     * 删除日志
     * @param model
     */
    public void removeLog(LogModel model);

    /**
     * 获取所有日志
     * @return
     */
    public List<LogModel> getAllLog();
}
