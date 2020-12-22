package lesson32.homework32;

import java.util.Objects;

public class HouseKey {

    private int id;

    public HouseKey(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HouseKey houseKey = (HouseKey) o;
        return id == houseKey.id;
    }

    @Override
    public String toString() {
        return "HouseKey{" +
                "id=" + id +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
