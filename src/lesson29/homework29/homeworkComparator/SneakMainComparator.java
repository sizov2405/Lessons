package lesson29.homework29.homeworkComparator;

import java.util.TreeSet;

public class SneakMainComparator {
    public static void main(String[] args) {

        SneakNameComparator nameComparator = new SneakNameComparator();
        SneakSizeComparator sizeComparator = new SneakSizeComparator();
        SneakComporator sneakComporator = new SneakComporator();

        TreeSet<SneakForComparator> sneakTreeSet = new TreeSet<>(sneakComporator);

        sneakTreeSet.add(new SneakForComparator("Jossssssh", "c=============:<"));
        sneakTreeSet.add(new SneakForComparator("Jamessss", "c=========:<"));
        sneakTreeSet.add(new SneakForComparator("Jamessss", "c===========:<"));
        sneakTreeSet.add(new SneakForComparator("Mike", "c===========:<"));

        System.out.println(sneakTreeSet);
    }
}
