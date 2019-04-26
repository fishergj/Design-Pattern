package net.fisher.dp;

public class LazyInitHolderSingleton {

    private LazyInitHolderSingleton() {}

    /**
     * 类级内部类，该内部类的实例与外部类的实例没有绑定关系，而且只有被调用时才会加载，从而实现延迟加载
     */
    private static class SingletonHolder {
        // 静态初始化器，由JVM来保证线程安全
        private static LazyInitHolderSingleton instance = new LazyInitHolderSingleton();
    }

    public static LazyInitHolderSingleton getInstance() {
        return SingletonHolder.instance;
    }
}
