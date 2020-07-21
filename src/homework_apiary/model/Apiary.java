package homework_apiary.model;

class Apiary {
    private Bee bee;
    private String soundsInTheApiary;

    public Apiary(Bee bee){
        this.bee = bee;
        this.soundsInTheApiary = bee.getSound();
    }

    public String getSoundsInTheApiary() {
        return soundsInTheApiary;
    }
}
