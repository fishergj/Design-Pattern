package net.fisher.test;

import net.fisher.domain.LogModel;
import net.fisher.dp.TwoDirectAdapter;
import net.fisher.inter.LogDbOperateApi;
import net.fisher.inter.LogFileOperateApi;
import net.fisher.inter.impl.LogDbOperate;
import net.fisher.inter.impl.LogFileOperate;

import java.util.ArrayList;
import java.util.List;

/**
 * 双向适配器测试
 */
public class ClientWithTwoDirectDP {
    public static void main(String[] args) {
        LogModel model = new LogModel("006", "admin", "2019-04-25 16:28:30", "ClientWithTwoDirectDP log test");

        List<LogModel> list = new ArrayList<LogModel>();
        list.add(model);

        LogFileOperateApi fileLog = new LogFileOperate("");
        LogDbOperateApi dbLog = new LogDbOperate();

        LogFileOperateApi fileLogApi = new TwoDirectAdapter(fileLog, dbLog);
        LogDbOperateApi dbLogApi = new TwoDirectAdapter(fileLog, dbLog);

        dbLogApi.createLog(model);
        List<LogModel> allLog = dbLogApi.getAllLog();
        System.out.println("allLog = " + allLog);

        fileLogApi.writeLogFile(list);
        fileLogApi.readLogFile();
    }
}
