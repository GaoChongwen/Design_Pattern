package singleton;

import base.FarmObj;

public class Farm extends FarmObj {
    private volatile static Farm singleton = new Farm();
    protected boolean design_pattern;

    private Farm(){
        design_pattern =true;
    }


    public static Farm getInstance() { return singleton; }


}
