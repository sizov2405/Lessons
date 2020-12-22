package lesson43.Inheritance;

public class Dog {

    private String name;

    public Dog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void bark () throws Exception{
        System.out.println("Dog barks");
        if(name == null){
            throw  new Exception("Dog exception");
        }
    }
}
