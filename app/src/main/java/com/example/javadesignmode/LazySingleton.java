package com.example.javadesignmode;

//懒汉单例模式
public class LazySingleton {
    //唯一的实例
    private static LazySingleton mInstance;

    //私有构造方法，保证自己才可以创建实例
    private LazySingleton() {
    }

    //静态方法获取唯一可用的对象
    public static synchronized LazySingleton getInstance() {//加锁，线程安全，效率低
//    public static LazySingleton getInstance() {//不加锁，非线程安全，效率高
        if (mInstance == null) {//保证单例的唯一性，在没有的时候才去创建
            mInstance = new LazySingleton();
        }
        return mInstance;
    }
}
