package lesson8.homework;

public class Owner extends User {
    @Override
    public String getSecret() {
        return "Owner's secret";
    }
}
