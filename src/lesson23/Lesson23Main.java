package lesson23;

import java.util.HashSet;
import java.util.Set;

public class Lesson23Main {
    public static void main(String[] args) {

        Fruits melon = new Fruits("Melon", 3);
        Fruits melonUpdate = new Fruits("Watermelon", 3);

        HashSet<Fruits> setOfFruits = new HashSet<>();

        setOfFruits.add(new Fruits("Apple", 1));
        setOfFruits.add(new Fruits("Peach", 2));
        setOfFruits.add(melon);

        System.out.println(setOfFruits.isEmpty());
        melon.setId(4);
//        setOfFruits.remove(melonUpdate);
        setOfFruits.add(melon);

        showSetInfo(setOfFruits);

        HashSet<Fruits> fruitsSet2 = new HashSet<>(setOfFruits);
        showSetInfo(fruitsSet2);

    }

    private static void showSetInfo (Set<Fruits> fruits){
        System.out.println("************");
        for(Fruits fruit : fruits){
            System.out.println(fruit);
        }
        System.out.println("************");
    }
}
