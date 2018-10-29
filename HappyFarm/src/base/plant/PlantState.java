package base.plant;

import base.plant.Plant;

public interface PlantState {
    public void grow(Plant plant);

    public void remove(Plant plant);

    public void harvest(Plant plant);

}