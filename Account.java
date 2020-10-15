/*
 *Create a class Account with below attributes:
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
 * Create the below static method searchAccountByNumber in the AccountDemo class.
 *
 * searchAccountByNumber(Account[] objArray)
 *
 * ​
 *
 * This method will take array of Account objects and number as input and returns the position of the number if found or -1 if not found.
 *
 * ​
 *
 * Create an array of 5 Account objects in the main method
 *
 *
 *
  */
public class Account {

    private int number;
    private String AccountType;
    private double balance;
    private int numberOfAccountHolders;


    public Account(int number, String accountType, double balance, int numberOfAccountHolders) {
        this.number = number;
        AccountType = accountType;
        this.balance = balance;
        this.numberOfAccountHolders = numberOfAccountHolders;
    }

    public Account() {

    }

    public int getNumber() {
        return number;
    }

    public String getAccountType() {
        return AccountType;
    }

    public double getBalance() {
        return balance;
    }

    public int getNumberOfAccountHolders() {
        return numberOfAccountHolders;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setAccountType(String accountType) {
        AccountType = accountType;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setNumberOfAccountHolders(int numberOfAccountHolders) {
        this.numberOfAccountHolders = numberOfAccountHolders;
    }
}


class AccountDemo{

    public static int searchAccountByNumber(Account[] objArray,int number){
        int pos=0;

        for(Account account:objArray){
            pos++;
            if(account.getNumber()==number){

                return pos;
            }

        }

    if(pos>=objArray.length){
        pos= -1;
    }
return pos;

    }

    public static void main(String[] args) {
        Account account1= new Account(7,"ewqkvae",168.0,67);
        Account account2= new Account(3,"mqclvcm",123.0,74);
        Account account3= new Account(57,"uenzjpt",164.0,98);
        Account account4= new Account(28,"hwzlblz",130.0,5);
        Account account5= new Account(4,"rmejckg",125.0,28);

        Account[] objArray={account1,account2,account3,account4,account5};

        int accountres= searchAccountByNumber(objArray, 63);
        System.out.println("Output after first search: "+accountres);

        int accountres1= searchAccountByNumber(objArray, 4);
        System.out.println("Output after second search: "+accountres1);

        int accountres11= searchAccountByNumber(objArray, 57);
        System.out.println("Output after second search: "+accountres11);

        int accountres12= searchAccountByNumber(objArray, 7);
        System.out.println("Output after second search: "+accountres12);

        int accountres13= searchAccountByNumber(objArray, 40);
        System.out.println("Output after second search: "+accountres13);
    }
}