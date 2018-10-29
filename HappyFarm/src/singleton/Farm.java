package singleton;

import base.FarmObj;

public class Farm extends FarmObj {
    private volatile static Farm singleton = new Farm();

    public static Farm getInstance() { return singleton; }

    private Farm(){ }

}
