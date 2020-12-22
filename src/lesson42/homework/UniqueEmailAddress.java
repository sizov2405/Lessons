package lesson42.homework;

import java.util.HashSet;
import java.util.Set;

public class UniqueEmailAddress {
//m.y+special@email.com
    //"tom@e+gmail.com"
    //tom@e
    //@e+gmail.com
    public static int numUniqueEmails(String[] emails) {
        Set <String> uniqueEmails = new HashSet<>();

        for(String email : emails) {
            if(email.isEmpty()){
                continue;
            }

            String formattedEmail = email.substring(0, email.indexOf("@"));

            if(formattedEmail.contains("+")){
                formattedEmail = email.substring(0, email.indexOf("+"));
            }

            formattedEmail = formattedEmail.replace(".", "");

            uniqueEmails.add(formattedEmail + email.substring(email.indexOf("@")));
        }
        for(String uniqueEmail : uniqueEmails) {
            System.out.println(uniqueEmail);
        }

            return uniqueEmails.size();

    }
}
