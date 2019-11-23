package com.example.javadesignmode;

//静态内部类单例模式
public class StaticSingleton {
    //私有构造方法，保证自己才可以创建实例
    private StaticSingleton() {
    }

    //静态成员式内部类，该内部类实例与外部类实例没有绑定的关系，而且只有被调用时才会装载，从而实现延迟加载
    private static class innerSingleton {
        //静态初始化器，由jvm来保证线程安全
        private static final StaticSingleton instance = new StaticSingleton();
    }

    //静态方法获取唯一可用的对象
    public static StaticSingleton getInstance() {
        return innerSingleton.instance;
    }
}
