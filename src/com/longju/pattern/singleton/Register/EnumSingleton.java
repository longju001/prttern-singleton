package com.longju.pattern.singleton.Register;

/**
 * @author changyl
 * @create 2019-03-19 12:55
 */
public enum  EnumSingleton {

    /**
     * 注册式单例1，枚举式单例
     * 可以防止序列化和反射破坏单例
     */

    INSTANCE;

    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static EnumSingleton getInstance(){
        return INSTANCE;
    }

}
