package lesson32;

import java.util.HashMap;
import java.util.Map;

public class Lesson32Map {
    public static void main(String[] args) {

        Map<Integer, HouseOwner> map = new HashMap<>();

        HouseOwner owner0 = new HouseOwner(1, "Robert", 18);
        HouseOwner owner = new HouseOwner(2, "Bob", 4);
        HouseOwner owner2 = new HouseOwner(3, "Martin", 5);
        HouseOwner owner3 = new HouseOwner(4, "Martha", 17);
        HouseOwner owner4 = new HouseOwner(4, "Paul", 16);
        
        map.put(owner.getId(), owner);
        map.put(owner2.getId(), owner2);
        //map.put(owner0.getId(), owner0);
        map.put(10, owner3);
        map.put(owner4.getId(), owner4);

//        System.out.println(map);
        //System.out.println(map.getOrDefault(5, new HouseOwner(2, "Kyle")));

        System.out.println(map.containsKey(3));
        System.out.println(map.containsValue(owner0));

//        for(HouseOwner houseOwner : map.values()){
//            if (houseOwner.getName().equals("Bob")){
//                System.out.println(houseOwner);
//            }
//        }

        //System.out.println(map.keySet());

//        for(Map.Entry<Integer, HouseOwner> entry : map.entrySet()){
//            if(entry.getKey().equals(17)) {
//                continue;
//            }
//                System.out.println(entry);
//        }


        //hash     4    10     17     26
        //result   4    10      1     10

        int n = 15;    // 0000 1111
        int hash = 10;  // 0001 1010
        //int result = n & hash;   //1010
        int magicResult = hash % (n + 1);
//        System.out.println(magicResult);


    }
}
