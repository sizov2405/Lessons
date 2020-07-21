package lesson28;

import java.util.Set;
import java.util.TreeSet;

public class Lesson28Main {
    public static void main(String[] args) {

        TreeSet <String> countries = new TreeSet<>();

        countries.add("United States of America");
        countries.add("Ukraine");
        countries.add("United Great Britain");
        countries.add("Brazil");
        countries.add("Mexico");
        countries.add("Canada");

        System.out.println(countries);

        countries.remove("Ukraine");
        System.out.println(countries);

        System.out.println(countries.last());

        System.out.println(countries.ceiling("Mexicoa"));

        TreeSet<Integer> treeadd = new TreeSet<Integer>();

        // populate the TreeSet
        treeadd.add(10);
        treeadd.add(20);
        treeadd.add(30);
        treeadd.add(40);

        // Print the TreeSet
        System.out.println("TreeSet: " + treeadd);

        // getting ceiling value for 25
        // using ceiling() method
        int value = treeadd.ceiling(24);

        // printing  the ceiling value
        System.out.println("Ceiling value for 25: "
                + value);

    }
}
