package lesson10.homework10;

import java.util.ArrayList;
import java.util.List;

public class CandyServiceHomework22 {

           private List<Candy> candyStorage = new ArrayList<>();

        public void addToStorage(Candy candy) {
            if (isCandyNull(candy)) {
                return;
            }

            System.out.println("Trying to place to storage a candy: " + candy);

                    candyStorage.add(candy);
        }

        public void addGoodCandiesToStorage(Candy candy) {
            if (isCandyNull(candy)) {
                return;
            }
                if (candy.getBrand() != Brand.BADCANDIES) {
                    addToStorage(candy);
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
        }

            private boolean isCandyNull(Candy candy) {
                if (candy == null) {
                    System.out.println("Candy cannot be null");
                    return true;
                }
                return false;
            }

            public void removeCandyFromStorage(long candyId) {
              candyStorage.remove(getCandyById(candyId));
            }

            private Candy getCandyById (long candyId){
                for (Candy candy : candyStorage) {
                    if (candy.getCandyId() == candyId) {
                        return candy;
                    }
                }
                return null;
            }

            public void getStorageInfo() {

                System.out.println("===============================");
                System.out.println("Storage info: ");

                for (Candy candy : candyStorage) {
                        System.out.println(candy.getType() + " candy with ID " + candy.getCandyId() + " from brand " + candy.getBrand());
                }

                System.out.println("===============================");
            }

            public void getStorageInfoAboutCandiesByBrand(Brand brand) {

                System.out.println("===============================");
                System.out.println("Storage info about candies by brand: ");

                for (Candy candy : candyStorage) {
                    if (candy.getBrand() == brand) {
                        System.out.println("There is a candy from brand " + candy.getBrand());
                    }
                }

                System.out.println("===============================");
            }

            public void resetCandyStorage() {
                for (int i = 0; i < candyStorage.size(); i++) {
                    candyStorage.set(i,new Candy());
                }
            }

            public int getNumberOfCandiesInStorage () {
                return candyStorage.size();
            }

            public int getNumberOfNotDefaultCandiesInStorage (){
                int numberOfCandies = 0;

                for (Candy candy : candyStorage){
                    if (candy.getCandyId() != 0){
                        numberOfCandies++;
                    }
                }
                return numberOfCandies;
            }

    }
