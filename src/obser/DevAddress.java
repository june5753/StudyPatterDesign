package obser;

import java.util.Observable;

/**
 * <pre>
 *     author : June Yang
 *     time   : 2020/08/06
 *     desc   : 被观察者
 *     version: 1.0
 * </pre>
 */
public class DevAddress extends Observable {


    public void postNewMessage(String content){
        setChanged();
        notifyObservers(content);
    }
}
