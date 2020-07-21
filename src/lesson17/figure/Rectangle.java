package lesson17.figure;

public class Rectangle extends Figure {

    private float width;
    private float height;

    public Rectangle(float width, float height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public float getPerimetr() {
        return width * 2 + height * 2;
    }

    @Override
    public float getArea() {
        return width * height;
    }
}
