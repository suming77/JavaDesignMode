package com.example.javadesignmode;

//饿汉单例模式
public class HungerSingleton {
    //唯一的实例,实例化的时候直接创建
    private static HungerSingleton mInstance = new HungerSingleton();

    //私有构造方法，保证自己才可以创建实例
    private HungerSingleton() {
    }

    //静态方法获取唯一可用的对象
    public static HungerSingleton getInstance() {
        return mInstance;
    }
}
