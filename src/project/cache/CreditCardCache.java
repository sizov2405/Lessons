package project.cache;

import project.model.CreditCard;

import java.util.HashMap;
import java.util.Map;

public class CreditCardCache {

    private Map<Long, CreditCard> creditCardCache = new HashMap<>();

    public void addCreditCard (CreditCard creditCard){
        creditCardCache.put(creditCard.getCreditCardId(), creditCard);
    }

    public void removeCreditCardById (long creditCardId){
        creditCardCache.remove(creditCardId);
    }

    public CreditCard getCreditCardById (long creditCardId){
        return creditCardCache.get(creditCardId);
    }

    public void logCreditCardCache(){
        System.out.println("*******\nCREDIT CARDS\n\n" + creditCardCache + "\n*******");
    }
}
