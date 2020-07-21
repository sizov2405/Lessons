package lesson29.homework29;

public class SneakUtils {

    public static int getSneakSNumberInName (String name){
        char[] letters = name.toCharArray();
        int result = 0;
        for(char letter : letters){
            if(letter ==  's' || letter == 'S'){
                result++;
            }
        }
        return result;
    }
}
