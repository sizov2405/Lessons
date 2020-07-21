package lesson10.homework10;

public class Candy {

    private long candyId;
    private CandyType type;
    private Brand brand;

    private static long candyIdCounter = 0;

    public Candy (CandyType type, Brand brand){
        this.type = type;
        this.brand = brand;
        candyIdCounter++;
        candyId = candyIdCounter;
    }

    public Candy (){
    }

    public long getCandyId() {
        return candyId;
    }

    public CandyType getType() {
        return type;
    }

    public Brand getBrand() {
        return brand;
    }

    @Override
    public String toString() {
        return "Candy{" +
                "candyId=" + candyId +
                ", type=" + type +
                ", brand=" + brand +
                '}';
    }
}
