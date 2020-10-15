/*
  Create a class Account with below attributes:

  ​

  int - number

  String - acType

  double - balance

  int - noOfAccountHolders

  Make all the attributes private.



  Create corresponding getters and setters.

  ​

  Create a constructor which takes all parameters in the above sequence.

  The constructor should set the value of attributes to parameter values inside the constructor.

  ​

  Create a class AccountDemo with main method

  ​

  Create the below static method searchAccountByAcType in the AccountDemo class.

  ​

  This method will take array of Account objects and acType as input and returns new array of Account objects for all values found with the given acType else return null if not found.

  ​

  Create an array of 5 Account objects in the main method
 */

import java.util.ArrayList;

public class Account5 {

    private int accountNumber;
    private String accountType;
    private double balance;
    private int numberOfAccountHolders;


    public Account5(int accountNumber, String accountType, double balance, int numberOfAccountHolders) {
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
}
class AccountDemo5 extends Account5{


    public AccountDemo5(int accountNumber, String accountType, double balance, int numberOfAccountHolders) {
        super(accountNumber, accountType, balance, numberOfAccountHolders);
    }

    public static Account5[] searchAccountByAcType(Account5[] objArray, String accType){
       ArrayList <Account5> ar=new ArrayList<Account5>();
       for(Account5 account:objArray){
           if(account.getAccountType().equals(accType)){
               ar.add(account);
           }

       }

        if(ar.size() > 0){
           objArray = new Account5[ar.size()];
           ar.toArray(objArray);
           return objArray;
       }
       return null;
   }

    public static void main(String args[]) {
        Account5 account1 = new Account5(43, "ianynap", 267.0, 41);
        Account5 account2 = new Account5(80, "gneuwmm", 789.0, 76);
        Account5 account3 = new Account5(80, "yyudure", 588.0, 99);
        Account5 account4 = new Account5(60, "ahixnty", 831.0, 39);
        Account5 account5 = new Account5(72, "iwundhq", 804.0, 4);


        Account5[] objArray = {account1, account2, account3, account4, account5};

        Account5[] objResultArray1 = searchAccountByAcType(objArray, "oxxvosw");
        if (objResultArray1 == null) {
            System.out.println("Output after first search is null. ");
        } else {
            System.out.println("Displaying contents of result array: ");

            for (Account5 account : objResultArray1) {
                System.out.println(account.getAccountNumber() + " " + account.getAccountType() + " " + account.getBalance() + " " + account.getNumberOfAccountHolders() + " ");
            }
        }

        Account5[] objResultArray2 = searchAccountByAcType(objArray, "gneuwmm");
        if (objResultArray2 == null) {
            System.out.println("Output after first search is null. ");
        } else {
            System.out.println("Displaying contents of result array: ");

            for (Account5 account : objResultArray2) {
                System.out.println(account.getAccountNumber() + " " + account.getAccountType() + " " + account.getBalance() + " " + account.getNumberOfAccountHolders() + " ");
            }
        }
    }}