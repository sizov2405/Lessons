package lesson29.homework29.homeworkComparable;

import java.util.TreeSet;

public class SneakMain {
    public static void main(String[] args) {

        TreeSet<SneakForComparable> sneakTreeSet = new TreeSet<>();

        sneakTreeSet.add(new SneakForComparable("Jossssssh", "c=============:<"));
        sneakTreeSet.add(new SneakForComparable("Jamessssss", "c=========:<"));
        sneakTreeSet.add(new SneakForComparable("Jamessss", "c==================:<"));

        System.out.println(sneakTreeSet);

    }
}
