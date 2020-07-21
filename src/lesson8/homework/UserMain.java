package lesson8.homework;

public class UserMain {
    public static void main(String[] args) {
        User admin = new Admin();
        User regularUser = new RegularUser();
        User owner = new Owner();

        System.out.println(admin.getSecret());
        System.out.println(regularUser.getSecret());
        //ошибка, код должен был вернуть "You don't have permissions", а вернул секрет владельца
        System.out.println(owner.getSecret());

    }
}
