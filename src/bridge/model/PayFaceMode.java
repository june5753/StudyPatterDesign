package bridge.model;

/**
 * <pre>
 *     author : June Yang
 *     time   : 2022/03/20
 *     desc   : 人脸识别
 *     version: 1.0
 * </pre>
 */
public class PayFaceMode implements IPayMode{
    @Override
    public  boolean security(String uid){
        System.out.println("人脸识别支付");
        return false;
    }
}
