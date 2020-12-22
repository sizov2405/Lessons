package project;

import project.error.ValidationException;
import project.model.Client;
import project.model.CreditCard;
import project.service.ClientService;
import project.service.ClientServiceImpl;
import project.service.CreditCardService;
import project.service.CreditCardServiceImpl;
import project.validator.ClientValidator;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ScannerService {

    private static ClientService clientService = new ClientServiceImpl();
    private static CreditCardService creditCardService = new CreditCardServiceImpl();

    public static void processCommand(String command, Scanner scanner){
        switch (command){
            case "addClient":
               createClient(scanner);
               break;
            case "log":
                log();
                break;
            case "removeClient":
                removeClient(scanner);
                break;
            case "addCreditCard":
                addCreditCard(scanner);
                break;
            case "getCreditCardBalance":
                getCreditCardBalance(scanner);
                break;
            case "getClientBalance":
                getClientBalance(scanner);
                break;
            case "addBalance":
                addBalance(scanner);
                break;
            default:
                System.out.println("Wrong command");
        }
    }

    private static void getClientBalance(Scanner scanner) {
        System.out.println("Enter client ID:");
        long clientId = scanner.nextLong();
        Client client = clientService.getClient(clientId);
        double clientBalance = 0;
        for(Long creditCardId : client.getCreditCardsIds()){
            CreditCard creditCard = creditCardService.getCreditCard(creditCardId);
            if(creditCard == null){
                System.out.println(String.format("Your credit card %s doesn't match", creditCardId));
                continue;
            }
            clientBalance += creditCard.getBalance();
        }
        System.out.println("Your current balance is " + clientBalance);
    }

    private static void addBalance(Scanner scanner) {
//        System.out.println("Enter client ID:");
//        long clientId = scanner.nextLong();
        System.out.println("Enter credit card ID:");
        long creditCardNumber = scanner.nextLong();
        System.out.println("Enter amount:");
        double amount = scanner.nextDouble();
        //Client client = clientService.getClient(clientId);
        CreditCard creditCard = creditCardService.getCreditCard(creditCardNumber);
        creditCard.setBalance(creditCard.getBalance() + amount);
        creditCardService.updateCreditCard(creditCard);
        System.out.println("Operation successful");
    }

    private static void getCreditCardBalance(Scanner scanner) {
        System.out.println("Enter credit card ID:");
        long creditCardNumber = scanner.nextLong();
        CreditCard creditCard = creditCardService.getCreditCard(creditCardNumber);
        System.out.println(creditCard.getBalance());
    }

    private static void removeClient(Scanner scanner) {
        System.out.println("Enter client ID:");
        long clientId = scanner.nextLong();
        clientService.removeClient(clientId);
        System.out.println("Operation successful");
    }

    private static void log (){
        clientService.logCache();
        creditCardService.logCreditCardCache();
    }

    private static void createClient(Scanner scanner){
        System.out.println("Enter your name:");
        String name = scanner.nextLine();
        System.out.println("Enter your surname:");
        String surname = scanner.nextLine();
        System.out.println("Enter your age:");
        int age = scanner.nextInt();
        Set<Long> creditCardsIds;

        try {
            creditCardsIds = adjustCreditCardToClient(scanner);
            ClientValidator.validateClientAge(age);
            ClientValidator.validateClientsName(name);
            ClientValidator.validateClientsName(surname);
        } catch (ValidationException e) {
            System.out.println("Validation Exception: " + e.getMessage());
            return;
        }

        clientService.addClient(new Client(name, surname, age, creditCardsIds));
        System.out.println("Operation successful");
    }

    private static Set<Long> adjustCreditCardToClient (Scanner scanner) throws ValidationException {
        boolean isAddNew = true;
        Set<Long> creditCardsIds = new HashSet<>();
        while (isAddNew) {
            System.out.println("Enter your credit card ID:");
            long creditCardId = scanner.nextLong();
            System.out.println("Enter your cvv:");
            String cvv = scanner.next();
            CreditCard creditCard = creditCardService.getCreditCard(creditCardId);
            ClientValidator.validateClientsCreditCard(creditCard);
            ClientValidator.validateCvv(cvv, creditCard.getCvv());
            creditCardsIds.add(creditCardId);
            System.out.println("Do you want to add additional credit card?");
            isAddNew = scanner.nextBoolean();
        }
        return creditCardsIds;
    }

    private static void addCreditCard(Scanner scanner){
//        System.out.println("Enter you client ID:");
//        long clientId = scanner.nextLong();
//        System.out.println("Enter your credit card:");
//        long creditCardId = scanner.nextLong();
//        Client client = clientService.getClient(clientId);
//        if(client == null) {
//            System.out.println("No client with this ID");
//            return;
//        }
//        client.addCreditCardId(creditCardId);
        System.out.println("Enter your credit card balance:");
        long creditCardBalance = scanner.nextLong();
        creditCardService.addCreditCard(new CreditCard(creditCardBalance));
        System.out.println("Operation successful");
    }

}
