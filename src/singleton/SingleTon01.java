package singleton;

/**
 * <pre>
 *     author : June Yang
 *     time   : 2020/08/12
 *     desc   : 懒汉式单例模式(线程安全)
 *     这种写法能够在多线程中很好的工作，而且看起来它也具备很好的lazy loading，但是，遗憾的是，效率很低，99%情况下不需要同步
 *     version: 1.0
 * </pre>
 */
public class SingleTon01 {

    private SingleTon01() {
    }

    private static SingleTon01 mInstance = null;

    //注意区别点 添加了synchronized
    public static synchronized SingleTon01 getInstance() {
        if (mInstance == null) {
            mInstance = new SingleTon01();
        }
        return mInstance;
    }

    private void doSomeThing() {
        System.out.println("do something");
    }


    public static void main(String[] args) {

        SingleTon01.getInstance().doSomeThing();
    }

}
