package social.petLesson.room;

public class PetOwner {

    private Pet pet;
   // private Toy toy;

    public PetOwner(Pet pet, String typeOfToy){
        this.pet = pet;
        pet.setToy(new Toy(typeOfToy));
    }
}
