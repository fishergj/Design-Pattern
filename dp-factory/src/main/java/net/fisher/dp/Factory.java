package net.fisher.dp;

import net.fisher.module.Api;
import net.fisher.module.impl.ApiAImpl;
import net.fisher.module.impl.ApiBImpl;

/**
 * 工厂类，用来创建Api对象
 */
public class Factory {
    /**
     * 具体创建Api对象的方法
     * @param condition 选择条件
     * @return
     */
    public static Api createApi(int condition) {


        /**
         * 根据条件选择究竟创建哪一个具体的实现对象
         * 如果只有一个实现，可以省略条件。
         */
        Api api = null;
        if (condition == 1) {
            api = new ApiAImpl();
        } else if (condition == 2) {
            api = new ApiBImpl();
        }
        return api;
    }
}
