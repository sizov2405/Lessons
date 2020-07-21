package lesson18.homework18;

public class MagicEnemy implements CastTheMagic, Movements{

    @Override
    public void castFireMagic() {
        System.out.println("Magic Fire cast");
    }

    @Override
    public void castWaterMagic() {
        System.out.println("Magic Water Cast");
    }

    @Override
    public void move() {
        System.out.println("Move something");
    }

    @Override
    public void run() {
        System.out.println("Run somewhere");
    }
}
