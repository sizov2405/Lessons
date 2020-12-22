package lesson47;

public class Main47 {
    public static void main(String[] args) {

        MyThread myThread = new MyThread();
//        myThread.run();
        myThread.start();
        System.out.println(myThread.getName());

        MyThread myThread2 = new MyThread();
        myThread2.start();
        System.out.println(myThread2.getName());

//        Thread thread = Thread.currentThread();
//        System.out.println(thread.getName());
//        thread.setName("Bob");
//        System.out.println(thread.getName());



    }
}
