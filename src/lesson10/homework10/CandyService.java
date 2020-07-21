package lesson10.homework10;

import java.io.LineNumberInputStream;
import java.util.ArrayList;
import java.util.List;

public class CandyService {
    private Candy[] candyStorage = new Candy[20];


//    public CandyService(Candy [] candys){
//
//    }
//
//    public CandyService(){
//
//    }

    public void addToStorage(Candy[] candies) {
        for (Candy candy : candies) {
            if (candy != null) {
                addToStorage(candy);
            }
        }
    }

    public void addToStorage(Candy candy) {
        if (isCandyNull(candy)) {
            return;
        }

        System.out.println("Trying to place to storage a candy: " + candy);

        for (int i = 0; i < candyStorage.length; i++) {
            if (candyStorage[i] == null) {
                candyStorage[i] = candy;
                return;
            }
        }
    }

    public void addGoodCandiesToStorage(Candy candy) {
        if (isCandyNull(candy)) {
            return;
        }
        for (int i = 0; i < candyStorage.length; i++) {
            if (candyStorage[i] == null || candyStorage[i].getBrand() == Brand.BADCANDIES) {
                candyStorage[i] = candy;
                return;
            }
        }
    }

    public void addToStorageChocolate(Candy candy) {
        if (isCandyNull(candy)) {
            return;
        }

        System.out.println("Trying to place to storage a chocolate candy: " + candy);

        if (candy.getType() == CandyType.CHOCOLATE) {
            addToStorage(candy);
            return;
        }

        System.out.println("Can't add a candy because it is not chocolate");

//        System.out.println("Trying to place to storage a chocolate candy: " + candy);
//        for(int i = 0; i < candyStorage.length; i++){
//            if(candyStorage[i] == null &&  candy.getType() == CandyType.CHOCOLATE){
//                candyStorage[i] = candy;
//                return;
//            }
//        }
    }

    private boolean isCandyNull(Candy candy) {
        if (candy == null) {
            System.out.println("Candy cannot be null");
            return true;
        }
        return false;
    }

    public void addToStorageNotChocolateNotCaramel(Candy candy) {
        if (isCandyNull(candy)) {
            return;
        }

        if (candy.getType() != CandyType.CHOCOLATE && candy.getType() != CandyType.CARAMELS) {
            addToStorage(candy);
        }
    }

    public void addToStorageNotBadCandies(Candy candy) {
        if (!isCandyNull(candy) && candy.getBrand() != Brand.BADCANDIES) {
            addToStorage(candy);
        }
    }

    public void addToStorageBadCandies(Candy candy) {
        if (!isCandyNull(candy) && candy.getBrand() != Brand.BADCANDIES) {
            addGoodCandiesToStorage(candy);
        }
    }

    public void removeCandyFromStorage(long candyId) {
        for (int i = 0; i < candyStorage.length; i++) {
            if (candyStorage[i] != null && candyStorage[i].getCandyId() == candyId) {
                candyStorage[i] = null;
            }
        }
    }

    public void removeAllCandiesFromStorage() {
        for (int i = 0; i < candyStorage.length; i++) {
            if (candyStorage[i] != null) {
                candyStorage[i] = null;
            }
        }
    }

    public void removeAllBadCandiesFromStorage() {
        for (int i = 0; i < candyStorage.length; i++) {
            if (candyStorage[i] != null && candyStorage[i].getBrand() == Brand.BADCANDIES) {
                candyStorage[i] = null;
            }
        }
    }


    public void badWayToGetStorageInfo() {
        //тип массива   переменная   :   массив или коллекция
        //for each достает из массива (коллекции) один элемент (то что слева). Тип элемента должен быть такой же как и у массива
        //так происходит для всех элементов массива (for each). Другими словами, это цикл for, который бежит от нулевого элемента
        //до последнего с шагом 1
        //код ниже будет выдавать ошибку, если в массиве могут быть null элементы (отсутствие элементов)
        //чтобы он работал нужно сделать проверку, что элемент действительно есть (см getStorageInfo)

        for (Candy candy : candyStorage) {
            System.out.println(candy.getType() + " candy from brand " + candy.getBrand());
        }
    }

    public void getStorageInfo() {

        System.out.println("===============================");
        System.out.println("Storage info: ");

        for (Candy candy : candyStorage) {
            if (candy != null) {
                System.out.println(candy.getType() + " candy with ID " + candy.getCandyId() + " from brand " + candy.getBrand());
            }
        }

        System.out.println("===============================");
    }

    public void removeAllCandiesFromStorageByBrand(Brand brand) {
        for (int i = 0; i < candyStorage.length; i++) {
            if (candyStorage[i] != null && candyStorage[i].getBrand() == brand) {
                candyStorage[i] = null;
            }
        }
    }

    public Candy getCandyById(long candyId) {
        for (int i = 0; i < candyStorage.length; i++) {
            if (candyStorage[i] != null && candyStorage[i].getCandyId() == candyId) {
                return candyStorage[i];
            }
        }
        return null;
    }

    public void getStorageInfoAboutCandiesByBrand(Brand brand) {

        System.out.println("===============================");
        System.out.println("Storage info about candies by brand: ");

        for (int i = 0; i < candyStorage.length; i++) {
            if (candyStorage[i] != null && candyStorage[i].getBrand() == brand) {
                System.out.println("There is a candy from brand " + candyStorage[i].getBrand());
            }
        }

        System.out.println("===============================");
    }

    public void resetCandyStorage() {
        for (int i = 0; i < candyStorage.length; i++) {
            candyStorage[i] = new Candy();
        }
    }

    public int getNumberOfCandiesInStorage (){
        int numberOfCandies = 0;

        for (Candy candy : candyStorage) {
            if (candy != null) {
                numberOfCandies++;
            }
        }
        return numberOfCandies;
    }

    public int getNumberOfNotDefaultCandiesInStorage (){
        int numberOfCandies = 0;

        for (Candy candy : candyStorage){
            if (candy != null && candy.getCandyId() != 0){
                numberOfCandies++;
            }
        }
        return numberOfCandies;
    }


}
