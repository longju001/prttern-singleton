package com.longju.pattern.singleton.Register.Test;

import com.longju.pattern.singleton.Register.EnumSingleton;

/**
 * @author changyl
 * @create 2019-03-19 16:32
 */
public class Test {

    public static void main(String[] args) {

        EnumSingleton enumSingleton = EnumSingleton.getInstance();
        System.out.println(enumSingleton);

    }

}
