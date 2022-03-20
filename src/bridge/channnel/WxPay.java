package bridge.channnel;

import bridge.model.IPayMode;

import java.math.BigDecimal;

/**
 * <pre>
 *     author : June Yang
 *     time   : 2022/03/20
 *     desc   : 微信支付
 *     version: 1.0
 * </pre>
 */
public class WxPay extends AbsPay {
    public WxPay(IPayMode payMode) {
        super(payMode);
    }

    @Override
    public String transfer(String uid, String tradeId, BigDecimal amount) {
        boolean sec = iPayMode.security(uid);
        System.out.println("微信支付检测开始");
        if (!sec) {
            System.out.println("微信支付失败: " + " uid: " + uid + " tradeId: " + tradeId + " amount: " + amount);
            return "0001";
        }
        System.out.println("微信支付成功: " + "uid: " + uid + " tradeId: " + tradeId + " amount: " + amount);

        return "0000";
    }
}
