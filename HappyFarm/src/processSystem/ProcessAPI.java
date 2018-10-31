package processSystem;

import base.FarmObj;
import base.Produce;

public interface ProcessAPI {
    public Produce process(FarmObj obj);
    public void setDesignPattern(boolean designPattern);
}
