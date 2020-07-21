package lesson7.inClass;

public class StaticExample {
    //статический массив и переменная
    // в отличае от обычных полей их можно использовать без создания объектов классов

    private static int [] numbers = new int [2];
    private static int counter;

    //это статический блок
    //он вызывается раньше, чем конструктор
    static {
        System.out.println("static block");
    }

    public StaticExample(){
        System.out.println("Constructor");
    }

    //статический метод тоже можно использовать без создания объектов классов
    // чаще всего используют когда метод не меняет внутреннее состояние
    // пример: convert(), sum(int x, int y)
    public static void staticMethod(){
        System.out.println("Static Method");
    }


}
