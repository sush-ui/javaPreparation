/*
 * Create a class Account with below attributes:
 *
 * ​
 *
 * int - number
 *
 * String - acType
 *
 * double - balance
 *
 * int - noOfAccountHolders
 *
 * ​
 *
 * Make all the attributes private.Create corresponding getters and setters.
 *
 * ​
 *
 * Create a constructor which takes all parameters in the above sequence.
 *
 * The constructor should set the value of attributes to parameter values inside the constructor.
 *
 * ​
 *
 * Create a class AccountDemo with main method
 *
 * ​
 *
 * Create the below static method sortAccountByNumber in the AccountDemo class.
 *
 * sortAccountByNumber(Account[] objArray)
 *
 * ​
 *
 * The method will sort the array based on number and return the sorted array.
 *
 * Create an array of 5 Account objects in the main method
 */

import java.util.*;


public class Account3 implements Comparator<Account3>{

    private int accountNumber;
    private String accountType;
    private double balance;
    private int numberOfAccountHolders;

    public Account3(int accountNumber, String accountType, double balance, int numberOfAccountHolders) {
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = balance;
        this.numberOfAccountHolders = numberOfAccountHolders;
    }

    public Account3() {

    }


    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getNumberOfAccountHolders() {
        return numberOfAccountHolders;
    }

    public void setNumberOfAccountHolders(int numberOfAccountHolders) {
        this.numberOfAccountHolders = numberOfAccountHolders;
    }


    @Override
    public int compare(Account3 o1, Account3 o2) {
        return (int) ( o1.numberOfAccountHolders-o2.numberOfAccountHolders);
    }


    @Override
    public String toString() {
        return "Account3{" +
                "accountNumber=" + accountNumber +
                ", accountType='" + accountType + '\'' +
                ", balance=" + balance +
                ", numberOfAccountHolders=" + numberOfAccountHolders +
                '}';
    }



}

class AccountDemo3 extends Account3{


    public AccountDemo3(int accountNumber, String accountType, double balance, int numberOfAccountHolders) {
        super(accountNumber, accountType, balance, numberOfAccountHolders);
    }

    public static Account3[] sortAccountByNumber(Account3 [] objArray){
        List<Account3> ls = (List<Account3>) Arrays.asList(objArray);
        ls.sort(new Account3());
        objArray = new Account3[ls.size()];
        ls.toArray(objArray);
        return objArray;
    }

    public static void main(String[] args) {
        Account3 account1= new Account3(79,"dxqfkje",750.0,32);
        Account3 account2= new Account3(70,"yzfsutw",759.0,42);
        Account3 account3= new Account3(24,"iqqlcfr",966.0,85);
        Account3 account4= new Account3(27,"xqaibfl",733.0,75);
        Account3 account5= new Account3(79,"jxpsdpo",324.0,54);



        Account3[] objArray= {account1,account2,account3,account4,account5};

        Account3[] objArrayRes= sortAccountByNumber(objArray);
        System.out.println("Displaying contents of array: ");

        for(Account3 account:objArray){
            System.out.println(account.getAccountNumber()+" " + account.getAccountType()+" " + account.getBalance()+" " + account.getNumberOfAccountHolders()+" ");
        }
    }

}
