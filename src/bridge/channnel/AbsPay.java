package bridge.channnel;

import bridge.model.IPayMode;

import java.math.BigDecimal;

/**
 * <pre>
 *     author : June Yang
 *     time   : 2022/03/20
 *     desc   :  定义支付类型中需要实现的支付接口transfer，和桥接接口 IPayMode, 并在构造函数中实现用户自行选择的支付方式。
 *     IPayMode payMode 是核心。
 *     在子类的构造中传递不同的接口实现类的依赖注入，通过接口的方式持有不同的实现方式，也可以理解为把接口当做参数 通过构造的方式注入，
 *     注入的接口也是面向接口的思想体现。
 *     version: 1.0
 * </pre>
 */
public abstract class AbsPay {
    protected IPayMode iPayMode;

    public AbsPay(IPayMode payMode) {
        this.iPayMode = payMode;
    }

    public abstract String transfer(String uid, String tradeId, BigDecimal amount);
}
