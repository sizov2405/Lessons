package lesson41;

public class Main41 {
    public static void main(String[] args) {

        int mas[] = {3, 4, -17, 1, 2, 0, 0, -100};
        int n = mas.length;

        System.out.println(findMinInArray(mas, n));
    }

    private static int findMinInArray (int mas[], int n){
        //recursive
            if(n == 1) {
                return mas[0];
            }
            return Math.min(mas[n-1], findMinInArray(mas, n-1));
        }
    }

