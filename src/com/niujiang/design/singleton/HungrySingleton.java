package com.niujiang.design.singleton;

/**
 * Function: 饿汉模式
 *
 * @author niujiang
 * @date 2021/1/12
 */
public class HungrySingleton {
    private static final HungrySingleton singleton = new HungrySingleton();

    // 将new LazySingleton()堵死
    private HungrySingleton() {
    }

    public static HungrySingleton getInstance() {
        return singleton;
    }
}
