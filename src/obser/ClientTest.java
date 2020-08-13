package obser;

/**
 * <pre>
 *     author : June Yang
 *     time   : 2020/08/06
 *     desc   :
 *     version: 1.0
 * </pre>
 */
public class ClientTest {

    public static void main(String[] args) {
        Coder coder1 = new Coder("code-1");
        Coder coder2 = new Coder("code-2");
        Coder coder3 = new Coder("code-3");

        DevAddress  devAddress = new DevAddress();

        devAddress.addObserver(coder1);
        devAddress.addObserver(coder2);
        devAddress.addObserver(coder3);

        devAddress.postNewMessage("新消息发布了1，注意查收");

        devAddress.deleteObserver(coder3);

        devAddress.postNewMessage("新消息发布了2，注意查收");

    }
}
