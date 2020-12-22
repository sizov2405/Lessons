package project.service;

import project.model.CreditCard;
import project.cache.CreditCardCache;

public class CreditCardServiceImpl implements CreditCardService {

    private CreditCardCache creditCardCache = new CreditCardCache();

    @Override
    public void addCreditCard(CreditCard creditCard){
        creditCardCache.addCreditCard(creditCard);
    }

    @Override
    public void updateCreditCard(CreditCard creditCard){
        creditCardCache.addCreditCard(creditCard);
    }

    @Override
    public void removeCreditCard(long creditCardId){
        creditCardCache.removeCreditCardById(creditCardId);
    }

    @Override
    public CreditCard getCreditCard(long creditCardId){
        return creditCardCache.getCreditCardById(creditCardId);
    }

    @Override
    public void logCreditCardCache(){
        creditCardCache.logCreditCardCache();
    }
}
