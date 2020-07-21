package lesson20;

import java.util.ArrayList;
import java.util.List;

public class lesson20Main {
    public static void main(String[] args) {

        Kitchen kitchen = new Kitchen(5.2);

        List <Kitchen> list = new ArrayList <>();
        list.add(new Kitchen(3.5));
        list.add(kitchen);
        list.add(new Kitchen(7.9));
        list.add(new Kitchen(8.3));
        list.set(2, new Kitchen(10.4));

        System.out.println(list.remove(3));
        System.out.println(list.get(2));
        System.out.println(list.contains(kitchen));


//        System.out.println("Is list having size: " + isListHavingSize(list, 8.3));
        System.out.println("Index of kitchen's element that has size: " + getIndexOfElemetWithSize(list, 8.3));
        System.out.println("List size: " + list.size());
        getListInfo(list);
    }

    private static void getListInfo (List <Kitchen> kitchenlist){
        System.out.println("***********");
        for(Kitchen  kitchen : kitchenlist){
            System.out.println(kitchen);
        }
        System.out.println("***************");
    }

//    private static boolean isListHavingSize (List <Kitchen> kitchenlist, double size){
//        for(Kitchen  kitchen : kitchenlist){
//            if(kitchen.getSize() == size){
//                return true;
//            }
//        }
//        return false;
//    }

    private static int getIndexOfElemetWithSize (List <Kitchen> kitchenlist, double size){
        for(Kitchen  kitchen : kitchenlist){
            if(kitchen.getSize() == size){
                return kitchenlist.indexOf(kitchen);
            }
        }
        return -1;
    }
}
