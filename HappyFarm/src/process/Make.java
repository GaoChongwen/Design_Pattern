package process;

import factory.ProduceFactory;
import base.Produce;

/**
 * Design-Pattern: Facade

 * @version 2018/10/28
 * @author xuan liu
 *
 */

public class Price{
    //设定农副产品价格
    public int setPrice(Produce produce) {
        int farmPrice = produce.getFarmPrice();
        produce.setSalePrice(farmPrice + 100);
        System.put.println("the salePrice of "+produce.getType()+" is:"+produce.getSalePrice());
        return produce.getSalePrice();
    }
}

public class Make{
    //制作农副产品
    // =====================参数： FarmObj================
    public Produce make(FarmObj obj) {

        //原材料
        Produce produce = null;
        String type = obj.getType();

        if(type == "animal"){
            isProcess = ((Animal) item).process();
        }
        else if(type == "plant"){
            isProcess = ((Plant) item).process();
        }

        if(isProcess == true) {
            //加工
            System.out.println("this obj can be processed");
            produce = ProduceFactory.getInstance().creatProduce(obj.getName());
            System.out.println("this obj has been processed");

            //设置价格
            //Price.setPrice(produce);
        }
        return produce;
    }
}