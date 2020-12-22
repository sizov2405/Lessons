package lesson54;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main54 {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();

        Collections.addAll(names, "Kate", "Brian", "Tom", "Jerry", "Alice");

        List<String> namesStartsWithT = names
                .stream()
                .filter(name-> name.startsWith("Z"))
                .collect(Collectors.toList());

        System.out.println(namesStartsWithT.size() >0);

        System.out.println("____________");

        boolean isNamesStartsWithT = names
                .stream()
                .anyMatch(name-> name.startsWith("Z"));

        System.out.println(isNamesStartsWithT);

        System.out.println("____________");

        Optional<String> optionalName = names
                .stream()
                .filter(name -> name.startsWith("Z"))
                .findAny();

        optionalName.ifPresent(System.out::println);

        System.out.println("--------------");

        Long count = names
                .stream()
                .filter(name-> name.startsWith("K"))
                .count();

        System.out.println(count);

        System.out.println("-----------");

        String optionalNames = names
                .stream()
                .filter(name -> name.startsWith("Z"))
                .findAny()
                .orElse("Default");

        System.out.println(optionalNames);

        System.out.println("-----------");

//        String optionalNamesWithZ = names
//                .stream()
//                .filter(name -> name.startsWith("Z"))
//                .findAny()
//                .orElseThrow(RuntimeException::new);
//
//        System.out.println(optionalNamesWithZ);

//        System.out.println("-----------");

        String optionalNamesFilters = names
                .stream()
                .filter(name -> name.startsWith("T") || name.length()>4)
                .findAny()
                .orElse("Default");

        System.out.println(optionalNamesFilters);

        System.out.println("-----------");



        List<Integer> numbers = new ArrayList<>();

        Collections.addAll(numbers, 4,7,2,0,4,2,5);

        Optional<Integer> optionalSum = numbers
                .stream()
                .reduce(Integer::sum);

        optionalSum.ifPresent(System.out::println);
        System.out.println("-----------");

        List<Cat> cats = new ArrayList<>();

        Collections.addAll(cats,
                new Cat ("Tom", 1, "Black"),
                new Cat ("Jerry", 2, "Brown"),
                new Cat ("Rex", 3, "White"),
                new Cat ("Max", 4, "Red"),
                new Cat ("Zorik", 5, "Brown")
        );

        cats
                .stream()
                .filter(cat -> cat.getAge()>2 && !cat.getColor().equals("Brown"))
                .forEach(System.out::println);




    }

    private static List<Cat> method (List<Cat> cats){
        Integer maximumNameCharacters = cats
                .stream()
                .map(cat -> cat.getName().length())
                .max(Integer::compare)
                .orElse(0);

        return cats
                .stream()
                .filter(cat -> maximumNameCharacters.equals(cat.getName().length()))
                .collect(Collectors.toList());
    }

    private static List<Cat> method2 (List<Cat> cats){
        return cats
                .stream()
                .filter(cat -> !cat.getColor().equals("Red"))
                .collect(Collectors.toList());
    }

    private static Cat method3 (List<Cat> cats){
        return cats
                .stream()
                .filter(cat -> cat.getColor().equals("Green"))
                .findAny()
                .orElse(null);
    }

    private static boolean method4 (List<Cat> cats){
        return cats
                .stream()
                .anyMatch(cat -> cat.getAge() > 10);
    }
}
