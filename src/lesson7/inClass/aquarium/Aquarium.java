package lesson7.inClass.aquarium;

public class Aquarium {
    private static Fish[] aquarium = new Fish[2];
    private static int numberOfFish = 0;

    public void addToAquarium(Fish fish) {
        if (numberOfFish < aquarium.length) {
            aquarium[numberOfFish] = fish;
            numberOfFish++;
            System.out.println("we have " + numberOfFish + " fish in aquarium");
            return;
        }
        System.out.println("Aquarium is full. We can't place here " + fish.getName());
    }

    public Fish getFishByName(String fishName){
        for(Fish fish : aquarium){
            if(fishName.equals(fish.getName())){
                return fish;
            }
        }
        return new Fish("default name", "default color");
    }
}
