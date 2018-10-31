package building.house.furniture;

public class Furniture {
    private String name;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Furniture(String name) {
        super();
        this.name = name;
    }
    public String getDesc(){return null;};
    public String toString(){
        return name + getDesc();
    }
}
