package lesson24;

import java.util.HashSet;
import java.util.Set;

public class BankService {

    private Bank bank = new Bank();
    private static final double COMISSION = 2;
    private static final double bankPercent = 0.1;
    private static final double additionalCreditPercent = 0.05;

    public void registerAccount(AccountInfo accountInfo){
        if (accountInfo.getAccountBalance() <100){
            System.out.println("We cannot take this account");
            return;
        }
        bank.addAccountInfo(accountInfo);
    }

    public void monthlyPayments(){
        Set<AccountInfo> accountInfos = new HashSet<>();
        for(AccountInfo accountInfo : bank.getBankAccounts()){
            double newBalance = accountInfo.getAccountBalance();
            double newCreditBalance = accountInfo.getCreditBalance();
            double initialCreditAmount = accountInfo.getInitialCreditAmount();
            if(!accountInfo.isCreditAllowed()){
                newBalance = newBalance - initialCreditAmount * bankPercent - initialCreditAmount * additionalCreditPercent;
//               newBalance -= initialCreditAmount * bankPercent;
//               newBalance -= initialCreditAmount * additionalCreditPercent;
               newCreditBalance -= newCreditBalance * bankPercent;
               if(newCreditBalance == 0){
                   accountInfo.setInitialCreditAmount(0);
               }
            }
            if(newBalance <= 0){
                System.out.println("Call the police. We have a thief!");
            }
//            newBalance -= COMISSION;
            AccountInfo newAccountInfo = new AccountInfo(accountInfo.getClientId(), newBalance, newCreditBalance);
            accountInfos.add(newAccountInfo);
        }
        bank.updateAllAccountInfos(accountInfos);
    }

    public void clearBank () {
        Set<AccountInfo> accounts = new HashSet<>();
        for (AccountInfo accountInfo : bank.getBankAccounts()){
            if(accountInfo.getAccountBalance() < 100){
                System.out.println("Client with id: " + accountInfo.getClientId() + " doesn't have enough money");
                continue;
            }
            accounts.add(accountInfo);
        }
        bank.updateAllAccountInfos(accounts);
    }

    public void printBankInfo(){
        System.out.println("***********");
        System.out.println("Bank info: ");
        for(AccountInfo accountInfo: bank.getBankAccounts()){
            System.out.println(accountInfo);
        }
        System.out.println("***********");
    }

    public Set<AccountInfo> getAllAccountsInfo (){
        Set<AccountInfo> allAccountsInfo = new HashSet<>();
//        for(AccountInfo accountInfo: bank.getBankAccounts()){
//            allAccountsInfo.add(accountInfo);
//        }
        allAccountsInfo.addAll(bank.getBankAccounts());
        bank.getBankAccounts().clear();
        return allAccountsInfo;
    }

    public void monthlyPaymentsForToxicAccounts(){
        Set<AccountInfo> accountInfos = new HashSet<>();
        int i = 0;
        for(AccountInfo accountInfo : bank.getBankAccounts()){
            i++;
            if(i % 2 != 0){
                continue;
            }
            double newBalance = accountInfo.getAccountBalance() - COMISSION * 2;
            accountInfos.add(new AccountInfo(accountInfo.getClientId(), newBalance));
        }
        bank.updateAllAccountInfos(accountInfos);
    }

    public void increaseBalance (long clientId, double money){
        if(money<=0){
            return;
        }
        double newBalance = 0;
        Set<AccountInfo> bankAccounts = bank.getBankAccounts();
        for(AccountInfo accountInfo : bankAccounts){
           if(clientId == accountInfo.getClientId()) {
               newBalance = accountInfo.getAccountBalance() + money;
           }
        }
        if(newBalance == 0){
            return;
        }
       AccountInfo updatedAccountInfo = new AccountInfo(clientId, newBalance);
        bankAccounts.remove(updatedAccountInfo);
        bankAccounts.add(updatedAccountInfo);
    }

    public void credit (long clientId, double amount){
        double newBalance = 0;
        Set<AccountInfo> bankAccounts = bank.getBankAccounts();
//        double amount = 1000;
        for(AccountInfo accountInfo : bankAccounts){
            if(clientId == accountInfo.getClientId() && accountInfo.isCreditAllowed()) {
                newBalance = accountInfo.getAccountBalance() + amount;
            }
        }
        if(newBalance == 0){
            return;
        }
        AccountInfo updatedAccountInfo = new AccountInfo(clientId, newBalance, amount);
        updatedAccountInfo.setInitialCreditAmount(amount);
        bankAccounts.remove(updatedAccountInfo);
        bankAccounts.add(updatedAccountInfo);
    }
}

