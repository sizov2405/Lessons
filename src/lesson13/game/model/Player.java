package lesson13.game.model;

public class Player {

    private static Player instance;
    private PlayerAttributes playerAttributes;

    private Player (){
    }

    public static Player getInstance (){
        if(instance == null){
            instance = new Player();
        }
        return instance;
    }

    public void setPlayerAttributes(PlayerAttributes playerAttributes) {
        this.playerAttributes = playerAttributes;
    }

    public PlayerAttributes getPlayerAttributes() {
        return playerAttributes;
    }
}
