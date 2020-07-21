package lesson13.game.service;

import lesson13.game.model.Artifact;
import lesson13.game.model.Location;
import lesson13.game.model.Player;
import lesson13.game.model.PlayerAttributes;

public class GameManager {

    private Player player;
    private static GameManager instance;

    private GameManager() {
        init();
    }

    public static GameManager getInstance (){
        if(instance == null){
            instance = new GameManager();
        }
        return instance;
    }

    private void init (){
        player = Player.getInstance();
        PlayerAttributes playerAttributes = new PlayerAttributes();
        player.setPlayerAttributes(playerAttributes);
    }

    public PlayerAttributes getPlayerAttributes(){
        return player.getPlayerAttributes();
    }

    public Location getPlayerLocation(){
        return getPlayerAttributes().getLocation();
    }

    public int getPlayerHealth (){
        return getPlayerAttributes().getHealth();
    }

    public Artifact [] getPlayerArtifacts (){
        return getPlayerAttributes().getInventory().getArtifacts();
    }

}
