package net.fisher.test;

import net.fisher.domain.LogModel;
import net.fisher.dp.Adapter;
import net.fisher.inter.LogDbOperateApi;
import net.fisher.inter.LogFileOperateApi;
import net.fisher.inter.impl.LogDbOperate;
import net.fisher.inter.impl.LogFileOperate;
import sun.rmi.runtime.Log;

import java.util.ArrayList;
import java.util.List;

public class ClientWithDP {
    public static void main(String[] args) {
        LogModel model = new LogModel("005", "admin", "2019-04-25 16:05:30", "ClientWithDp log test");
        List<LogModel> list = new ArrayList<LogModel>();
        list.add(model);

        LogFileOperateApi logFileApi = new LogFileOperate("");

        LogDbOperateApi api = new Adapter(logFileApi);

        api.createLog(model);
        List<LogModel> allLog = api.getAllLog();
        System.out.println("allLog = " + allLog);

        LogDbOperateApi logDbApi = new LogDbOperate();
        logDbApi.getAllLog();
    }
}
