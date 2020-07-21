package lesson13.game.service;

import lesson13.game.model.PlayerAttributes;

public class EnemyService {

    private static final int DAMAGE = 1;
    private static final int BIG_DAMAGE = 5;

    private GameManager gameManager;

    public EnemyService() {
        gameManager = GameManager.getInstance();
    }

    public void hitThePlayer(){
        hitThePlayer(DAMAGE);
    }

    public void hardHitThePlayer(){
       hitThePlayer(BIG_DAMAGE);
    }

    private void hitThePlayer (int damage){
        int newHealth = gameManager.getPlayerHealth() - damage;
        gameManager.getPlayerAttributes().setHealth(newHealth);
    }

}
