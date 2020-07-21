package lesson13.game;

import lesson13.game.enums.Direction;
import lesson13.game.model.Armor;
import lesson13.game.model.Artifact;
import lesson13.game.model.HealingPotion;
import lesson13.game.service.EnemyService;
import lesson13.game.service.PlayerService;

public class GameMain {

    public static void main(String[] args) {

        PlayerService playerService = new PlayerService();
        EnemyService enemyService = new EnemyService();


        playerService.currentPlayerLocation();
        playerService.movePlayer(Direction.UP);
        playerService.movePlayer(Direction.RIGHT);
        playerService.flashPlayer(Direction.RIGHT);
        playerService.currentPlayerLocation();

        playerService.currentPlayerHealth();
        enemyService.hitThePlayer();
        enemyService.hardHitThePlayer();
        playerService.currentPlayerHealth();
        playerService.heal();
        playerService.currentPlayerHealth();
        playerService.addToInventory(new HealingPotion());
        playerService.getInventoryInfo();
        playerService.heal();
        playerService.currentPlayerHealth();
        playerService.getInventoryInfo();


//        playerService.getInventoryInfo();
//        playerService.addToInventory(new Armor("Armor"));
//        playerService.getInventoryInfo();


    }
}
