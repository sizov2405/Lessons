package lesson49;

public class TestThread1 extends Thread {

    private Resource1 resource1;

    public TestThread1(Resource1 resource1) {
        this.resource1 = resource1;
    }

    public void run(){
        synchronized (resource1) {
            resource1.x = 1;
            for (int i = 1; i < 5; i++) {
                System.out.printf("%s %d \n", Thread.currentThread().getName(), resource1.x);
                resource1.x++;
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                }
            }
        }
    }

}
