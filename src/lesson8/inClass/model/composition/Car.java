package lesson8.inClass.model.composition;
//пример композиции car has-a engine
public class Car {
    private Engine engine;

    public Car (Engine engine){
        this.engine = engine;
    }

    public String getCarEngineModel(){
        return "Car has engine: " + engine.getEngineType();
    }
}
