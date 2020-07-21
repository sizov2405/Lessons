package social.petLesson.room;

//мы сделали класс не публичным, потому что не хотим, чтобы какой-либо класс вне папки room использовал наш класс.
//Данная информация называется инкапсуляция
class Toy {
    private String typeOfToy;
    private int health = 2;
    private String status = "New";

    Toy(String typeOfToy){
        this.typeOfToy = typeOfToy;
    }

    public String getTypeOfToy() {
        return typeOfToy;
    }

    public void setTypeOfToy(String typeOfToy) {
        this.typeOfToy = typeOfToy;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
