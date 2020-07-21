package lesson13.game.model;

public class PlayerAttributes {

    private int health = 10;
    private Location location;
    private Inventory inventory;

    public PlayerAttributes(){
        location = new Location();
        inventory = new Inventory();
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Inventory getInventory() {
        return inventory;
    }

}
