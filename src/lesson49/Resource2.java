package lesson49;

public class Resource2 {

    private int x;

    public synchronized void workWithResource (){
        x = 1;
        for (int i = 1; i < 5; i++) {
            System.out.printf("%s %d \n", Thread.currentThread().getName(), x);
            x++;
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
            }
        }
    }

    public void info (){
        System.out.printf("%s info \n", Thread.currentThread().getName());
    }

}
