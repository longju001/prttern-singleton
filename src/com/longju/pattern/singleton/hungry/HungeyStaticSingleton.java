package com.longju.pattern.singleton.hungry;

/**
 * @author changyl
 * @create 2019-03-18 22:15
 */

/**
 * 饿汉式单例-静态代码块
 */
public class HungeyStaticSingleton {

    private static final HungeyStaticSingleton hungeySingleton;

    static {
        hungeySingleton = new HungeyStaticSingleton();
    }

    private HungeyStaticSingleton(){}

    private static HungeyStaticSingleton getInstance(){
        return hungeySingleton;
    }

}
