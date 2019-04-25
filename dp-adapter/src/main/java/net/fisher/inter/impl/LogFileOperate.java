package net.fisher.inter.impl;

import net.fisher.domain.LogModel;
import net.fisher.inter.LogFileOperateApi;
import net.fisher.utils.PathUtil;

import java.io.*;
import java.util.List;

/**
 * 实现对日志文件的操作
 */
public class LogFileOperate implements LogFileOperateApi {
    /**
     * 日志文件名称，默认当前项目根下的AdapterLog.log
     */
    private String logFilePathName = "AdapterLog.log";

    /**
     * 构造方法，传入文件名称
     * @param logFilePathName
     */
    public LogFileOperate(String logFilePathName) {
        // 先判断是否传入文件名，如果是，重新设置操作日志文件的路径和名称
        if (logFilePathName != null && logFilePathName.trim().length() > 0) {
            this.logFilePathName = logFilePathName;
        }
    }

    /**
     * 读日志文件，从文件获取日志列表对象
     *
     * @return
     */
    @Override
    public List<LogModel> readLogFile() {
        List<LogModel> list = null;
        ObjectInputStream oin = null;
        try {
            File f = new File(PathUtil.getPath() + logFilePathName);
            if (f.exists()) {
                oin = new ObjectInputStream(new BufferedInputStream(new FileInputStream(f)));
                list = (List<LogModel>) oin.readObject();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (oin != null) {
                    oin.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return list;
    }

    /**
     * 写日志文件，把日志列表对象写到日志文件中
     *
     * @param list
     */
    @Override
    public void writeLogFile(List<LogModel> list) {
        File f = new File(PathUtil.getPath() + logFilePathName);
        ObjectOutputStream oout = null;
        try {
            oout = new ObjectOutputStream((new BufferedOutputStream(new FileOutputStream(f))));
            oout.writeObject(list);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (oout != null) {
                    oout.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }














}
