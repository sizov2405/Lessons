package social.petLesson;

import social.petLesson.room.Pet;
import social.petLesson.room.PetOwner;

public class RoomMain {
    public static void main(String[] args) {

        Pet cat = new Pet();
        cat.setType("Cat");
        cat.setName("Vasya");

        Pet dog = new Pet();
        dog.setType("Dog");
        dog.setName("Gerda");


        Pet parrot = new Pet();
        parrot.setType("Parrot");
        parrot.setName("Zorik");

        Pet monkey = new Pet();
        monkey.setType("Monkey");
        monkey.setName("Monya");

        PetOwner dogOwner = new PetOwner(dog, "bone");
        PetOwner catOwner = new PetOwner(cat, "ball");
        PetOwner monkeyOwner = new PetOwner(monkey, "rope");
        PetOwner parrotOwner = new PetOwner(parrot, "ball");

        dog.play();
        dog.play();
        dog.play();
        dog.play();

        Pet[] room = {cat, dog, parrot, monkey};
        for (Pet entry : room) {
//            Toy currentToy = ;
            System.out.println(entry.getType() + " " + entry.getName() + " likes his " + entry.getToy());
            System.out.println(entry.getToyStatus());
        }

    }
}
