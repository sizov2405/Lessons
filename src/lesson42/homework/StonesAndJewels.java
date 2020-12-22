package lesson42.homework;

public class StonesAndJewels {

    public static int numJewelsInStones(String J, String S) {
        if(J == null || J.isEmpty() || S == null || S.isEmpty()){
            return 0;
        }
        char[] jewels = J.toCharArray();
        char[] stones = S.toCharArray();
        int counter = 0;
        for(int i = 0; i<jewels.length; i++){
            for(int j = 0; j<stones.length; j++){
                if(jewels[i] == stones[j]){
                    counter++;
                }
            }
        }
        return counter;
    }

}
