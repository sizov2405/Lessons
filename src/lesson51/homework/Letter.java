package lesson51.homework;

import java.util.Objects;

public class Letter {

    private char symbol;
    private int number = 100;
    public static boolean won = false;

    public Letter(char symbol) {
        this.symbol = symbol;
    }

    public void shoot (int num){
        number -= num;
        if(number == 0){
            won = true;
            System.out.println("The letter " + symbol + " has won");
        }
    }

    @Override
    public String toString() {
        return "Alphabet{" +
                "symbol=" + symbol +
                ", number=" + number +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Letter letter = (Letter) o;
        return symbol == letter.symbol &&
                number == letter.number;
    }

    @Override
    public int hashCode() {
        return Objects.hash(symbol, number);
    }
}
