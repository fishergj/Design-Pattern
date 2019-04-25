package net.fisher.dp;

import net.fisher.domain.LogModel;
import net.fisher.inter.LogDbOperateApi;
import net.fisher.inter.LogFileOperateApi;

import java.util.List;

/**
 * 双向适配器
 */
public class TwoDirectAdapter implements LogFileOperateApi, LogDbOperateApi {
    private LogFileOperateApi fileLog;

    private LogDbOperateApi dbLog;

    public TwoDirectAdapter(LogFileOperateApi fileLog, LogDbOperateApi dbLog) {
        this.fileLog = fileLog;
        this.dbLog = dbLog;
    }

    /********** 以下是把文件操作的方式适配成DB实现方式的接口 **********/
    /**
     * 新增日志
     *
     * @param model
     */
    @Override
    public void createLog(LogModel model) {
        List<LogModel> list = fileLog.readLogFile();
        list.add(model);
        fileLog.writeLogFile(list);
    }

    /**
     * 修改日志
     *
     * @param model
     */
    @Override
    public void updateLog(LogModel model) {
        List<LogModel> list = fileLog.readLogFile();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getLogId().equals(model.getLogId())) {
                list.set(i, model);
                break;
            }
        }
        fileLog.writeLogFile(list);
    }

    /**
     * 删除日志
     *
     * @param model
     */
    @Override
    public void removeLog(LogModel model) {
        List<LogModel> list = fileLog.readLogFile();
        list.remove(model);
        fileLog.writeLogFile(list);
    }

    /**
     * 获取所有日志
     *
     * @return
     */
    @Override
    public List<LogModel> getAllLog() {
        return fileLog.readLogFile();
    }

    /********** 以下是把DB操作的方式适配成File实现方式的接口 **********/
    /**
     * 读日志文件，从文件获取日志列表对象
     *
     * @return
     */
    @Override
    public List<LogModel> readLogFile() {
        return dbLog.getAllLog();
    }

    /**
     * 写日志文件，把日志列表对象写到日志文件中
     *
     * @param list
     */
    @Override
    public void writeLogFile(List<LogModel> list) {
        for (LogModel model : list) {
            dbLog.createLog(model);
        }
    }
}
