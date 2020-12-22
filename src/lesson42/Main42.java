package lesson42;

import project.model.Client;

import java.util.HashSet;

public class Main42 {

    public static void main(String[] args) {


        DummyClass dummyClass = new DummyClass("Matt");
        DummyClass dummyClass2 = new DummyClass("Matt");
//        Client client = new Client("Bob", "Smith", 12, new HashSet<>());

//        System.out.println(dummyClass);

        DummyClass clone = null;
        try {
            clone = dummyClass.clone();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Original: " + dummyClass);
        System.out.println("Clone: " + clone);
    }
}
