package factory;


import base.Plant;
import utils.Enum.PlantType;

public abstract class AbstractFactory {
    public abstract Plant createPlant(PlantType type);
}
