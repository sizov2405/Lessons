package lesson29.homework29.homeworkComparator;

public class SneakForComparator {
    private String name;
    private String size;

    public SneakForComparator(String name, String size){
        this.name = name;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "Sneak{" +
                "name='" + name + '\'' +
                ", size='" + size + '\'' +
                '}';
    }
}
