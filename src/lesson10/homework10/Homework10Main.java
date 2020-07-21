package lesson10.homework10;

public class Homework10Main {
    public static void main(String [] args){
        //после new это конструктор
        CandyServiceHomework22 candyService = new CandyServiceHomework22();
        Candy badChocolateCandy = new Candy(CandyType.CHOCOLATE, Brand.BADCANDIES);

        Candy gummielandCaramels = new Candy(CandyType.CARAMELS, Brand.GUMMIELAND);
        Candy gummielandGummies = new Candy(CandyType.GUMMIES,Brand.GUMMIELAND);

        candyService.addToStorageChocolate(badChocolateCandy);
        candyService.addToStorage(gummielandCaramels);
        candyService.addToStorage(gummielandGummies);
        candyService.addToStorage(null);
        candyService.addToStorage(null);

        candyService.getStorageInfo();

        candyService.removeCandyFromStorage(1);
        candyService.getStorageInfo();
        candyService.getStorageInfoAboutCandiesByBrand(Brand.GUMMIELAND);

        System.out.println(candyService.getNumberOfCandiesInStorage());

        candyService.resetCandyStorage();

        System.out.println(candyService.getNumberOfNotDefaultCandiesInStorage());

        candyService.getStorageInfo();

    }
}
