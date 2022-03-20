package bridge.model;

/**
 * <pre>
 *     author : June Yang
 *     time   : 2022/03/20
 *     desc   : 指纹识别
 *     version: 1.0
 * </pre>
 */
public class PayFingerprintMode implements IPayMode {
    @Override
    public boolean security(String uid) {
        System.out.println("指纹识别支付");
        return true;
    }
}
