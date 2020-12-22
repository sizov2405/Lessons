package lesson32.homework32;

import lesson32.HouseOwner;

import java.util.Objects;

public class Family {

    private long id;
    private HouseKey houseKey;
    private String surname;
    private static long idCounter = 0;

    public Family(HouseKey houseKey, String surname){
        idCounter++;
        this.id = idCounter;
        this.houseKey = houseKey;
        this.surname = surname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Family family = (Family) o;
        return id == family.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public String getSurname() {
        return surname;
    }

    public HouseKey getHouseKey() {
        return houseKey;
    }

    public long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Family{" +
                "id=" + id +
                ", houseKey=" + houseKey +
                ", surname='" + surname + '\'' +
                '}';
    }
}
