package lesson49.homework;

public class Main49Homework {

    public static void main(String[] args) {

        Racer racer = new Racer("Adam");
        Referee referee = new Referee(racer);

        racer.start();
        referee.start();

    }
}
