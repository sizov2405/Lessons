package lesson18;

public interface SecondTestInterface extends ParentInterface {

    default void world(){
        System.out.println("second interface");
    }

}
