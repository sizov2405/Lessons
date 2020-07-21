package override;

public class BigDog extends Dog {

    public BigDog(String name) {
        super(name);
    }

    @Override
    public void doSound() {
        super.doSound();
        System.out.println("Gromko gav");
    }

    @Override
    public void play() {
        System.out.println("Animal big dog is playing" + " Very Faaart!!!" );
    }

    @Override
    public void guard() {
        System.out.println("Doing dangerous guard");
    }
}
