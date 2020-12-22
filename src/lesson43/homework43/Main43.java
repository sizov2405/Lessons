package lesson43.homework43;

public class Main43 {
    public static void main(String[] args) {

        int[] num = {1,2,3,4,5};

//        Arrays arrays = new Arrays();
//        NumberAnalyzer numberAnalyzer = new NumberAnalyzer();

        System.out.println(Arrays.findNumber(num, 3));
//        System.out.println(Arrays.findNumberForEach(num, 4));
//        System.out.println(Arrays.findNumberWhile(num, 6));
//        System.out.println(Arrays.findNumberDoWhile(num, 1));
//        System.out.println(Arrays.findIndex(num, 1));
//        System.out.println(Arrays.findIndexForEach(num, 6));
//        System.out.println(Arrays.findIndexWhile(num, 2));
//        System.out.println(Arrays.findIndexDoWhile(num, 3));

        System.out.println(NumberAnalyzer.returnNumbers(num, 3));


    }
}
