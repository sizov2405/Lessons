package lesson18;

public interface FirstTestInterface extends ParentInterface{

    //в интерфейсе все поля по умолчанию public static final
    int age = 20;

    //в интерфейсе все методы по умолчанию public abstract
    void print();

    default void world(){
        System.out.println("first interface");
    }

    private void privateMethod(){

    }
}
