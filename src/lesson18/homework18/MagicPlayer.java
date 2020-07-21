package lesson18.homework18;

public class MagicPlayer implements CastTheMagic, Movements {
    @Override
    public void castFireMagic() {
        System.out.println("Cast fire magic");
    }

    @Override
    public void castWaterMagic() {
        System.out.println("Cast water magic");
    }

    @Override
    public void move() {
        System.out.println("Move");
    }

    @Override
    public void run() {
        System.out.println("Run");
    }
}
