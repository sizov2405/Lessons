package lesson20;

public class Kitchen {

    private double size;

    public Kitchen(double size) {
        this.size = size;
    }

    public double getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "Kitchen{" +
                "size=" + size +
                '}';
    }
}
