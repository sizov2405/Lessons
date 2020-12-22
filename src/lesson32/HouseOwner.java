package lesson32;

import java.util.Objects;

public class HouseOwner {
    private int id;
    private String name;
    private int hash;

    public HouseOwner(int id, String name, int hash){
        this.id = id;
        this.name = name;
        this.hash = hash;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HouseOwner that = (HouseOwner) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return hash;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "HouseOwner{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
