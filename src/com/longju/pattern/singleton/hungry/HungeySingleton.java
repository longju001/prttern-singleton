package com.longju.pattern.singleton.hungry;

/**
 * @author changyl
 * @create 2019-03-18 22:15
 */

/**
 * 饿汉式单例:在类加载的时候就创建，不一定用得到，浪费内存空间
 */
public class HungeySingleton {

    private static final HungeySingleton hungeySingleton = new HungeySingleton();

    private HungeySingleton(){}

    private static HungeySingleton getInstance(){
        return hungeySingleton;
    }

}
