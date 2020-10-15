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
 * Make all the attributes private.
 *
 * Create corresponding getters and setters.
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
 * Create the below static method sortAccountByAcType in the AccountDemo class.
 *
 * sortAccountByAcType(Account[] objArray)
 *
 * ​
 *
 * The method will sort the array based on acType and return the sorted array.
 *
 * Create an array of 5 Account objects in the main method
 */

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Account4 implements Comparator <Account4>{

    private int accountNumber;
    private String accountType;
    private double balance;
    private int numberOfAccountHolders;


    public Account4(){}

    public Account4(int accountNumber, String accountType, double balance, int numberOfAccountHolders) {
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = balance;
        this.numberOfAccountHolders = numberOfAccountHolders;
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
    public int compare(Account4 o1, Account4 o2) {
        return o1.accountType.compareTo(o2.accountType);
    }
}


class AccountDemo4 {


    public static Account4[] sortAccountByAcType(Account4[] objArray){
        List<Account4> arr=Arrays.asList(objArray);

        arr.sort(new Account4());
        arr.toArray(objArray);


        return objArray;
    }
    public static void main(String[] args) {
        Account4 account1= new Account4(20,"fvmirje",552.0,90);
        Account4 account2= new Account4(40,"sfvwspp",385.0,66);
        Account4 account3= new Account4(16,"tfypcof",807.0,13);
        Account4 account4= new Account4(15,"gvkhywb",627.0,51);
        Account4 account5= new Account4(29,"iglclrn",775.0,43);


        Account4[] objArray= {account1,account2,account3,account4,account5};

        Account4[] objArrayRes= sortAccountByAcType(objArray);
        System.out.println("Displaying contents of array: ");

        for(Account4 account:objArray){
            System.out.println( account.getAccountNumber()+" " +account.getAccountType()+" "+ account.getBalance()+" " + account.getNumberOfAccountHolders()+" ");
        }
    }
}
