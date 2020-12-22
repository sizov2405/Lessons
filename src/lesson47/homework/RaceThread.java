package lesson47.homework;

public class RaceThread extends Thread {

    private int track=0;

    public RaceThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        while (track <100){
            track++;
        }
        System.out.println(getName() + " finished");

    }
}
