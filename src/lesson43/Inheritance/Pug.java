package lesson43.Inheritance;

public class Pug extends Dog {

    public Pug(String name) {
        super(name);
    }

    @Override
    public void bark() throws Exception {
//        super.bark();
        System.out.println("Pug barks");
        if(getName().equals("bad pug")){
            throw new MyException("good pug exception");
        }
    }
}
