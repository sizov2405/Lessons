package lesson8.inClass;

import lesson8.inClass.model.composition.Car;
import lesson8.inClass.model.composition.Engine;
import lesson8.inClass.model.enumExample.EngineType;
import lesson8.inClass.model.inheritance.Cat;

public class Lesson8Main {
    public static void main(String [] args){
        Cat cat = new Cat("blue", 1.8);
        System.out.println(cat.getSize());

        Engine hondaEngine = new Engine(EngineType.BMW);

        Car car = new Car(hondaEngine);
        System.out.println(car.getCarEngineModel());

        EngineType [] types = EngineType.values();
        for(EngineType engineType: types){
            System.out.println(engineType);
        }

    }
}
