package base.animal;

public class MatureState implements AnimalState{
    private Animal animal;
    public MatureState(Animal animal){
        this.animal=animal;
    }

    @Override
    public void grow() {
        //暂时什么都不做
        //之后可以考虑随回合数增加而当场去世
    }
}
