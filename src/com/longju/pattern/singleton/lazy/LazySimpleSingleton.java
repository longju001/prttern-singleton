package com.longju.pattern.singleton.lazy;

/**
 * @author changyl
 * @create 2019-03-18 22:27
 */
public class LazySimpleSingleton {

    private static LazySimpleSingleton lazySimpleSingleton = null;

    private LazySimpleSingleton(){}

    //synchronized会造成类锁，优化方式：DoublecheckLazySingleton
    public static synchronized LazySimpleSingleton getInstance(){
        if(lazySimpleSingleton==null){//线程调试断点
            lazySimpleSingleton =  new LazySimpleSingleton();//线程调试断点
        }
        return lazySimpleSingleton;
    }

}
