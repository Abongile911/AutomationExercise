package Exercises;

public class BankAccount {

    public int AccountNumber, Balance;
    public String AccountType;

    public BankAccount(){
        this.AccountNumber = 12345;
        this.AccountType = "Savings";
        this.Balance = 1000;

    }
    public BankAccount(int argAccountNumber, String argAccountType, int argBalance){
        this.AccountNumber = argAccountNumber;
        this.AccountType = argAccountType;
        this.Balance = argBalance;
    }

}
