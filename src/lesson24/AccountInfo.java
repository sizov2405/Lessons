package lesson24;

import java.util.Objects;

public class AccountInfo {

    private long clientId;
    private double accountBalance;
    private double creditBalance = 0;
    private double initialCreditAmount = 0;
//    private boolean isCreditAllowed = true;

    public AccountInfo (long clientId, double accountBalance){
        this.clientId = clientId;
        this.accountBalance = accountBalance;
    }
    public AccountInfo (long clientId, double accountBalance, double creditAmount){
        this.clientId = clientId;
        this.accountBalance = accountBalance;
        this.creditBalance = creditAmount;
    }

    public AccountInfo (Client client, double accountBalance){
        this.clientId = client.getId();
        this.accountBalance = accountBalance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AccountInfo that = (AccountInfo) o;
        return clientId == that.clientId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(clientId);
    }

    public long getClientId() {
        return clientId;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public boolean isCreditAllowed() {
       return creditBalance == 0;
    }

    public double getInitialCreditAmount() {
        return initialCreditAmount;
    }

    public void setInitialCreditAmount(double initialCreditAmount) {
        this.initialCreditAmount = initialCreditAmount;
    }

    public double getCreditBalance() {
        return creditBalance;
    }

    public void setCreditBalance(double creditBalance) {
        this.creditBalance = creditBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    @Override
    public String toString() {
        return "AccountInfo{" +
                "clientId=" + clientId +
                ", accountBalance=" + accountBalance +
                ", creditBalance=" + creditBalance +
                '}';
    }
}
