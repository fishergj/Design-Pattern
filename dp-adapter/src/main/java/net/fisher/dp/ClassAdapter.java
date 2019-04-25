package net.fisher.dp;

import net.fisher.domain.LogModel;
import net.fisher.inter.LogDbOperateApi;
import net.fisher.inter.impl.LogFileOperate;

import java.util.List;

/**
 * 类适配器
 */
public class ClassAdapter extends LogFileOperate implements LogDbOperateApi {

    public ClassAdapter(String logFilePathName) {
        super(logFilePathName);
    }


    /**
     * 新增日志
     *
     * @param model
     */
    @Override
    public void createLog(LogModel model) {
        List<LogModel> list = this.readLogFile();
        list.add(model);
        this.writeLogFile(list);
    }

    /**
     * 修改日志
     *
     * @param model
     */
    @Override
    public void updateLog(LogModel model) {
        List<LogModel> list = this.readLogFile();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getLogId().equals(model.getLogId())) {
                list.set(i, model);
                break;
            }
        }
        this.writeLogFile(list);
    }

    /**
     * 删除日志
     *
     * @param model
     */
    @Override
    public void removeLog(LogModel model) {
        List<LogModel> list = this.readLogFile();
        list.remove(model);
        this.writeLogFile(list);
    }

    /**
     * 获取所有日志
     *
     * @return
     */
    @Override
    public List<LogModel> getAllLog() {
        return this.readLogFile();
    }
}
