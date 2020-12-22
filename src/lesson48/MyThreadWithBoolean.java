package lesson48;

public class MyThreadWithBoolean extends Thread {

    private boolean off = false;
    private int counter = 0;

    @Override
    public void run() {
        System.out.println("start");
        while (!off){
            System.out.println("here");
            counter++;
        }
        System.out.println("finished: " + counter);
    }

    public void setOff(boolean off) {
        System.out.println("off was switched to true");
        this.off = off;
    }
}
