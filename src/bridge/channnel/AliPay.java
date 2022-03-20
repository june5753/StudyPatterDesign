package bridge.channnel;

import bridge.model.IPayMode;

import java.math.BigDecimal;

/**
 * <pre>
 *     author : June Yang
 *     time   : 2022/03/20
 *     desc   : 支付宝支付
 *     version: 1.0
 * </pre>
 */
public class AliPay extends AbsPay {
    public AliPay(IPayMode payMode) {
        super(payMode);
    }

    @Override
    public String transfer(String uid, String tradeId, BigDecimal amount) {
        boolean sec = iPayMode.security(uid);
        System.out.println("支付宝支付检测开始");
        if (!sec) {
            System.out.println("支付宝支付失败:" + "uid: " + uid + " tradeId: " + tradeId + " amount: " + amount);
        }
        System.out.println("支付宝支付成功:" + " uid: " + uid + " tradeId: " + tradeId + " amount: " + amount);
        return "111";
    }
}
