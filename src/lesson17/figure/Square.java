package lesson17.figure;

public class Square extends Figure {

    private float side;

    public Square(float side){
        this.side = side;
    }

    @Override
    public float getPerimetr() {
        return side * 4;
    }

    @Override
    public float getArea() {
        return side * side;
    }
}
