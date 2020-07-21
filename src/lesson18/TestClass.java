package lesson18;

public class TestClass implements FirstTestInterface, SecondTestInterface {

    @Override
    public void world() {
      FirstTestInterface.super.world();
        System.out.println("world");
    }

    @Override
    public void print() {
        System.out.println("hello");
    }
}
