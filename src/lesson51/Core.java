package lesson51;

public class Core {

    private char symbol;
    private int number = 100;

    public Core(char symbol) {
        this.symbol = symbol;
    }

    public void shoot (int num){
        number -= num;
    }

    @Override
    public String toString() {
        return "Core{" +
                "symbol=" + symbol +
                ", number=" + number +
                '}';
    }
}
