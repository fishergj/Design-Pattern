package net.fisher.dp;

/**
 * 双重检查加锁
 */
public class DoubleCheckSingleton {
    /**
     * 对保存实例的变量添加volatile的修饰
     */
    private volatile static DoubleCheckSingleton instance = null;

    private DoubleCheckSingleton() {}

    public static DoubleCheckSingleton getInstance() {
        if (instance == null) {
            synchronized (DoubleCheckSingleton.class) {
                if (instance == null) {
                    instance = new DoubleCheckSingleton();
                }
            }
        }
        return instance;
    }
}























