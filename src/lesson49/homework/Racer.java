package lesson49.homework;

public class Racer extends Thread {

    private int speed;
    private int distance = 0;
    private boolean isStopped = false;
    private String name;

    public Racer(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100 && !isStopped(); i++) {
            speed = randomSpeed();
            setDistance(i);
            System.out.println("Current speed: " + speed);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
            }
        }
        if(!isStopped) {
            System.out.println("Racer " + name + " finished");
        }
    }

    public synchronized boolean isStopped(){
        return isStopped;
    }

    private int randomSpeed(){
        return (int) (Math.random() * (11));
    }

    public int getSpeed() {
        return speed;
    }

    public synchronized void setStopped(boolean stopped){
        isStopped = stopped;
    }

    public synchronized int getDistance(){
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public String getRacerName() {
        return name;
    }
}
