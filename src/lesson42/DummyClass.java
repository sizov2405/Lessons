package lesson42;

import java.util.Objects;

public class DummyClass implements Cloneable {

    private String name;

    public DummyClass (String name){
        this.name = name;
    }

    public DummyClass (DummyClass dummyClass){
        this(dummyClass.getName());
    }

    public String getName() {
        return name;
    }

    @Override
    protected DummyClass clone() throws CloneNotSupportedException {
        return (DummyClass) super.clone();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DummyClass that = (DummyClass) o;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return 2020;
    }

    @Override
    public String toString() {
        return "DummyClass{" +
                "name='" + name + '\'' +
                '}';
    }
}
