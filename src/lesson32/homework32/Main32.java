package lesson32.homework32;

public class Main32 {
    public static void main(String[] args) {

        HouseTower houseTower = new HouseTower();

        Family family1 = new Family(new HouseKey(1), "Smith");
        Family family2 = new Family(new HouseKey(2), "Roberts");
        Family family3 = new Family(new HouseKey(3), "Williams");
        Family family4 = new Family( new HouseKey(4),"Wheeler");
        Family family5 = new Family( new HouseKey(5),null);

        houseTower.addFamilyToHouse(family1);
        houseTower.addFamilyToHouse(family2);
        houseTower.addFamilyToHouse(family3);
        houseTower.addFamilyToHouse(family4);
        houseTower.addFamilyToHouse(family5);

        System.out.println(houseTower.hasFamilyHouseInTower(new HouseKey(3)));
        System.out.println(houseTower.hasFamilyHouseInTower((HouseKey) null));
        System.out.println(houseTower.hasFamilyHouseInTower((String) null));
        System.out.println(houseTower.hasFamilyHouseInTower("Smith"));

        houseTower.logHouseTowerInfo();
        houseTower.familyById(2);

    }
}
