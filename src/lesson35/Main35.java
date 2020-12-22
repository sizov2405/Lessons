package lesson35;

import java.util.ArrayList;

public class Main35 {
    public static void main(String[] args) {

//        try{
//            System.out.println( MathHelper.divide(8,1));
//        }catch (InterruptedException ie){
//            System.out.println("Interrupted exception has been catched: " + ie.getMessage() );
//        }catch (Exception e){
//            System.out.println("Exception has been catched: " + e.getMessage() );
//        }
//        finally {
//            System.out.println("Finally");
//        }

//        try {
//            System.out.println(pow(2, 2));
//        } catch (MyException e) {
//            e.printStackTrace();
//            System.out.println("Exception has been catched: " + e.getMessage());
//        }

//        System.out.println(parseInt("678H"));
//
//        int [] mas = new int [5];
//
//        try {
//            mas [6] = 3;
//        } catch (IndexOutOfBoundsException e){
//            System.out.println("Index out of bounds has been catched: " + e.getMessage());
//        }

        ArrayList <Integer> arrayList = new ArrayList<>();

        try {
            arrayList.add(1, 7);
        } catch (IndexOutOfBoundsException e){
            System.out.println("Index out of bounds has been catched: " + e.getMessage());
        }

    }

    public static double pow (double number, double power) throws MyException {
        if (number <= 0){
            throw new MyException("Number should be positive");
        }
        if(power < 0){
            throw new MyException("Power cannot be negative");
        }

        return Math.pow(number, power);
    }

    public static int parseInt (String s){
        int result = 0;
        try {
            result = Integer.parseInt(s);
        } catch (NumberFormatException nfe){
            System.out.println("NumberFormatException has been catched: " + nfe.getMessage());
        } catch (Exception e) {
            System.out.println("Exception has been catched: " + e.getMessage());
        }
        return result;

    }
}
