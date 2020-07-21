package lesson9.inClass;

import lesson9.inClass.incaplusation.Transaction;
import lesson9.inClass.polymorphism.CherryTree;
import lesson9.inClass.polymorphism.Tree;

public class Lesson9Main {
    public static void main(String [] args){
        Transaction transaction = new Transaction(1.0);
        double fullPrice = transaction.calculateFullPrice();
//        System.out.println(fullPrice);

        Tree tree = new Tree();
        Tree cherryTree = new CherryTree();
        tree.method();
        cherryTree.method();



    }
}
