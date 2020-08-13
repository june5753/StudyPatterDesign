package obser;

import java.util.Observable;
import java.util.Observer;

/**
 * <pre>
 *     author : June Yang
 *     time   : 2020/08/06
 *     desc   : 程序员 观察者
 *     version: 1.0
 * </pre>
 */
public class Coder implements Observer {

    private String name;

    public Coder(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("Hi," + name + "更新内容啦" + arg);
    }

    @Override
    public String toString() {
        return "obser.Coder{" +
                "name='" + name + '\'' +
                '}';
    }
}
