package net.fisher.inter.impl;

import net.fisher.domain.LogModel;
import net.fisher.inter.LogDbOperateApi;

import java.util.List;

public class LogDbOperate implements LogDbOperateApi {
    /**
     * 新增日志
     *
     * @param model
     */
    @Override
    public void createLog(LogModel model) {
        System.out.println("now in LogDbOperate createLog, LogModel=" + model);
    }

    /**
     * 修改日志
     *
     * @param model
     */
    @Override
    public void updateLog(LogModel model) {
        System.out.println("now in LogDbOperate updateLog, LogModel = " + model);
    }

    /**
     * 删除日志
     *
     * @param model
     */
    @Override
    public void removeLog(LogModel model) {
        System.out.println("now in LogDbOperate removeLog, LogModel = " + model);
    }

    /**
     * 获取所有日志
     *
     * @return
     */
    @Override
    public List<LogModel> getAllLog() {
        System.out.println("now in LogDbOperate getAllLog");
        return null;
    }
}
