package singleton;

/**
 * <pre>
 *     author : June Yang
 *     time   : 2020/08/12
 *     desc   : DCL 双重加锁检查
 *     version: 1.0
 * </pre>
 */
public class SingleTon2 {

    private SingleTon2() {
    }

    private static volatile SingleTon2 instance;

    public static SingleTon2 getInstance() {

        if (instance == null) {
            synchronized (SingleTon2.class) {
                if (instance == null) {
                    instance = new SingleTon2();
                }
            }
        }

        return instance;
    }

    private void doSomeThing() {
        System.out.println("test ");
    }

    public static void main(String[] args) {
        SingleTon2.getInstance().doSomeThing();
    }
}
