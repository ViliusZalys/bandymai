package lt.vtvpmc.ems.akademijait.vilius;

public class CreditBankAccount {

    private String number;

    private double balance;

    private double creditLimit;

    public CreditBankAccount(String number){
        this.number = number;
    }

    public CreditBankAccount(String number, double creditLimit){
        this.number = number;
        this.creditLimit = creditLimit;
    }

    public String getNumber() {
        return this.number;
    }




    public double getBalance() {
        return this.balance;
    }

    public void credit(double amount) {
        if (amount > 0) {
            this.balance += amount;}
    }

    public void debit(double amount) {
        this.balance -= amount;

    }
}
