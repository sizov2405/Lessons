package lesson9.inClass.incaplusation;

public class Transaction {
    private static final double COMMISSION = 0.05;
    private double price;

    public Transaction(double price){
        this.price = price;
    }

    public double calculateFullPrice(){
        return price + COMMISSION + addTaxes();
    }

    private double addTaxes(){
        return price * 0.1;
    }

}
