package net.fisher.domain;

import java.io.Serializable;

/**
 * 日志数据对象
 */
public class LogModel implements Serializable {
    /**
     * 日志编号
     */
    private String logId;

    /**
     * 操作人员
     */
    private String operateUser;

    /**
     * 操作时间，yyyy-MM-dd HH:mm:ss格式
     */
    private String operateTime;

    /**
     * 日志内容
     */
    private String logContent;

    public LogModel() {
    }

    public LogModel(String logId, String operateUser, String operateTime, String logContent) {
        this.logId = logId;
        this.operateUser = operateUser;
        this.operateTime = operateTime;
        this.logContent = logContent;
    }

    public String getLogId() {
        return logId;
    }

    public void setLogId(String logId) {
        this.logId = logId;
    }

    public String getOperateUser() {
        return operateUser;
    }

    public void setOperateUser(String operateUser) {
        this.operateUser = operateUser;
    }

    public String getOperateTime() {
        return operateTime;
    }

    public void setOperateTime(String operateTime) {
        this.operateTime = operateTime;
    }

    public String getLogContent() {
        return logContent;
    }

    public void setLogContent(String logContent) {
        this.logContent = logContent;
    }

    @Override
    public String toString() {
        return "LogModel{" +
                "logId='" + logId + '\'' +
                ", operateUser='" + operateUser + '\'' +
                ", operateTime='" + operateTime + '\'' +
                ", logContent='" + logContent + '\'' +
                '}';
    }
}
