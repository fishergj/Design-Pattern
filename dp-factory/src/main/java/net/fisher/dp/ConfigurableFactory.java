package net.fisher.dp;

import net.fisher.module.Api;

import java.io.IOException;
import java.util.Properties;
import java.io.InputStream;

/**
 * 可配置的工厂类
 */
public class ConfigurableFactory {
    /**
     * 具体创建Api对象的方法，根据配置文件的参数来创建
     * @return
     */
    public static Api createApi() {
        Properties p = new Properties();
        InputStream in = null;
        try {
            in = ConfigurableFactory.class.getClassLoader().getResourceAsStream("ConfigurableFactory.properties");
            p.load(in);
        } catch (IOException ioe) {
            System.out.println("装载工厂配置文件出错，堆栈信息如下：");
            ioe.printStackTrace();
        } finally {
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        Api api = null;
        try {
            api = (Api)Class.forName(p.getProperty("ImplClass")).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return api;
    }











}
