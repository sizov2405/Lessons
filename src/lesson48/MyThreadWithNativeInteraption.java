package lesson48;

public class MyThreadWithNativeInteraption extends  Thread {

    private  int counter = 0;

    @Override
    public void run() {
        System.out.println("start");
        while (!isInterrupted()){
            System.out.println("here");
            counter++;
        }
        System.out.println("finished: " + counter);

    }
}
