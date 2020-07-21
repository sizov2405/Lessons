package override;

public class Dog extends Animal {


    public Dog(String name) {
        super("Dog", "Sobaka");
    }

    @Override
    public void doSound() {
        super.doSound();
        System.out.println("Gav");
    }

    public void guard() {
        System.out.println("Doing guard");
    }

}
