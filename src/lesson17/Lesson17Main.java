package lesson17;

import lesson17.abstractTree.*;
import lesson17.figure.Figure;
import lesson17.figure.FigureService;
import lesson17.figure.Rectangle;
import lesson17.figure.Square;
import lesson17.homework17.Animal;
import lesson17.homework17.Bird;
import lesson17.homework17.Owl;

public class Lesson17Main {
    public static void main(String[] args) {

//        AbstractTree appleTree = new AppleTree();
//        AbstractTree cherryTree = new CherryTree();
//        AbstractTree pearTree = new PearTree();
//
//        TreeService.showFruitColor(appleTree);

//        Figure rectangle = new Rectangle(5,6);
//        Figure square = new Square(5);
//
//        FigureService.showFigureArea(square);

        Animal bird = new Bird() {
            @Override
            public void fly() {

            }
        };

        bird.eat();
        Bird owl = new Owl();
        owl.test();
    }
}
