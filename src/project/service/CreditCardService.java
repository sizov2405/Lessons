package project.service;

import project.model.CreditCard;

public interface CreditCardService {
    void addCreditCard (CreditCard creditCard);

    void updateCreditCard(CreditCard creditCard);

    void removeCreditCard(long creditCardId);

    CreditCard getCreditCard(long creditCardId);

    void logCreditCardCache();
}
