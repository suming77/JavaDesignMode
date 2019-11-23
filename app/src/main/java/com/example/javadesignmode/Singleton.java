package com.example.javadesignmode;

//双重锁模式：在synchronized内外都加上了一层if条件判断，这样既保证了线程安全，又比直接上锁提高了执行效率，还节省内存空间。
public class Singleton {

    //唯一的实例
    private static Singleton mInstance;

    //私有构造方法，保证自己才可以创建实例
    private Singleton() {
    }

    //静态方法获取唯一可用的对象
    public static Singleton getInstance() {
        if (mInstance == null) {//为了不用每次获取对象都强制加锁，提升效率，判断不存在再加锁
            synchronized (Singleton.class) {//加锁，为了线程安全
                if (mInstance == null) {//保证单例的唯一性，在没有的时候才去创建
                    mInstance = new Singleton();
                }
            }
        }
        return mInstance;
    }
}
