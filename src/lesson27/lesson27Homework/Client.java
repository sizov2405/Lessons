package lesson27.lesson27Homework;

public class Client {

    private int id;
    private static int idCounter = 0;
//    private String name;

    public Client (){
        idCounter++;
       this.id = idCounter;
//        this.id = id;
    }

//    public Client(String name) {
//        this.name = name;
//    }
//
//    public Client a (Client client){
//        this.name = client.getName();
//        return this;
//    }
//
//    public String getName() {
//        return name;
//    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                '}';
    }
}
