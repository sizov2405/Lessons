package lesson7.inClass.aquarium;

public class Fish {
    private static int fishIDcounter = 1;
    private int fishID;

    private String name;
    private String color;

    public Fish(String name, String color){
        this.name = name;
        this.color = color;
        fishID = fishIDcounter;
        fishIDcounter++;
    }

    public int getFishID() {
        return fishID;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }
}
