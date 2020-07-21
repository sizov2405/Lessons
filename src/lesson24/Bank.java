package lesson24;

import java.util.HashSet;
import java.util.Set;

public class Bank {

    private Set<AccountInfo> bankAccounts = new HashSet<>();

    public void addAccountInfo (AccountInfo accountInfo){

        bankAccounts.add(accountInfo);
    }

    public Set<AccountInfo> getBankAccounts(){
        return bankAccounts;
    }

    public void updateAccountInfo(AccountInfo updatedAccountInfo) {
//            accountInfo.setAccountBalance(newBalance);
        bankAccounts.remove(updatedAccountInfo);
        bankAccounts.add(updatedAccountInfo);
    }

    public void updateAllAccountInfos(Set<AccountInfo> bankAccounts) {
        this.bankAccounts = bankAccounts;
    }


    public void removeAccountInfo (AccountInfo accountInfo) {
            bankAccounts.remove(accountInfo);
        }



//    не правильно из-за параметров
//    public void clearBank (Set<AccountInfo> accountInfos){
//        for(AccountInfo accountInfo : accountInfos){
//            if(accountInfo.getAccountBalance() < 100){
//                System.out.println("Client with id: " + accountInfo.getClientId() + "doesn't have enough money");
//                bankAccounts.remove(accountInfo);
//            }
//        }





}
