package lesson13.game.model;

import lesson13.game.enums.ArtifactType;

public class Armor extends Artifact{

    private String name;

    public Armor(String name){
        super(ArtifactType.ARMOR);
        this.name = name;
    }

    public String getName() {

        return name;
    }

    @Override
    public ArtifactType getArtifactType() {
        return super.getArtifactType();
    }

    @Override
    public String toString() {
        return "Armor{" +
                "name='" + name + '\'' +
                '}';
    }
}
