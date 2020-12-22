package lesson47.homework;

public class HomeworkMain {
    public static void main(String[] args) {

        RaceThread raceThread = new RaceThread("Bob");
        RaceThread raceThread2 = new RaceThread("Tom");
        RaceThread raceThread3 = new RaceThread("Matt");
        RaceThread raceThread4 = new RaceThread("Kyle");
        RaceThread raceThread5 = new RaceThread("Brian");

        raceThread.start();
        raceThread2.start();
        raceThread3.start();
        raceThread4.start();
        raceThread5.start();
    }
}
