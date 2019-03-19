package com.longju.pattern.singleton.Register;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author changyl
 * @create 2019-03-19 16:36
 */
public class ContainerSingleton {

    /**
     * 注册式单例：ioc采用的
     */

    private ContainerSingleton(){}

    private static Map<String, Object> ioc = new ConcurrentHashMap<>();

    public static Object getBean(String className){
        synchronized (ioc) {
            if(!ioc.containsKey(className)){
                Object obj = null;
                try {
                    obj = Class.forName(className);
                    ioc.put(className, obj);
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
                return obj;
            }
            return ioc.get(className);
        }
    }

}
