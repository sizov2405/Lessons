package lesson55;

import lesson54.Cat;

import java.util.*;
import java.util.stream.Collectors;

public class Main55 {
    public static void main(String[] args) {

        List<Cat> cats = new ArrayList<>();

        Collections.addAll(cats,
                new Cat("Nike", 2, "Brown"),
                new Cat ("Bobby", 1, "Black"),
                new Cat ("Kyle", 11, "Red"),
                new Cat ("Kyle", 4, "Red"),
                new Cat ("Kylie", 4, "Green")
        );

        System.out.println(method(cats));

    }

    private static long method (List<Cat> cats){
        return cats
                .stream()
                .filter(cat ->  cat.getAge() <3)
                .count();
    }
}
