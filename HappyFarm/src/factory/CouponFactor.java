package factory;

import base.Item;
import base.plant.Plant;
import propComp.props.coupon.*;
import propComp.props.coupon.Handler.*;
import utils.Enum.PlantType;

import java.util.Hashtable;
import java.util.Map;

public class CouponFactor  {
    private volatile static CouponFactor singleton = new CouponFactor();
    private static Hashtable<String, Coupon> couponMap = new Hashtable<String, Coupon>();

    public static CouponFactor getInstance() {
        return singleton;
    }

    public Coupon addCoupon(PlantType type) {
        Coupon cachedCoupon = couponMap.get(type.toString());
        //System.out.print(type.toString());
        return cachedCoupon.clone();
    }

    public void add(String type){
        Handler appleHandler = new AppleHandler();
        Handler cabbageHandler = new CabbageHandler();
        Handler riceHandler = new RiceHandler();
        Handler superHandler = new SuperHandler();
        Handler wheatHandler = new WheatHandler();
        appleHandler.setNextHandler(cabbageHandler);
        cabbageHandler.setNextHandler(riceHandler);
        riceHandler.setNextHandler(wheatHandler);
        wheatHandler.setNextHandler(superHandler);
        appleHandler.HandleMessage(type);
    }

    public void CouponInitial(){
        AppleCoupon appleCoupon = new AppleCoupon();
        CabbageCoupon cabbageCoupon = new CabbageCoupon();
        RiceCoupon riceCoupon = new RiceCoupon();
        SuperCoupon superCoupon = new SuperCoupon();
        WheatCoupon wheatCoupon = new WheatCoupon();
        //System.out.print(appleCoupon.getTypename());
        couponMap.put("apple",appleCoupon);
        couponMap.put("rice",riceCoupon);
        couponMap.put("cabbage",cabbageCoupon);
        couponMap.put("super",superCoupon);
        couponMap.put("wheat",wheatCoupon);
    }


}