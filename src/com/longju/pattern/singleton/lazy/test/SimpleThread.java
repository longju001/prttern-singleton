package com.longju.pattern.singleton.lazy.test;

import com.longju.pattern.singleton.lazy.LazySimpleSingleton;

/**
 * @author changyl
 * @create 2019-03-18 22:38
 */
public class SimpleThread implements Runnable{
    @Override
    public void run() {

        LazySimpleSingleton lazySimpleSingleton = LazySimpleSingleton.getInstance();
        System.out.println(Thread.currentThread().getName() + " : " + lazySimpleSingleton);

    }
}
