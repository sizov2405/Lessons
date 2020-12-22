package lesson53.pet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main53Homework {

    public static void main(String[] args) {

        List<MyLovelyPet> myLovelyPets = new ArrayList<>();
        Collections.addAll(myLovelyPets,
                new MyLovelyPet("Tom", "white", 1),
                new MyLovelyPet("Jerry", "brown", 2),
                new MyLovelyPet("Max", "black", 3),
                new MyLovelyPet("Gerda", "black", 4),
                new MyLovelyPet("Jeff", "red", 5));

        myLovelyPets
                .stream()
                .map(MyLovelyPet::getName)
                .filter(entry -> entry.length() < 4)
                .forEach(System.out::println);

        System.out.println("****************");

        myLovelyPets
                .stream()
                .filter(entry -> entry.getAge() > 3)
                .forEach(System.out::println);

        System.out.println("****************");

        myLovelyPets
                .stream()
                .limit(3)
                .filter(entry -> entry.getName().startsWith("J"))
                .forEach(System.out::println);

        System.out.println("****************");

        myLovelyPets
                .stream()
                .limit(myLovelyPets.size() - 1)
                .map(myLovelyPet -> "MyLovelyPet" +
                        " name is '" + myLovelyPet.getName() + '\'' +
                        ", have color '" + myLovelyPet.getColor() + " and " + '\'' +
                        ", and it is age " + myLovelyPet.getAge() + " years old."
                        )
                .forEach(System.out::println);

        System.out.println("****************");

    }
}
