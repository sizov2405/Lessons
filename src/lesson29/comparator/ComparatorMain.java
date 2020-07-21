package lesson29.comparator;

import java.util.TreeSet;

public class ComparatorMain {
    public static void main(String[] args) {

        HumanLastNameComporator humanLastNameComporator = new HumanLastNameComporator();
        HumanComporator humanComporator = new HumanComporator();

        TreeSet<Human> humanTreeSet = new TreeSet<>(humanLastNameComporator);

        humanTreeSet.add(new Human("Adam", "Smith", 20));
        humanTreeSet.add(new Human("Adam", "Smith", 19));
        humanTreeSet.add(new Human("Forrest", "Smith", 30));
        humanTreeSet.add(new Human("Roy", "Chao", 40));

        System.out.println(humanTreeSet);
    }
}
