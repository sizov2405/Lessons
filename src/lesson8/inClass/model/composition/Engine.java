package lesson8.inClass.model.composition;

import lesson8.inClass.model.enumExample.EngineType;

public class Engine {

    private EngineType engineType;

    public Engine(EngineType engineType){
        this.engineType = engineType;
    }

    public EngineType getEngineType() {
        return engineType;
    }
}
