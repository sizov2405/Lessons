package lesson8.inClass.model.inheritance;

public class Animal {
    private String color;
    private double size;

    public Animal(String color, double size){
        this.color = color;
        this.size = size;
    }

//    public Animal(){
//
//    }

    public String getColor() {
        return color;
    }

    public double getSize() {
        return size;
    }
}
