package lesson9.homework;

public class Apple extends Product {

    private int appleQuality;

    public Apple (String name, Quality quality){
      super(name, quality);
    }

    public int getAppleQuality() {
        return appleQuality;
    }
@Override
    public String getDefaultDescription (){
        return "Juicy apple";
    }
}
