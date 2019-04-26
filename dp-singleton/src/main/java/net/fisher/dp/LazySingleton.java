package net.fisher.dp;

/**
 * 懒汉式单例
 */
public class LazySingleton {

    private static LazySingleton instance = null;

    private LazySingleton() {}

    public static synchronized LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }
}
