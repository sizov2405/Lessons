package example;

//для использования создать переменную в классе ProductMain
public class ConstruktorClassExample {
    //for example
    private int a;
    private int b;

    //конструктор очень похож на спец метод
    //имеет модификаторы доступа, ничего не возвращает и обязательно имеет точно такое же имя как и у класса
    //вызывается при создании класса
    //если не создать вообще конструктор в классе (и только в этом случае), то Java сделает конструктор по умолчанию.
    //Ниже показан конструктор по умолчанию. Если это единственный конструктор в классе, то его можно не писать, Java напишет его за нас
    //если создать какой-л конструктор в классе, то Java не будет писать  конструктор по умолчанию
    public ConstruktorClassExample(){
    }

    //конструктор часто используют как метод присваевания значений полям класса (так как конструктор вызывается при создании класса)
    public ConstruktorClassExample(int a, int b){
        System.out.println("bye");
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
}
