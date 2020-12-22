package lesson53;

public class Person {

    private String name;

    public Person(String name) {
        this.name = name;
    }

    public Person() {
    }

    public static String info (){
        return "Text about person";
    }

    public String getName() {
        return name;
    }
}
