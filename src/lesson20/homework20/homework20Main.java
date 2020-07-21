package lesson20.homework20;

import java.util.ArrayList;
import java.util.List;

public class homework20Main {
    public static void main(String[] args) {
/*
        Shop shop = new Shop(100);
        shop.setShopDay(ShopDay.WEEKEND);

        //WEEKEND
        shop.addToList(new Item("Cherry", 5));
        shop.addToList(new Item("Peach", 3));
        shop.addToList(new Item("Apple", -2));
        shop.addToList(new Item("Watermelon", 200));

        shop.getListInfo();
        System.out.println(shop.getItemByName("Cherry"));
        System.out.println("Shop balance: " + shop.getShopBalance());

        //WEEK DAYS
        shop.setShopDay(ShopDay.NORMAL);
        System.out.println(shop.getItemByName("Cherry"));
        shop.getListInfo();
        System.out.println("Shop balance: " + shop.getShopBalance());

        //DISCOUNT DAY
        shop.setShopDay(ShopDay.DISCOUNT);
        System.out.println(shop.getItemByName("Peach"));
        shop.getListInfo();
        System.out.println("Shop balance: " + shop.getShopBalance());
        */

        //R * (b-a) + a     [a;b)
        System.out.println(Math.random() * (6-4) + 4);

        //(int)(R * (b-a+1) + a)     [a;b]
        System.out.println((int)(Math.random() * (10-5+1) +5));

    }
}
