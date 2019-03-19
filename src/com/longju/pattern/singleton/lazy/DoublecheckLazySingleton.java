package com.longju.pattern.singleton.lazy;

/**
 * @author changyl
 * @create 2019-03-18 23:09
 */
public class DoublecheckLazySingleton {

    private static volatile DoublecheckLazySingleton doublecheckLazySingleton = null;

    private DoublecheckLazySingleton(){}

    //双锁检查
    public static DoublecheckLazySingleton getInstance(){
        if(doublecheckLazySingleton==null){//线程调试断点
            synchronized (DoublecheckLazySingleton.class){
                if(doublecheckLazySingleton==null){
                    doublecheckLazySingleton =  new DoublecheckLazySingleton();//线程调试断点
                }
            }
        }
        return doublecheckLazySingleton;
    }
}
