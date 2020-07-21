package lesson17.homework17;

public class AnimalAction {

    public static void makeSound (Animal animal){
        System.out.println(animal.sound());
    }

    public static void feedAnimal (Animal animal){
        System.out.println(animal.eat());
    }
}
