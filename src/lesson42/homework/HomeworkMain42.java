package lesson42.homework;

public class HomeworkMain42 {

    public static void main(String[] args) {

//        System.out.println(StonesAndJewels.numJewelsInStones("aAc", "DsacbCA"));

        String [] emails = {
                "my.name@gmail.com",
                "tom@e+gmail.com",
                "tom+smith@gmail.com",
                "myname@gmail.com",
                "m.y+name@gmail.com"

        };
        System.out.println(UniqueEmailAddress.numUniqueEmails(emails));
    }
}
