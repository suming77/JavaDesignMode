package com.example.javadesignmode;
//枚举:这种方式没有被广泛使用，但是这是单例模式的最佳方法，它更简洁，避免多线程同步问题，自动支持序列化机制，绝对房子多次实例化。
public enum EnumSingleton {
    INSTANCE;
    public void getInstance(){
    }
}
