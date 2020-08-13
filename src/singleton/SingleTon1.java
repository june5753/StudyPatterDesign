package singleton;

/**
 * <pre>
 *     author : June Yang
 *     time   : 2020/08/12
 *     desc   : 懒汉式单例模式(线程不安全)
 *     这种写法lazy loading很明显，但是致命的是在多线程不能正常工作。
 *     version: 1.0
 * </pre>
 */
public class SingleTon1 {

    private SingleTon1() {
    }

    private static SingleTon1 mInstance = null;

    public static SingleTon1 getInstance() {
        if (mInstance == null) {
            mInstance = new SingleTon1();
        }
        return mInstance;
    }

    private void doSomeThing() {
        System.out.println("do something");
    }


    public static void main(String[] args) {

        SingleTon1.getInstance().doSomeThing();
    }

}
