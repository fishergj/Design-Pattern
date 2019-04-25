package net.fisher.test;

import net.fisher.domain.LogModel;
import net.fisher.inter.LogFileOperateApi;
import net.fisher.inter.impl.LogFileOperate;

import java.util.ArrayList;
import java.util.List;

public class Client {

    public static void main(String[] args) {
        LogModel logModel = new LogModel("002", "admin", "2019-04-25 11:35:00", "This is a test");

        List<LogModel> list = new ArrayList<LogModel>();
        list.add(logModel);

        LogFileOperateApi api = new LogFileOperate("");
        api.writeLogFile(list);
        List<LogModel> readLog = api.readLogFile();
        System.out.println("readLog=" + readLog);
    }
}
