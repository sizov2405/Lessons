package lesson51;

import java.util.ArrayList;
import java.util.List;

public class Main51 {
    public static void main(String[] args) {

//        int[] mas = {3,-6,4,-67};
//        int[] mas2 = {2,7,3,-4};
//        int[] mas3 = new int[4];
//
//        for(int i = 0, j = mas2.length-1; i<mas.length; i++, j--){
//                mas3[i] = mas[i] - mas2[j];
//        }
//        for (int number : mas3) {
//            System.out.println(number);
//        }

        List<Core> core = new ArrayList<>();

        method(core);
        int index = (int)(Math.random() *4);
        int shootNumber = (int)(Math.random() *50 +1);
        core.get(index).shoot(shootNumber);
        for(Core c: core) {
            System.out.println(c);
        }

    }

    public static void method (List<Core> core){
        core.add(new Core('a'));
        core.add(new Core('b'));
        core.add(new Core('c'));
        core.add(new Core('d'));
        core.add(new Core('e'));
    }
}
