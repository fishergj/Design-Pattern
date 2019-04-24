package net.fisher.utils;

import java.io.*;
import java.util.Properties;

public class PropertiesUtil {
    private static String propertiesFilePath = "";

    public PropertiesUtil(String propertiesFilePath) {
        this.propertiesFilePath = propertiesFilePath;
    }

    /**
     * 按key获取值
     *
     * @param key
     * @return
     */
    public static String readProperty(String key) {
        String value = "";
        InputStream is = null;
        try {
            is = PropertiesUtil.class.getClassLoader().getResourceAsStream(propertiesFilePath);
            Properties p = new Properties();
            p.load(is);
            value = p.getProperty(key);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return value;
    }

    /**
     * 获取整个配置信息
     *
     * @return
     */
    public static Properties getProperties() {
        Properties p = new Properties();
        InputStream is = null;
        try {
            is = PropertiesUtil.class.getClassLoader().getResourceAsStream(propertiesFilePath);
            p.load(is);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return p;
    }

    /**
     * key-value写入配置文件
     * @param key
     * @param value
     */
    public static void writeProperty(String newPropertiesFilePath, String key, String value) {
        InputStream is = null;
        OutputStream os = null;
        Properties p = new Properties();
        try {
//            is = new FileInputStream(propertiesFilePath);
            is = PropertiesUtil.class.getClassLoader().getResourceAsStream(propertiesFilePath);
            p.load(is);
//            File newPropertiesFile = (File) PropertiesUtil.class.getClassLoader().getResource(newPropertiesFilePath).getFile();
//            if (!newPropertiesFile.exists()) {
//                newPropertiesFile.createNewFile();
//            }
            os = new FileOutputStream(PropertiesUtil.class.getClassLoader().getResource(newPropertiesFilePath).getFile());
//            os = new FileOutputStream(newPropertiesFile, true);

            p.setProperty(key, value);
            p.store(os, key);
            os.flush();
            os.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (null != is)
                    is.close();
                if (null != os)
                    os.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
