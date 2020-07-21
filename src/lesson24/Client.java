package lesson24;

public class Client {

    private long id;
    private static long idCounter = 0;

    public Client (){
        idCounter++;
        id = idCounter;
    }

    public long getId() {
        return id;
    }
}
