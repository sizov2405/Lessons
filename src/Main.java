import homework_apiary.model.ApiaryOwner;
import override.*;
//import social.petLesson.room.Pet;
//import social.petLesson.room.PetOwner;

//import social.petLesson.room.Toy;


public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog("Asss");
        BigDog bigDog = new BigDog("dfdf");

        PlayService playService = new PlayService();
        playService.animalPlay(dog);
        playService.animalPlay(dog);
        playService.animalPlay(dog);
        playService.animalPlay(dog);
        playService.animalPlay(dog);
        playService.animalPlay(dog);
        playService.animalPlay(dog);
        playService.animalPlay(bigDog);
        playService.animalPlay(bigDog);
        playService.animalPlay(bigDog);


    }
}


//        Profile ivan = new Profile();
//        ivan.setFirstName("Ivan");
//        ivan.setLastName("Ivanov");
//        ivan.setAge(22);
       // System.out.println(ivan.getFullProfileInfo());

//        ConstruktorClassExample example = new ConstruktorClassExample(4,7);
//        System.out.println(example.getA()  + " " + example.getB());



//    }
//}


//        int[] mas1 = {1, -10, 5};
//        int[] mas2 = {2, 4, 15};
//        int[] mas3 = {0, -1, -2};
//        int[][] allMas = {mas1, mas2, mas3};
//
//        Cat sam = new Cat();
//        sam.setAge(1);
//        sam.setName("Sam");
//
//        Cat bob = new Cat();
//        bob.setAge(2);
//        bob.setName("Bob");
//
//        Cat[] mas = {sam, bob};
//        forEachPractice(mas);
//
//        sam.goodMorning();
//        sam.feed();
//        sam.goodMorning();
//
//
////        incrementAndDecrementPractice();
////        classCat();
////        sumMas(allMas);
////        bubbleSortMas(allMas);
////        max(allMas);
////        vititToVet();
//    }
//
//    public static void forEachPractice(Cat[] cats) {
//        for (Cat cat : cats) {
//            System.out.println("Cat's name is " + cat.getName() + " and age is " + cat.getAge());
//        }
//    }
//
//
//    public static void classAndMethodPractice() {
//        Dog dog = new Dog();
//        String dogName = dog.getName();
//        System.out.println(dogName);
//
//        System.out.println(dog.getName());
//
//        dog.color = "Red";
//        System.out.println(dog.color);
//        int dogAge;
//        dogAge = dog.getAge();
//        System.out.println(dogAge);
//        dog.setAge(4);
//        dogAge = dog.getAge();
//        System.out.println(dogAge);
//    }
//}

//    public static void classCat() {
//        Cat cat = new Cat();
//        String catName = cat.getName();
//        System.out.println(catName);
//        int catAge = cat.getAge();
//        System.out.println(catAge);
//        String catColor = cat.getColor();
//        System.out.println(catColor);
//    }
//    public static void vititToVet(){
//        Cat kitty = new Cat();
//        kitty.goingToTheVet();
//        kitty.goingToTheVet();
//        kitty.goingToTheVet();
//        kitty.goingToTheVet();
//
//    }

//    public static void incrementAndDecrementPractice() {
//        int x = 4;
//        int y = 5;
//        int z = 2;
//        int result1 = (x++ + ++y) % z + (x-- - --y) % z;  // (4 + 6)%2 + (5 - 5)%2 = 0 + 0 = 0
//        int result2 = x + y++ * (z - y);                 // 4 + 5 * (2 - 6) = 4 - 20 = -16
//        System.out.println("Result1 = " + result1); //0
//        System.out.println("Result2 = " + result2); //-16
//    }
//
//    public static void sumMas(int[][] sumM) {
//        System.out.println("Получить сумму всех элементов всех трех массивов");
//        int result = 0;
//        for (int[] entry : sumM) {
//            for (int number : entry) {
//                result += number; //result = result + number
//            }
//        }
//        System.out.println(result);
//    }
//
//    public static void max(int[][] allMaxMassiv) {
//        System.out.println("Найти максимальное значение во всех трех массивах");
//        int max = Integer.MIN_VALUE;
//        for (int[] entry : allMaxMassiv) {
//            int masMax = entry[0];
//            for (int number : entry) {
//                if (number > masMax) {
//                    masMax = number;
//                }
//            }
//            if (masMax > max) {
//                max = masMax;
//            }
//        }
//        System.out.println(max);
//    }
//
//        public static void bubbleSortMas ( int[][] allMassivs){
//            System.out.println("Найти минимальное значение во всех трех массивах");
//            for (int[] entry : allMassivs) {
//                for (int i = entry.length - 1; i > 0; i--) {
//                    for (int j = 0; j < i; j++) {
//                        if (entry[j] > entry[j + 1]) {
//                            int temp = entry[j];
//                            entry[j] = entry[j + 1];
//                            entry[j + 1] = temp;
//                        }
//                    }
//                }
//                System.out.println(entry[0]);
//            }
//        }
//    }

