package com.longju.pattern.singleton.lazy.test;

/**
 * @author changyl
 * @create 2019-03-18 22:37
 */
public class LazySimpleTest {

    public static void main(String[] args) throws InterruptedException {

        Thread t1 = new Thread(new SimpleThread(), "t1");
        Thread t2 = new Thread(new SimpleThread(), "t2");

        t1.start();
        Thread.sleep(1);
        t2.start();

        System.out.println("end");

    }

}
