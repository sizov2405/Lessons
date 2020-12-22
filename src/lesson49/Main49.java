package lesson49;

public class Main49 {
    public static void main(String[] args) {

//        Resource1 resource1 = new Resource1();
//
//        TestThread1 testThread1 = new TestThread1(resource1);
//        TestThread1 testThread2 = new TestThread1(resource1);
//        TestThread1 testThread3 = new TestThread1(resource1);
//        TestThread1 testThread4 = new TestThread1(resource1);
//        TestThread1 testThread5 = new TestThread1(resource1);
//
//        testThread1.start();
//        testThread2.start();
//        testThread3.start();
//        testThread4.start();
//        testThread5.start();

        Resource2 resource2 = new Resource2();

        TestThread2 testThread1 = new TestThread2(resource2);
        TestThread2 testThread2 = new TestThread2(resource2);
        TestThread2 testThread3 = new TestThread2(resource2);
        TestThread2 testThread4 = new TestThread2(resource2);
        TestThread2 testThread5 = new TestThread2(resource2);

        testThread1.start();
        testThread2.start();
        testThread3.start();
        testThread4.start();
        testThread5.start();

    }
}
