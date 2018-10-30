package propComp.props.coupon.Handler;

import factory.CouponFactor;
import propComp.props.coupon.CabbageCoupon;
import propComp.props.coupon.RiceCoupon;
import utils.Enum.PlantType;
import utils.Money.Money;

public class RiceHandler extends Handler {
    public RiceHandler(){
        super(Handler.RICE_LEVEL_REQUEST);
    }
    @Override
    protected void response(String plantType) {
        //生成rice实例 添加仓库
        RiceCoupon riceCoupon = (RiceCoupon) CouponFactor.getInstance().addCoupon(PlantType.rice);
        System.out.print(riceCoupon.getName()+" "+riceCoupon.getType());
        Money.getInstance().couponList.add(riceCoupon);
        Money.getInstance().riceCouponNum++;
    }
}
