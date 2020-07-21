package lesson10.inClass.service;

import lesson10.inClass.model.Food;

public class FoodService {

    private Food [] foodStorage = new Food [10];

    //    storage  |food|food|food|null|null|...
    //в массиве могут лежать элементы с типом, с которым массив был объявлен или null, вместо null
    // можно положить элементы с типом, с которым массив был объявлен
    public void addToStorage(Food food){
        for(int i = 0; i<foodStorage.length; i++){
            if (foodStorage[i] == null){
               foodStorage[i] = food;
               return;
            }
        }
        System.out.println("not enough space");
    }
}
