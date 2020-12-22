package lesson51;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Lesson51 {

    private List<String> names = new ArrayList<>();

    public void addNames(String name){
        names.add(name);
    }

    public void deleteNames(int number){
        names.remove(number);
    }

    public String getNames(int number){
        return names.get(number);
    }

    public void updateNames(int number, String name){
        names.set(number, name);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Lesson51 lesson51 = (Lesson51) o;
        return Objects.equals(names, lesson51.names);
    }

    @Override
    public int hashCode() {
        return Objects.hash(names);
    }
}
