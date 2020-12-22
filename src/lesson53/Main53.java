package lesson53;

import javax.crypto.spec.PSource;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;

public class Main53 {
    public static void main(String[] args) {

        //all the same
        //we created these interfaces
        //ArithmeticOperation operation = (a,b) -> a+b;
        ArithmeticOperation operation = Integer::sum;
//        ArithmeticOperation operation1 = new ArithmeticOperation() {
//            @Override
//            public int calculate(int a, int b) {
//                return a+b;
//            }
//        };
        //existing interface
        BinaryOperator<Integer> sum = Integer::sum;
        System.out.println(sum.apply(2,3));

        System.out.println(operation.calculate(4,5));




        //reference to Person's constructor
        PersonManager personManager = Person::new;
        Person person = personManager.constract();
        person.info();


        List<String> names = new ArrayList<>();
        Collections.addAll(names, "John", "Mark", "Adam", "Maria", "Mark", "Samanta", "Keanu", "James", "Mark");

        names
                //.forEach(entry -> printEntryByNameFirstLetter(entry));
                .forEach(Main53::printEntryByNameFirstLetter);

//Predicate - functional interface
        Predicate<Integer> isPositive = abc -> abc >0;
        System.out.println(isPositive.test(5));



        //more methods of Stream
        List<Person> people = new ArrayList<>();
        Collections.addAll(people, new Person("Matt"), new Person("Adam"), new Person("Mark"));
        people
                .stream()
                .map(Person::getName)
                .forEach(System.out::println);

        System.out.println("****************");

        Optional<String> any = people
                .stream()
                .map(Person::getName)
                .filter(entry -> entry.startsWith("M"))
                .findAny();

        any.ifPresent(System.out::println);



    }

    private static void printEntryByNameFirstLetter (String name){
        if(name.startsWith("M")) {
            System.out.println(name);
        }
    }
}
