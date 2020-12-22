package lesson43.homework43;

public class Arrays {

    public static boolean findNumber(int[] numbers, int number){
        for(int i=0; i<numbers.length; i++){
            if(number == numbers[i]){
                return true;
            }
        }
        return false;
    }

    public static boolean findNumberForEach(int[] numbers, int number){
        for(int element : numbers){
            if(number == element){
                return true;
            }
        }
        return false;
    }

    public static boolean findNumberWhile (int[] numbers, int number){
        int i = 0;
        while (i<numbers.length){
            if(number == numbers[i]){
                return true;
            }
            i++;
        }
        return false;
    }

    public static boolean findNumberDoWhile (int[] numbers, int number){
        int i = 0;
        do{
            if(number == numbers[i]){
                return true;
            }
            i++;
        } while (i<numbers.length);
        return false;
    }

    public static int findIndex(int[] numbers, int number){
        for(int i=0; i<numbers.length; i++){
            if(number == numbers[i]){
                return i;
            }
        }
        return -1;
    }

    public static int findIndexForEach(int[] numbers, int number){
        int index = 0;
        for(int element : numbers){
            if(number == element){
                return index;
            }
            index++;
        }
        return -1;
    }

    public static int findIndexWhile(int[] numbers, int number){
        int i = 0;
        while (i<numbers.length){
            if(number == numbers[i]){
                return i;
            }
            i++;
        }
        return -1;
    }

    public static int findIndexDoWhile(int[] numbers, int number){
        int i = 0;
        do{
            if(number == numbers[i]){
                return i;
            }
            i++;
        } while (i<numbers.length);
        return -1;
    }
}
