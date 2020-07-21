package lesson24;

import java.util.Set;

public class Lesson24Main {
    public static void main(String[] args) {

       AccountInfo accountInfo1 = new AccountInfo(new Client(), 200);
       AccountInfo accountInfo2 = new AccountInfo(new Client(), 99);
       AccountInfo accountInfo3 = new AccountInfo(new Client(), 100);
       AccountInfo accountInfo4 = new AccountInfo(new Client(), 600.9);

       BankService bankService = new BankService();
       bankService.registerAccount(accountInfo1);
       bankService.registerAccount(accountInfo2);
       bankService.registerAccount(accountInfo3);
       bankService.registerAccount(accountInfo4);

       bankService.printBankInfo();
       bankService.increaseBalance(5, 1000);
       bankService.credit(4, 500);
       bankService.credit(4, 600);
       bankService.printBankInfo();


//       Set<AccountInfo> newAccountsInfo = bankService.getAllAccountsInfo();
//       for(AccountInfo accountInfo : newAccountsInfo){
//          System.out.println(accountInfo);
//       }
//       bankService.printBankInfo();



       bankService.monthlyPayments();
       bankService.clearBank();
       bankService.printBankInfo();




    }
}
