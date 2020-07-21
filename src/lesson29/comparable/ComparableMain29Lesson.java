package lesson29.comparable;

import java.util.TreeSet;

public class ComparableMain29Lesson {
    public static void main(String[] args) {

        TreeSet<Person> personTreeSet = new TreeSet<>();

        personTreeSet.add(new Person("Adam", "Smith", 20));
        personTreeSet.add(new Person("Adam", "Smith", 19));
        personTreeSet.add(new Person("Forrest", "Smith", 30));
        personTreeSet.add(new Person("Roy", "Chao", 40));

        System.out.println(personTreeSet);
    }
}
