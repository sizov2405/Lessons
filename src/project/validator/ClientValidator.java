package project.validator;

import project.error.ValidationException;
import project.model.CreditCard;

public class ClientValidator {

    public static void validateClientAge (int age) throws ValidationException {
        if (age <= 0){
            throw new ValidationException("Age should be positive");
        }
    }

    public static void validateClientsName (String name) throws ValidationException{
//        String regx = "[^0-9]";
//        Pattern pattern = Pattern.compile(regx,Pattern.CASE_INSENSITIVE);
//        Matcher matcher = pattern.matcher(name);
        if(!name.matches("[a-zA-Z]+")){
            throw new ValidationException("Name shouldn't have numbers");
        }
//        if(!matcher.find()){
//            throw new ValidationException("Name shouldn't have numbers");
//        }
    }

    public static void validateClientsCreditCard(CreditCard creditCard) throws ValidationException {
        if(creditCard == null) {
            throw new ValidationException("Credit card doesn't exist");
        }
    }

    public static void validateCvv(String inputCvv, String cvvByCreditCard) throws ValidationException {
        if (inputCvv == null){
            throw new ValidationException("CVV field is mandatory");
        }
        if (!inputCvv.equals(cvvByCreditCard)){
            throw new ValidationException("Incorrect cvv");
        }
    }



}
