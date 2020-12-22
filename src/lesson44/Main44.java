package lesson44;

public class Main44 {
    public static void main(String[] args) {

        Person person = new Person(2, 2);

        Kettle kettle = new Kettle();
        try {
            kettle.qtyOfPages(9, person);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
