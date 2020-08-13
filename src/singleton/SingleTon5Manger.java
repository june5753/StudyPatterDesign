package singleton;

import java.util.HashMap;
import java.util.Map;

/**
 * <pre>
 *     author : June Yang
 *     time   : 2020/08/13
 *     desc   : 使用容器实现单例模式
 *     version: 1.0
 * </pre>
 */
public class SingleTon5Manger {

    private SingleTon5Manger() {
    }

    private static Map<String, Object> objectMap = new HashMap<String, Object>();

    public static void registerService(String key, Object instance) {

        if (!objectMap.containsKey(key)) {
            objectMap.put(key, instance);
        }
    }

    public static Object getService(String key) {
        return objectMap.get(key);
    }

    public static void main(String[] args) {
        registerService("1", 990);
        registerService("2", "9999String");

       System.out.println(SingleTon5Manger.getService("1"));
    }

}
