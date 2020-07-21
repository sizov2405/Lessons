package override;

public class Cat extends Animal{


    public Cat() {
        super("Cat", "Kot");
    }

    @Override
    public void doSound() {
        System.out.println("Mau");
    }

}
