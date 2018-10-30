package propComp.props.coupon.Handler;

import factory.CouponFactor;
import propComp.props.coupon.AppleCoupon;
import propComp.props.coupon.Coupon;
import utils.Enum.PlantType;
import utils.Money.Money;

public class AppleHandler extends Handler {
    public AppleHandler(){
        super(Handler.APPLE_LEVEL_REQUEST);
    }
    @Override
    protected void response(String plantType) {
        //生成apple实例 添加仓库
        AppleCoupon appleCoupon = (AppleCoupon)CouponFactor.getInstance().addCoupon(PlantType.apple);
        System.out.print(appleCoupon.getName()+" "+appleCoupon.getType());
        Money.getInstance().couponList.add(appleCoupon);
        Money.getInstance().appleCouponNum++;
    }

}
