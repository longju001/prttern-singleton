package com.longju.pattern.singleton.threadlocal;

/**
 * @author changyl
 * @create 2019-03-19 17:45
 */
public class ThreadlocalSingleton {

    private ThreadlocalSingleton(){}

    private static final ThreadLocal<ThreadlocalSingleton> threadlocalSingleton = new ThreadLocal<ThreadlocalSingleton>() {
        @Override
        protected ThreadlocalSingleton initialValue() {
            return new ThreadlocalSingleton();
        }
    };

    public static ThreadlocalSingleton getInstance(){
        return threadlocalSingleton.get();
    }


    /**
     * 伪线程安全的（在一个线程内是单例的，不同线程间不保证单例）
     */

}
