package lesson48;

public class ModifiedRaceTread extends Thread {

    private static boolean win = false;
    private int track = 0;

    public ModifiedRaceTread(String name) {
        super(name);
    }

    @Override
    public void run() {
        while (!win){
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if(win){
                break;
            }
            track++;
            if(track==1000){
                win = true;
                System.out.println(getName() + " wins");
            }
        }
        System.out.println(getName() + " track: " + track);
    }
}
