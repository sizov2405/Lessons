package lesson48;

public class MyThreadWithInteraption extends Thread {

    @Override
    public void run() {
        System.out.println("start");
        try {
            for(int i=0; i< 100; i++){
                if(i==50){
                    System.out.println("index: " + i);
                    throw new InterruptedException();
                }
            }
        }catch (InterruptedException e){
            System.out.println("here");
        }
        System.out.println("finished");
    }
}
