package lesson52.homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class MainHomework52 {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        Collections.addAll(names, "John", "Mark", "Adam", "Maria", "Mark", "Samanta", "Keanu", "James", "Mark");

        names.forEach(entry -> System.out.println(entry));

        System.out.println("******************");

        names
                .stream()
                .filter(entry -> entry.length() > 4)
                .forEach(entry -> System.out.println(entry));

        System.out.println("*******************");

        List<String> names1 = names
                .stream()
                .filter(entry -> entry.length() <= 4)
                .collect(Collectors.toList());

        names1.forEach(entry -> System.out.println(entry));


        System.out.println("*********************");

        names
                .stream()
                .limit(3)
                .forEach(entry -> System.out.println(entry));

        System.out.println("***********************");

        names
                .stream()
                .distinct()
                .forEach(System.out::println);

        System.out.println("***********************");


        Set<String> uniqueNames = names
                .stream()
                .limit(4)
                .collect(Collectors.toSet());


    }
}
