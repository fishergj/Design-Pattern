package net.fisher.dp;

import net.fisher.domain.LogModel;
import net.fisher.inter.LogDbOperateApi;
import net.fisher.inter.LogFileOperateApi;

import java.util.List;

public class Adapter implements LogDbOperateApi {
    /**
     * 需要被适配的接口对象
     */
    private LogFileOperateApi adaptee;

    public Adapter(LogFileOperateApi adaptee) {
        this.adaptee = adaptee;
    }

    /**
     * 新增日志
     *
     * @param model
     */
    @Override
    public void createLog(LogModel model) {
        List<LogModel> list = adaptee.readLogFile();
        list.add(model);
        adaptee.writeLogFile(list);
    }

    /**
     * 修改日志
     *
     * @param model
     */
    @Override
    public void updateLog(LogModel model) {
        List<LogModel> list = adaptee.readLogFile();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getLogId().equals(model.getLogId())) {
                list.set(i, model);
                break;
            }
        }
        adaptee.writeLogFile(list);
    }

    /**
     * 删除日志
     *
     * @param model
     */
    @Override
    public void removeLog(LogModel model) {
        List<LogModel> list = adaptee.readLogFile();
        list.remove(model);
        adaptee.writeLogFile(list);
    }

    /**
     * 获取所有日志
     *
     * @return
     */
    @Override
    public List<LogModel> getAllLog() {
        return adaptee.readLogFile();
    }
}
