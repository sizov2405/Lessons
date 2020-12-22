package lesson49.homework;

public class Referee extends Thread {

    private Racer racer;

    public Referee(Racer racer) {
        this.racer = racer;
    }
    @Override
    public void run (){
        while ((!racer.isStopped())){
            if(racer.getSpeed() >9){
                racer.setStopped(true);
                System.out.println("Racer " + racer.getRacerName() + " got stopped at speed: " + racer.getSpeed() + " and distance: " + racer.getDistance());
            }
        }
    }

}
