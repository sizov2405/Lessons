package lesson31;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class Lesson31 {
    ArrayList<String> arrayListField = new ArrayList<>();
    public static void main(String[] args) {
// 3, 5, 4, 6, 7, 8, 9
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("3");
        linkedList.add("4");
        linkedList.add(1,"5");
        linkedList.addLast("6");
        ArrayList<String> arrayList = new ArrayList<>(){{
            add("7");
            add("8");
            add(1,"9");
        }};
        linkedList.addAll(0, arrayList);
        linkedList.set(3, "a");
        Collections.addAll(linkedList, "r", "t", "y");

        logLinkedList(linkedList);
    }
    private static void logLinkedList (LinkedList<String> linkedList){
        System.out.println("******");
//        for(String element :linkedList){
//            System.out.println(element);
//        }
        System.out.println(linkedList);
        System.out.println("******");

    }
}
