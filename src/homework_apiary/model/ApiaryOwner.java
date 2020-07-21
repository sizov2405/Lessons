package homework_apiary.model;

public class ApiaryOwner {
    private Apiary apiary;
    private String soundsInTheYard;

    public ApiaryOwner() {
        Bee bee = new Bee();
        this.apiary = new Apiary(bee);
        this.soundsInTheYard = apiary.getSoundsInTheApiary();
    }

    public String getSoundsInTheYard() {
        return soundsInTheYard;
    }
}
