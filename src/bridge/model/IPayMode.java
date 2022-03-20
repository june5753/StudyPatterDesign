package bridge.model;

/**
 * <pre>
 *     author : June Yang
 *     time   : 2022/03/20
 *     desc   : 支付方式接口
 *     任何一种支付模式，都会通过风控校验不中程度的安全信息，这里定义一种安全校验接口。
 *     version: 1.0
 * </pre>
 */
public interface IPayMode {
    boolean security(String uid);
}
