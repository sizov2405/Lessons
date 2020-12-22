package project;

import java.util.Scanner;

public class Starter {
    public static void main(String[] args) {

//        Client client1 = new Client("Tom", "Jones", 35);
//        Client client2 = new Client("Matt", "Danna", 40);
//        Client client3 = new Client("Travis", "Roth", 45);
//        Client client4 = new Client("Paul", "Marvin", 50);

        while(true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Known commands: addClient, removeClient, log, exit, addCreditCard, getCreditCardBalance, addBalance, getClientBalance");
            System.out.println("Enter your command:");
            String command = scanner.nextLine();
            if(command.equals("exit")){
                break;
            }
            ScannerService.processCommand(command, scanner);
        }



    }
}
