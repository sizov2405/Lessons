package lesson8.homework;

public class Admin extends User {
    @Override
    public String getSecret(){
        return "Admin secret";
    }
}
