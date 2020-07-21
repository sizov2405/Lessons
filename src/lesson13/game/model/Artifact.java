package lesson13.game.model;

import lesson13.game.enums.ArtifactType;

public class Artifact {

    private ArtifactType artifactType;


    protected Artifact(ArtifactType artifactType){
        this.artifactType = artifactType;
    }

    public ArtifactType getArtifactType() {
        return artifactType;
    }
}
