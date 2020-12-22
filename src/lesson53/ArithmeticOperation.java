package lesson53;

@FunctionalInterface
public interface ArithmeticOperation {

    int a = 10;

    //only 1 abstract method
    int calculate (int a, int b);

    default void print (){
        System.out.println(a);
    }

}
