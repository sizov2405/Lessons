package lesson46;

import java.util.ArrayList;

public class Main46 {
    public static void main(String[] args) {

         String[] array = {"Abc", "def", "ghi"};
         String[] array2 = {"Abc", "deg", "dez", "ghi"};
         String elementToChange = "aaa";

         ArrayHomework arrayHomework = new ArrayHomework();

//        System.out.println(arrayHomework.centerArray(array));
//        System.out.println(arrayHomework.centerArray(array2));
//
//        String[] array3 = arrayHomework.centerArrayChange(array2, elementToChange);
//        for (int i=0; i<array3.length; i++){
//            System.out.println(array3[i]);
//        }

        String[] array4 = arrayHomework.changeElementsByPlaces(array2, elementToChange);
        for (int i=0; i<array4.length; i++){
            System.out.println(array4[i]);
        }



    }
}
