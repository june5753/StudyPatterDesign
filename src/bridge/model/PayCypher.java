package bridge.model;

/**
 * <pre>
 *     author : June Yang
 *     time   : 2022/03/20
 *     desc   : 密码识别
 *     version: 1.0
 * </pre>
 */
public class PayCypher implements IPayMode {
    @Override
    public boolean security(String uid) {
        System.out.println("密码识别支付");
        return true;
    }
}
