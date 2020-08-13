package singleton;


/**
 * <pre>
 *     author : June Yang
 *     time   : 2020/08/12
 *     desc   : 静态内部类
 *     第一次加载SingleTon时不会初始化，只有在第一次调用SingleTon的getInstance 方法时才会导致INSTANCE初始化。
 *     因此第一次调用 getInstance方法会导致虚拟机加载Holder类。
 *     保证线程安全、单例唯一性、延迟初始化。推荐使用。
 *
 *     version: 1.0
 * </pre>
 */
public class SingleTon3 {

    private static class Holder {
        private static SingleTon3 INSTANCE = new SingleTon3();
    }

    public static SingleTon3 getInstance() {
        return Holder.INSTANCE;
    }


    private void doSomeThing() {
        System.out.println("do something");
    }

    public static void main(String args[]) {

        SingleTon3.getInstance().doSomeThing();
    }

}
