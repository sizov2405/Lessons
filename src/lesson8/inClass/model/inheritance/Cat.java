package lesson8.inClass.model.inheritance;


//класс может расширять только один класс. Множественное наследование невозможно в Java
public class Cat extends Animal{

    //переопределение родительского конструктора
    //ключевое слово super отвечает за вызов работы родительского конструктора
    public Cat(String color, double size){
        super(color, size);
        System.out.println();
    }



}
