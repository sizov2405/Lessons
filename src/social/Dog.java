package social;

public class Dog {
    private int age =3;
    public String color;
    String name = "Bob";

    public String getName (){
        return "My beautiful " + name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
