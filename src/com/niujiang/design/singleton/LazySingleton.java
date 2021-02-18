package com.niujiang.design.singleton;

/**
 * Function: 懒汉模式
 *
 * @author niujiang
 * @date 2021/1/12
 */
public class LazySingleton {
    private static volatile LazySingleton singleton = null;

    // 将new LazySingleton()堵死
    private LazySingleton() {
    }

    /**
     * 双重检查
     * @return
     */
    public static LazySingleton getInstance() {
        if (null == singleton) {
            // 加锁
            synchronized (LazySingleton.class) {
                if (null == singleton) {
                    singleton = new LazySingleton();
                }
            }
        }

        return singleton;
    }
}
