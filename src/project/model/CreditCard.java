package project.model;

import java.util.Objects;

public class CreditCard {

    private long creditCardId;
    private static long counterId;
    private double balance;
    private String cvv;

    public CreditCard(double balance) {
        counterId++;
        this.creditCardId = counterId;
        this.balance = balance;
        this.cvv = generateCVV();
    }

    private String generateCVV() {
        //R(b-a+1)+a       [a;b]

        int firstNumber = generateNumber();
        int secondNumber = generateNumber();
        int thirdNumber = generateNumber();
        return String.format("%s%s%s",firstNumber, secondNumber, thirdNumber);
    }

    private int generateNumber(){
        return (int) (Math.random()*(10));
    }

    public long getCreditCardId() {
        return creditCardId;
    }

    public double getBalance() {
        return balance;
    }

    public String getCvv() {
        return cvv;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CreditCard that = (CreditCard) o;
        return creditCardId == that.creditCardId &&
                Double.compare(that.balance, balance) == 0 &&
                Objects.equals(cvv, that.cvv);
    }

    @Override
    public int hashCode() {
        return Objects.hash(creditCardId, balance, cvv);
    }

    @Override
    public String toString() {
        return "CreditCard{" +
                "creditCardId=" + creditCardId +
                ", balance=" + balance +
                ", cvv='" + cvv + '\'' +
                '}';
    }
}
