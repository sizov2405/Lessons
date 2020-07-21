package lesson13.game.service;

import lesson13.game.enums.Direction;
import lesson13.game.model.Artifact;
import lesson13.game.model.Location;
import lesson13.game.model.PlayerAttributes;

public class PlayerService {

    private GameManager gameManager;
    private InventoryService inventoryService;
    private ArtifactService artifactService;

    public PlayerService() {
        gameManager = GameManager.getInstance();
        inventoryService = new InventoryService();
        artifactService = new ArtifactService();
    }

    public void addToInventory (Artifact artifact) {
        inventoryService.addToInventory(artifact);
    }

    public void getInventoryInfo() {
        inventoryService.getInventoryInfo();
    }

    public void heal(){
        artifactService.heal();
    }

    public void movePlayer(Direction direction) {
        if (isGameOver()) {
            return;
        }
        Location location = gameManager.getPlayerLocation();

//        PlayerAttributes playerAttributes = player.getPlayerAttributes();
//        Location location = playerAttributes.getLocation();
        int x = location.getX();
        int y = location.getY();
        switch (direction) {
            case UP:
                y++;
                break;
            case DOWN:
                if (y > 0) {
                    y--;
                }
                break;
            case LEFT:
                if (x > 0) {
                    x--;
                }
                break;
            case RIGHT:
                x++;
                break;
        }
        updateLocation(x, y);
    }

    public void flashPlayer(Direction direction) {
        if (isGameOver()) {
            return;
        }
        Location location = gameManager.getPlayerLocation();
        int x = location.getX();
        int y = location.getY();
        if (direction == Direction.UP) {
            y += 5;
        }
        else if (direction == Direction.DOWN) {
            if (y > 5) {
                y -= 5;
            }
            else if (y < 5 && y > 0) {
                y = 0;
            }
        }
        else if (direction == Direction.LEFT) {
            if (x > 5) {
                x -= 5;
            }
            else if (x < 5 && x > 0) {
                x = 0;
            }
        }
        else if (direction == Direction.RIGHT) {
            x += 5;
        }
        updateLocation(x,y);
    }

    public Location currentPlayerLocation (){
        Location playerLocation = gameManager.getPlayerLocation();
        System.out.println("Current player location is " + playerLocation);
        return playerLocation;
    }

    public int currentPlayerHealth (){
        int playerHealth = gameManager.getPlayerHealth();
        System.out.println("Current player health is " + playerHealth);
        return playerHealth;
    }

    public boolean isGameOver (){
        if (currentPlayerHealth() <= 0){
            System.out.println("Game over");
            return true;
        }
        return false;
    }

    private void updateLocation (int x, int y){
        Location location = gameManager.getPlayerLocation();
        location.setX(x);
        location.setY(y);
    }

}
