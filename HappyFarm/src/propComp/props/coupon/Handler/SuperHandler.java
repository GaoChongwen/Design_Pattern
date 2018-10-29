package propComp.props.coupon.Handler;

import factory.CouponFactor;
import propComp.props.coupon.CabbageCoupon;
import propComp.props.coupon.SuperCoupon;
import utils.Enum.PlantType;
import utils.Money.Money;

public class SuperHandler extends Handler{
    public SuperHandler(){
        super(Handler.SUPER_LEVEL_REQUEST);
    }
    @Override
    protected void response(String plantType) {
        //生成super实例 添加仓库
        SuperCoupon superCoupon = new SuperCoupon();
        System.out.print(superCoupon.getName()+" "+superCoupon.getType());
        Money.getInstance().couponList.add(superCoupon);
        Money.getInstance().superCouponNum++;
    }
}
