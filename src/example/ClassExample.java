package example;

import social.Cat;

//модификатор доступа   ключевое слово Java - class    имя класса
public class ClassExample {
    //поля - совокупность значений всех полей является состоянием объекта
    //модификатор доступа   тип переменной   имя переменной(поле)
    public String name;
    private int age;
    //классы, поля и методы без модификатора доступа (нет public, private, protected) - означают, что они обозначены
    // модификатором доступа по умолчанию default(package private)
    boolean haveAJob;
    //у полей могут быть значения, заданные нами по умолчению
    protected int number = 4;

    //методы - это поведение объектов
    //модификатор доступа   возвращаемый тип   имя метода
    // в скобках находятся параметры метода, которые необходимы методу для работы: тип параметра   имя параметра
    public int getSalary(int time){
        //методам могут понадобиться локальные переменные, которые необходимы ему для работы, но получаются не из вне
        // как параметры, а после локальных операций (в данном случае параметр * 5). Локальные переменные работают только
        // в пределах метода. По окончанию метода локальные переменные исчезают
        //тип локальной переменной
        int salary = time * 5;
        //ключевое слово Java - return (для возвращения результата работы метода)   результат, который возвращаем
        //результат должен быть такого же типа, как было объявлено в начале метода (в данном случае на 20 строке int)
        return salary;
    }
    //модификатор доступа   возвращаемый тип   имя метода (тип параметра   имя параметра)
    //void означает, что метод возвращает ничего и ключевое слово Java - return не обязательно, но использовать return
    //можно: пример будет в методе returnPractice
    //имя параметра может повторять имя полей (но не локальных переменных)
    //сеттеры - это такие методы, с помощью которых мы можем заполнять данными наши поля
    //в данном случае на строке 36 находится параметр age, с помощью которого мы заполняем данными поле age
    public void setAge (int age){
        //ключевое слово Java - this означает, что у данного объекта берется поле
        //этот_объект.имя_поля = имя_параметра
        this.age = age;
    }

    //иногда return используют как своеобразный выход ("break") из логической конструкции в методе с возвращаемым типом void.
    //как только мы дойдем в методе до ключего слово return, мы сразу же выйдем из метода
    public void returnPractice(){
        if(number == 3){
            age = 20;
            return;
        }
        if(number == 2){
            age = 18;
            return;
        }
        age = 30;
    }


    //представим, что это главный метод main
    //это может быть не обязательно главный метод, но и другие
    public void main (){
        //запись ниже означает создание нового объекта типа Cat и присваевание его значение к переменной variableName.
        // Данная переменная должна быть такого же типа, как и создаваемый объект
        //тип переменной    имя переменной   присваевание (=)   создание нового объекта
        Cat variableName = new Cat();
        //присваивание результата метода переменной. Метод не должен быть с возвращаемым типом void
        int result = variableName.getAge();
    }




}
