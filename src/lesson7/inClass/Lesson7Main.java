package lesson7.inClass;

import lesson7.inClass.aquarium.Aquarium;
import lesson7.inClass.aquarium.Fish;

public class Lesson7Main {
    public static void main(String[] args) {

        //статический метод можно и нужно вызывать через класс, а не через экземпляр объектов
//        StaticExample.staticMethod();

        Fish fish1 = new Fish("Vasya", "Red");
        Fish fish2 = new Fish("Katya", "Blue");

        Aquarium aquarium = new Aquarium();

        aquarium.addToAquarium(fish1);
        aquarium.addToAquarium(fish2);

        //присваевание результата работы метода getFishByName к переменной вася типа фиш
        Fish vasya = aquarium.getFishByName("Vasya");
        System.out.println(vasya.getColor());
        System.out.println(vasya.getFishID());

    }
}
