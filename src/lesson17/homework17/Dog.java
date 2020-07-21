package lesson17.homework17;

public class Dog extends Animal {
    @Override
    public String sound() {
        System.out.println("Woof");
        return "Woof";
    }

    @Override
    public String eat() {
        String text = "Dog food";
        System.out.println(text);
        return text;
    }
}
