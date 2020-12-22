package lesson49;

public class TestThread2 extends Thread {

    private Resource2 resource2;

    public TestThread2(Resource2 resource2) {
        this.resource2 = resource2;
    }

    public void run(){
        resource2.workWithResource();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        resource2.info();
    }
}
