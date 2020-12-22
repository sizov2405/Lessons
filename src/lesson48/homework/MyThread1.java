package lesson48.homework;

public class MyThread1 extends Thread {

    private Thread thread;

    public MyThread1(Thread thread) {
        this.thread = thread;
    }

    @Override
    public void run() {
        thread.start();
    }

    public void stopThread2() {
        thread.interrupt();
    }


}
