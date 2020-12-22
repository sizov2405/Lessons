package lesson43;

import lesson43.Inheritance.Dog;
import lesson43.Inheritance.Pug;

public class Lesson43Main {
    public static void main(String[] args) {

        int[] nums = {1,2,3,1,1,3};
        int[] nums2 = {1,1,1,1};

//        System.out.println(numIdenticalPairs(nums));
//        System.out.println(numIdenticalPairs(nums2));

        char a = '6';
//        System.out.println(a);

//        System.out.println(counterFor(nums, 1));
//        System.out.println(counterForEach(nums, 1));
//        System.out.println(counterWhile(nums, 1));
//        System.out.println(counterDoWhile(nums, 1));

        Dog dog = new Dog("bad pug");
        try {
            dog.bark();
            System.out.println(dog.getName());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        Pug pug = new Pug("Bob");
        try {
            pug.bark();
            System.out.println(pug.getName());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        Dog pugDog = new Pug(null);
        try {
            pugDog.bark();
            System.out.println(pugDog.getName());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private static int counterFor(int[] numbers, int number){
        int counter = 0;
        for(int i=0; i<numbers.length; i++){
            if(number == numbers[i]){
                counter++;
            }
        }
        return counter;
    }

    private static int counterForEach(int[] numbers, int number){
        int counter = 0;
        for(int element : numbers){
            if(number == element){
                counter++;
            }
        }
        return counter;
    }

    private static int counterWhile (int[] numbers, int number){
        int counter = 0;
        int i = 0;
        while (i<numbers.length){
            if(number == numbers[i]){
                counter++;
            }
            i++;
        }
        return counter;
    }

    private static int counterDoWhile (int[] numbers, int number){
        int counter = 0;
        int i = 0;
        do{
            if(number == numbers[i]){
                counter++;
            }
            i++;
        } while (i<numbers.length);
        return counter;
    }

    private static int numIdenticalPairs(int[] nums){
        int counter = 0;
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j< nums.length; j++){
                if(nums[i] == nums[j]){
                    counter++;
                }
            }
        }
        return counter;
    }
}
