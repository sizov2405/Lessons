package lesson13.game.service;

import lesson13.game.enums.ArtifactType;
import lesson13.game.model.Artifact;

public class ArtifactService {

    private static final int HEAL = 5;
    private InventoryService inventoryService;
    private GameManager gameManager;

    public ArtifactService() {
        inventoryService = new InventoryService();
        gameManager = GameManager.getInstance();
    }

    public void heal (){
        Artifact healingPotion = inventoryService.getArtifact(ArtifactType.HEALING_POTION);
        if (healingPotion == null){
            System.out.println("No healing potion");
            return;
        }
        int newHealth = gameManager.getPlayerHealth() + HEAL;
        gameManager.getPlayerAttributes().setHealth(newHealth);
        inventoryService.removeArtifacts(ArtifactType.HEALING_POTION);
    }

}
