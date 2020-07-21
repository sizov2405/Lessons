package lesson19;

import java.util.Objects;

public class TestObjectClass {

    private int a;
    private String b;

    public TestObjectClass(int a, String b){
        this.a = a;
        this.b = b;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TestObjectClass that = (TestObjectClass) o;
        return a == that.a &&
                Objects.equals(b, that.b);
    }

//    @Override
//    public int hashCode() {
//        return Objects.hash(a, b);
//    }

    @Override
    public String toString() {
        return "TestObjectClass{" +
                "a=" + a +
                ", b='" + b + '\'' +
                '}';
    }
}
