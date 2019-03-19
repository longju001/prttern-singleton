package com.longju.pattern.singleton.lazy.test;

import com.longju.pattern.singleton.lazy.LazyInnerClassSingleton;

import java.lang.reflect.Constructor;

/**
 * @author changyl
 * @create 2019-03-19 12:23
 */
public class DestoryLazyInnerClassSingletonTest {

    public static void main(String[] args) throws Exception{

        /**
         * 反射破坏了内部类单例的完整性
         */
//        Class clazz = LazyInnerClassSingleton.class;
//
//        Constructor constructor = clazz.getDeclaredConstructor(null);//反射获取构造函数
//
//        constructor.setAccessible(true);//构造函数私有，强制设置为可以访问
//
//        Object o1 = constructor.newInstance();

        Object o2 = LazyInnerClassSingleton.getInstance();

//        System.out.println(o1 == o2);

    }

}
