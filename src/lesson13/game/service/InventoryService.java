package lesson13.game.service;

import lesson13.game.enums.ArtifactType;
import lesson13.game.model.Artifact;

public class InventoryService {

    private GameManager gameManager;

    public InventoryService() {
        gameManager = GameManager.getInstance();
    }

    public void addToInventory(Artifact artifact) {
        System.out.println("Trying to add artifact: " + artifact);
        Artifact [] artifacts = gameManager.getPlayerArtifacts();
        for(int i = 0; i<artifacts.length; i++){
            if (artifacts[i] == null) {
                artifacts[i] = artifact;
                return;
            }
        }
    }

    public void getInventoryInfo() {
        if (isInventoryEmpty()) {
            System.out.println("Inventory is empty");
            return;
        }
        Artifact [] artifacts = gameManager.getPlayerArtifacts();
        for(int i = 0; i<artifacts.length; i++){
            if (artifacts[i] != null) {
                    System.out.println(artifacts[i]);
                }
            }
    }

    public Artifact getArtifact (ArtifactType artifactType){
        Artifact[] artifacts = gameManager.getPlayerArtifacts();
        for(int i = 0; i<artifacts.length; i++) {
            if (artifacts[i] != null && artifacts[i].getArtifactType() == artifactType) {
                return artifacts[i];
            }
        }
        return null;
    }

    private boolean isInventoryEmpty() {
        for (Artifact artifactElement : gameManager.getPlayerArtifacts()) {
            if (artifactElement != null) {
                return false;
            }
        }
        return true;
    }

    public void removeArtifacts(ArtifactType artifactType){
        Artifact[] artifacts = gameManager.getPlayerArtifacts();
        for(int i = 0; i<artifacts.length; i++){
            if (artifacts[i] != null && artifacts[i].getArtifactType() == artifactType ) {
                artifacts[i] = null;
            }
        }
    }


}
