package override;

public class Animal {

    private String name;
    private String animalType;

    public Animal(String animalType,  String name) {
        this.animalType = animalType;
        this.name = name;
    }

    public void doSound() {
        System.out.println("default sound");
    }

    protected String getNameAndType() {
        return "Name : " + name + "  Type : " + animalType;
    }

    public void play() {
        System.out.println("Animal " + "Name : " + name + "  Type : " + animalType + "is playing" + " Faaart!!!" );
    }
}
