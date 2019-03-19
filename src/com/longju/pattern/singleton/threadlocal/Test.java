package com.longju.pattern.singleton.threadlocal;

/**
 * @author changyl
 * @create 2019-03-19 17:50
 */
public class Test {

    public static void main(String[] args) {

        for (int i = 0; i < 20; i++) {

            System.out.println(ThreadlocalSingleton.getInstance());

        }

    }

}
