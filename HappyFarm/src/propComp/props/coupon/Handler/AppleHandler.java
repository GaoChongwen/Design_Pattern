package propComp.props.coupon.Handler;

import factory.CouponFactor;
import propComp.props.coupon.AppleCoupon;
import propComp.props.coupon.Coupon;
import utils.Enum.PlantType;
import utils.Money.Money;

/**
 * @Design-Pattern: Chain of Responsibility Pattern,Static Factory Method,Singleton Pattern
 * @description: AppleHandler类 用于处理生成苹果券
 * @version 2018/10/30
 * @author jihao luo
 *
 */
public class AppleHandler extends Handler {
    public AppleHandler(){
        super(Handler.APPLE_LEVEL_REQUEST);
    }
    @Override
    protected void response(String plantType) {
        //生成apple实例 添加仓库
        AppleCoupon appleCoupon = (AppleCoupon)CouponFactor.getInstance().addCoupon(PlantType.apple);
        System.out.println(appleCoupon.getName()+" Added");
        Money.getInstance().couponList.add(appleCoupon);
        Money.getInstance().appleCouponNum++;
    }

}
