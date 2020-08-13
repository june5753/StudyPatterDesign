package singleton;

/**
 * <pre>
 *     author : June Yang
 *     time   : 2020/08/13
 *     desc   : 饿汉式单例模式
 *     这种方式基于 Classloder 机制避免了多线程的同步问题，不过，instance在类装载时就实例化，
 *     虽然导致类装载的原因有很多种，在单例模式中大多数都是调用getInstance方法，
 *     但是也不能确定有其他的方式（或者其他的静态方法）导致类装载，这时候初始化instance
 *     显然没有达到lazy loading的效果。
 *     version: 1.0
 * </pre>
 */
public class SingleTon0 {

    private static final SingleTon0 mInstance = new SingleTon0();

    private SingleTon0() {
    }

    public static SingleTon0 getInstance() {
        return mInstance;
    }

    private void doSomeThing() {
        System.out.println("do something");
    }

    public static void main(String[] args) {

        SingleTon0.getInstance().doSomeThing();
    }
}
