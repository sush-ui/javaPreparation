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

Create the below static method searchAccountByBalance in the AccountDemo class.

​

This method will take array of Account objects and balance as input and returns new array of Account objects for all values found with the given balance else return null if not found.

Create an array of 5 Account objects in the main method

 */
import java.util.ArrayList;
 class Account6 {

    private int accountNumber;
    private String accountType;
    private double balance;
    private int numberOfAccountHolders;

    public Account6(int accountNumber, String accountType, double balance, int numberOfAccountHolders) {
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

 class AccountDemo6 {

    public static Account6[] searchAccountByBalance(Account6 [] objArray,double givenBal){
        ArrayList<Account6> ar=new ArrayList<Account6>();
        for(Account6 account:objArray){
            if(account.getBalance()==givenBal){
                ar.add(account);
            }
        }
        if(ar.size()==0){
            return null;
        }

        else{
            Account6[] objArray2=new Account6[ar.size()];
            ar.toArray(objArray2);

            for(Account6 j:objArray){
                System.out.println(j.getAccountNumber());
            }
            System.out.println("------------------------------------------------");

            for(Account6 j:objArray2){
                System.out.println(j.getAccountNumber());
            }
            return objArray2;
        }

    }



    public static void main(String args[]) {
        Account6 account1 = new Account6(43, "bqhqoho", 328.0, 1);
        Account6 account2 = new Account6(95, "pbuyhuk", 931.0, 73);
        Account6 account3 = new Account6(74, "jkmxefn", 34.0, 18);
        Account6 account4 = new Account6(43, "rnoebjc", 799.0, 39);
        Account6 account5 = new Account6(17, "czwgofn", 372.0, 15);


        Account6[] objArray = {account1, account2, account3, account4, account5};

        Account6[] objResultArray1 = searchAccountByBalance(objArray, 322.0);
        if (objResultArray1 == null) {
            System.out.println("Output after first search is null. ");
        } else {
            System.out.println("Displaying contents of result array: ");

            for (Account6 account : objResultArray1) {
                System.out.println(account.getAccountNumber() + " " + account.getAccountType() + " " + account.getBalance() + " " + account.getNumberOfAccountHolders() + " ");
            }
        }

        Account6[] objResultArray2 = searchAccountByBalance(objArray, 372);
        if (objResultArray2 == null) {
            System.out.println("Output after first search is null. ");
        } else {
            System.out.println("Displaying contents of result array: ");

            for (Account6 account : objResultArray2) {
                System.out.println(account.getAccountNumber() + " " + account.getAccountType() + " " + account.getBalance() + " " + account.getNumberOfAccountHolders() + " ");
            }
        }
    }}