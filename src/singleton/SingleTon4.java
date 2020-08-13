package singleton;

/**
 * <pre>
 *     author : June Yang
 *     time   : 2020/08/13
 *     desc   : 枚举单例
 *     写法简单，线程安全，在任何情况下它都是一个单例 工作中很少用
 *     version: 1.0
 * </pre>
 */
public enum SingleTon4 {
    INSTANCE;

    public void doSomething() {
        System.out.println("enum hello");
    }

    public static void main(String[] args) {

        SingleTon4.INSTANCE.doSomething();
    }
}
