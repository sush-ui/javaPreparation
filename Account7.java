/*
Create a class Account with below attributes:

int - number

String - acType

double - balance

int - noOfAccountHolders

Make all the attributes private



Create corresponding getters and setters.

​

Create a constructor which takes all parameters in the above sequence.

The constructor should set the value of attributes to parameter values inside the constructor.

​

Create a class AccountDemo with main method

​

Create the below static method searchAccountByNoOfAccountHolders in the AccountDemo class.

​

This method will take array of Account objects and noOfAccountHolders as input and returns new array of Account objects for all values found with the given noOfAccountHolders else return null if not found.

​

Create an array of 5 Account objects in the main method
 */


import java.util.ArrayList;

public class Account7 {

    private int accountNumber;
    private String accountType;
    private double balance;
    private int numberOfAccountHolders;

    public Account7(int accountNumber, String accountType, double balance, int numberOfAccountHolders) {
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
class AccountDemo7 {


    public static Account7[] searchAccountByNoOfAccountHolders(Account7 [] objArray, int number){
        ArrayList <Account7> ar=new ArrayList<Account7>();
        for(Account7 account:objArray){
            if (account.getNumberOfAccountHolders()==number){
                ar.add(account);
            }
        }
        Account7 [] objArray2=new Account7[ar.size()];
        ar.toArray(objArray2);
        if(ar.size()==0){
            return null;
        }
        return objArray2;
    }
    public static void main(String args[]){
        Account7 account1= new Account7(4,"rbwgqps",630.0,33);
        Account7 account2= new Account7(56,"pwibjzs",437.0,53);
        Account7 account3= new Account7(45,"djhipnk",889.0,22);
        Account7 account4= new Account7(35,"jnwtber",980.0,99);
        Account7 account5= new Account7(7,"tyuaktj",66.0,7);


        Account7[] objArray= {account1,account2,account3,account4,account5};

        Account7[] objResultArray1= searchAccountByNoOfAccountHolders(objArray, 7);
        if(objResultArray1==null){
            System.out.println("Output after first search is null. ");
        }else{
            System.out.println("Displaying contents of result array: ");

            for(Account7 account:objResultArray1){
                System.out.println(account.getAccountNumber()+" " + account.getAccountType()+" " + account.getBalance()+" " + account.getNumberOfAccountHolders()+" ");
            }
        }

        Account7[] objResultArray2= searchAccountByNoOfAccountHolders(objArray, 99);
        if(objResultArray2==null){
            System.out.println("Output after first search is null. ");
        }else{
            System.out.println("Displaying contents of result array: ");

            for(Account7 account:objResultArray2){
                System.out.println(account.getAccountNumber()+" " + account.getAccountType()+" " + account.getBalance()+" " + account.getNumberOfAccountHolders()+" ");
            }
        }
    }}