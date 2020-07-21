package lesson17.homework17;

public abstract class Bird extends Animal {

    public abstract void fly();
    public void test(){
        System.out.println("Bird");
    }

    @Override
    public String sound() {
        return null;
    }

    @Override
    public String eat() {
        return null;
    }
}
