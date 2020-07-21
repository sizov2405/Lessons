package lesson9.homework;

public class Cheese extends Product {

    private int cheeseQuality;

    public Cheese (String name, Quality quality){
        super(name, quality);
    }

    public int getCheeseQuality() {
        return cheeseQuality;
    }
@Override
    public String getDefaultDescription (){
        return "Tasty cheese";
    }
}
