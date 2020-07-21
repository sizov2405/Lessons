package lesson20.homework20;

import java.util.ArrayList;
import java.util.List;

public class Shop {

    private double shopBalance;
    private ShopDay shopDay;
    private List<Item> list = new ArrayList<>();

    public Shop (double shopBalance){
        this.shopBalance = shopBalance;
    }

    public void addToList(Item item) {
        if (shopDay == ShopDay.WEEKEND) {
            double itemCost = item.getCost();
            if(!isEnoughShopBalance(itemCost)){
                System.out.println("The shop doesn't have money");
                return;
            }
            double newPrice = getPrice(itemCost);
//            Item newItem = new Item(item.getName(), newPrice);
//            list.add(newItem);
            item.setCost(newPrice);
            list.add(item);
            return;
        }

        System.out.println("We get items only on weekends");
    }

    private boolean isEnoughShopBalance (double itemCost){
        return itemCost < shopBalance;
    }

    private double getPrice (double itemCost){
//
//        return itemCost <= 0
//                ? 1.0
//                : itemCost * 1.1;

        if(itemCost <= 0){
            return 1.0;
        }
        shopBalance -= itemCost;
        return itemCost * 1.1;
    }

    public Item getItemByName(String name) {
        if (name == null) {
            System.out.println("Name cannot be null");
            return null;
        }
        if (shopDay == ShopDay.WEEKEND) {
            System.out.println("Closed");
            return null;
        }
        for (int i = 0; i < list.size(); i++) {
            Item item = list.get(i);
            if (!name.equals(item.getName())) {
                continue;
            }
            discount(item);
            shopBalance += item.getCost();
            return list.remove(i);
        }

        return null;
    }

    private void discount (Item item){
        if (shopDay == ShopDay.DISCOUNT) {
            double newPrice = item.getCost() / 2;
            item.setCost(newPrice);
        }
    }

    public void getListInfo (){
        System.out.println("***********");
        for(Item  item : list){
            System.out.println(item);
        }
        System.out.println("***************");
    }

    public double getShopBalance() {
        return shopBalance;
    }

    public ShopDay getShopDay() {
        return shopDay;
    }

    public List<Item> getList() {
        return list;
    }

    public void setShopBalance(double shopBalance) {
        this.shopBalance = shopBalance;
    }

    public void setShopDay(ShopDay shopDay) {
        this.shopDay = shopDay;
    }

    public void setList(List<Item> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "shopBalance=" + shopBalance +
                ", shopDay=" + shopDay +
                ", list=" + list +
                '}';
    }
}
