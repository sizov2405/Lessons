package lesson52;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Main52 {

    public static void main(String[] args) {

        int[] numbers = {2,5,7,3,9,2,7};

        //traditional way
        int[] symbols = new int[numbers.length];
        int count = 0;

        for(int i=0; i<numbers.length; i++){
            boolean isdistinct = true;
            for(int j=0; j<i; j++){
                if(numbers[i] == numbers[j]){
                    isdistinct =false;
                    break;
                }
            }
            if(isdistinct){
                symbols[count] = numbers[i];
                count++;
            }
        }
        for(int num : symbols) {
            System.out.println(num);
        }
        System.out.println("_________________");

        //stream way
        int [] symbols2 = Arrays
                .stream(numbers)
                .distinct()
                .toArray();

        Arrays
                .stream(symbols2)
                .forEach(sym -> System.out.println(sym));

        System.out.println("_________________");
        //_____________________

        List<Integer> num = new ArrayList<>();
        Collections.addAll(num, 4,7,9,1,0,4);
        num
                .stream()
                .distinct()
                .forEach(syms -> System.out.println(syms));


        System.out.println("_________________");

        num
                .stream()
                .limit(2)
                .forEach(syms -> System.out.println(syms));


        System.out.println("_________________");

        num
                .stream()
                .skip(2)
                .forEach(syms -> System.out.println(syms));


        System.out.println("_________________");

        num
                .stream()
                .filter(syms -> syms != 4)
                .forEach(syms -> System.out.println(syms));


        System.out.println("_________________");

        List<Integer> mun2 = num
                .stream()
                .filter(syms -> syms != 9)
                .collect(Collectors.toList());

        mun2
                .forEach(syms -> System.out.println(syms));
    }
}
