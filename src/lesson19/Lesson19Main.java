package lesson19;

public class Lesson19Main {
    public static void main(String[] args) {

        TestObjectClass testObjectClass = new TestObjectClass(5, "Hello");
        TestObjectClass testObjectClass2 = new TestObjectClass(5, "Hello");
        System.out.println(testObjectClass);
        System.out.println(testObjectClass.equals(testObjectClass2));

        System.out.println(testObjectClass.getClass().getName());
    }
}
