package net.fisher.inter;

import net.fisher.domain.LogModel;

import java.util.List;

/**
 * 文件日志操作接口
 */
public interface LogFileOperateApi {

    /**
     * 读日志文件，从文件获取日志列表对象
     * @return
     */
    public List<LogModel> readLogFile();

    /**
     * 写日志文件，把日志列表对象写到日志文件中
     * @param list
     */
    public void writeLogFile(List<LogModel> list);
}
