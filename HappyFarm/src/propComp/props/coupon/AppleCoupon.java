package propComp.props.coupon;


/**
 * @Design-Pattern: Prototype
 * @description: 苹果兑换券类，继承Coupon
 * @version 2018/10/30
 * @author jihao luo
 *
 */
public class AppleCoupon extends Coupon{
    public AppleCoupon(){
        setName("AppleCoupon");
        price = 100;
        setType("Item");
    }

}
