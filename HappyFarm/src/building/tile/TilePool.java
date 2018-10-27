package building.tile;

public class TilePool extends Tile {

    private String key;

    public TilePool(String key) {
        this.key = key;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}
