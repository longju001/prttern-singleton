package com.longju.pattern.singleton.seriable;

/**
 * @author changyl
 * @create 2019-03-19 12:42
 */

/**
 * 序列化会破坏单例，
 * 序列化时会判断单例类有没有构造函数（并不关心是不是单例的），只要有就会重新创建实例
 */
public class SeriableSingleton {

    private static final SeriableSingleton seriableSingleton = new SeriableSingleton();

    private SeriableSingleton(){}

    private static SeriableSingleton getInstance(){
        return seriableSingleton;
    }

    /**
     * 反序列化时，在创建实例之前会判断有没有readResolve函数，有的话就不会创建新的实例
     * 重写readSolve，只是覆盖了反序列化创建的对象，实际上还是创建了两次，只不过是发生在JVM层面，相对安全
     * 被覆盖的反序列化出来的对象会被GC回收
     */
    private Object readResolve(){
        return seriableSingleton;
    }

}
