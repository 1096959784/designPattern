package com.niujiang.design.singleton;

/**
 * Function: 
 *
 * @author niujiang
 * @date 2021/1/12
 */
public class SingletonTest {
    public static void main(final String[] args) {
        final HungrySingleton hungrySingleton = HungrySingleton.getInstance();
        final LazySingleton lazySingleton = LazySingleton.getInstance();
        System.out.println(lazySingleton);

        final Runnable runnable = (() -> {
            System.out.println(LazySingleton.getInstance());
        });

        for (int i = 0; i < 10; i++) {
            final Thread thread = new Thread(runnable);
            thread.start();
        }
    }
}
