package lesson9.inClass.polymorphism;

//полиморфизм - это возможность создания и использования методов с одинаковыми именами и
// различными аргументами (параметрами) в одном или многих классах
public class Tree {

    public void method(){
        System.out.println("Parent method invocation");
    }

    public void method(String name){

    }

    public void method(int number){

    }
}
