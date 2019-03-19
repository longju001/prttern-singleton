package com.longju.pattern.singleton.lazy;

/**
 * @author changyl
 * @create 2019-03-19 12:12
 */
public class LazyInnerClassSingleton {
    private LazyInnerClassSingleton lazyInnerClassSingleton = null;

    /**
     * 虽然构造函数私有，但是仍然会被反射破坏
     */
    private LazyInnerClassSingleton(){
        if(lazyHolder.lazy!=null){
            throw new RuntimeException("不允许构建多个实例");
        }
    }

    public static final LazyInnerClassSingleton getInstance(){
        return lazyHolder.lazy;
    }

    /**
     * 全程没用到synchronized, 利用的是类加载的特征：
     * 外部类加载先去加载静态内部类，比外部类优先加载
     * 当用户调用getInstance，内部类的实现逻辑就会执行（static final）
     * lazyHolder里面的逻辑需要外部调用才执行
     * 这是JVM底层是执行逻辑
     *
     * 性能最优的懒汉式单例
     */
    private static class lazyHolder{
        private static final LazyInnerClassSingleton lazy = new LazyInnerClassSingleton();
    }

}
