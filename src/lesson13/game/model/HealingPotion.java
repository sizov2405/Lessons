package lesson13.game.model;


import lesson13.game.enums.ArtifactType;

public class HealingPotion extends Artifact {


    public HealingPotion() {

        super(ArtifactType.HEALING_POTION);
    }

    @Override
    public String toString() {
        return "HealingPotion{}";
    }
}
