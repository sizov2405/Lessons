package lesson48.homework;

public class MainHomework48 {
    public static void main(String[] args) throws InterruptedException {

        MyThread2 mythread2 = new MyThread2();
        MyThread1 mythread1 = new MyThread1(mythread2);
        mythread1.start();
        MyThread1.sleep(1000);
        mythread1.stopThread2();
    }
}
