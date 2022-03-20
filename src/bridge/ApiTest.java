package bridge;

import bridge.channnel.AliPay;
import bridge.channnel.AbsPay;
import bridge.channnel.WxPay;
import bridge.model.PayCypher;
import bridge.model.PayFaceMode;

import java.math.BigDecimal;

/**
 * <pre>
 *     author : June Yang
 *     time   : 2022/03/20
 *     desc   : 桥接模式
 *    运用场景： 多支付模式和多模式组合的场景。支付时需要支持支付宝支付、微信支付。同时在支付时需要支持人脸识别、指纹和密码的方式。
 *     version: 1.0
 * </pre>
 */
public class ApiTest {
    public static void main(String[] args) {
        AbsPay wxPay = new WxPay(new PayFaceMode());
        wxPay.transfer("1111", "222", new BigDecimal(1000));
        System.out.println("------------------------------------------------");

        AbsPay aliPay = new AliPay(new PayCypher());
        aliPay.transfer("000", "333", new BigDecimal(1200));
    }
}
