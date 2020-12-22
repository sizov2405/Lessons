package lesson51.homework;

import java.util.ArrayList;
import java.util.List;

public class Main51Homework {
    public static void main(String[] args) {

        List<Letter> letters = new ArrayList<>();

        method(letters);

        int shootNumber = 10;

        while (!Letter.won) {
            int index = (int)(Math.random() *26);
            letters.get(index).shoot(shootNumber);
        }

        for(Letter letter : letters) {
            System.out.println(letter);
        }
        System.out.println((char) 33);
    }

    public static void method (List<Letter> list){
        for(int i = 97; i<123; i++){
            list.add(new Letter((char) i));
        }
    }

}
