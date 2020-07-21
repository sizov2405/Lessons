package lesson18;

import lesson18.homework18.MagicEnemy;
import lesson18.homework18.MagicPlayer;
import lesson18.homework18.Movements;
import lesson18.salesforce.Child;
import lesson18.salesforce.Parent;

import java.util.List;

public class Lesson18Main {

    public static void main(String[] args) {

//        Parent parent = new Parent();
//        parent.addToChildren(new Child(1));
//        parent.addToChildren(new Child(2));
//        parent.addToChildren(new Child(3));
//        parent.addToChildren(new Child(4));

//        Child1 child1 = new Child1();
//        Child1 child2 = new Child1();
//
//        child1.addToParentAmount();
//        child2.addToParentAmount();

//        System.out.println(parent.getTotalAmount());

//        TestClass testClass = new TestClass();
//        testClass.print();
//        testClass.world();

//        Parent parent = new Parent();
//        Child child1 = new Child(1);
//        Child child2 = new Child(2);
//        Child child3 = new Child(3);
//
//        parent.addChild(child1);
//        parent.addChild(child2);
//        parent.addChild(child3);
//
//        System.out.println(parent.getSum());

        Movements movements = new MagicEnemy();
//        ((MagicPlayer) movements).castFireMagic();
        movements.move();


    }
}
