package lesson48.homework;

public class MyThread2 extends Thread {

    @Override
    public void run() {
        System.out.println("start");
        while (!isInterrupted()){
            System.out.println("here");
        }
        System.out.println("finished");
    }
}
