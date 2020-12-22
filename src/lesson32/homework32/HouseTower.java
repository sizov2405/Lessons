package lesson32.homework32;

import java.util.HashMap;
import java.util.Map;

public class HouseTower {

        private Map<HouseKey, Family> houseTower = new HashMap<>();

        public void addFamilyToHouse (Family family){
            houseTower.put(family.getHouseKey(), family);
        }

        public void logHouseTowerInfo (){
            System.out.println(houseTower);
        }

        public boolean hasFamilyHouseInTower (HouseKey houseKey){
           return houseTower.containsKey(houseKey);
        }

        public boolean hasFamilyHouseInTower (String familySurname){
            if (familySurname == null){
                return false;
            }
            for(Family family : houseTower.values()){
                if (familySurname.equals(family.getSurname())){
                    return true;
                }
            }
            return false;
    }

    public int quantityFamiliesInHouse (String familySurname){
        int result = 0;
        if (familySurname == null){
            return result;
        }

        for(Family family : houseTower.values()){
            if (familySurname.equals(family.getSurname())){
                result++;
            }
        }

        return result;
    }

    public Family familyById (long familyId){
            for (Family family : houseTower.values()){
                if (familyId == family.getId()){
                    return family;
                }
            }
            return null;
    }

    public Map.Entry<HouseKey, Family> familyAddress (HouseKey houseKey){
        for (Map.Entry<HouseKey, Family> entry : houseTower.entrySet()){
            if (houseKey.equals(entry.getKey())){
                return entry;
            }
        }
        return null;
    }

    public String getFamilySurname (HouseKey houseKey){
            Family family = houseTower.get(houseKey);
            if(family != null){
                return family.getSurname();
            }
            return null;
//            return "Unknown";
    }

}
