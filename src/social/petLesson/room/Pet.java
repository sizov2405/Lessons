package social.petLesson.room;

public class Pet {

    private String type;
    private Toy toy;
    private String  name;
    private int age;
//    private String status = "New";


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Toy getToy() {
        return toy;
    }

    public void setToy(Toy toy) {
        this.toy = toy;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getToyStatus() {
        return toy.getStatus();
    }

//    public void setStatus(String status) {
//        this.status = status;
//    }

    public void play(){
        int currentHealth = toy.getHealth();
        toy.setHealth(--currentHealth);
        if (currentHealth == 1){
            toy.setStatus("Damaged");
        }else if(currentHealth == 0){
            toy.setStatus("Lost");
        }

    }

}
