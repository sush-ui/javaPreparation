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
 * Create a static method replaceAccountByNumber in the AccountDemo class.
 *
 * This method will take array of Account objects and one Account object as input. Replace the Account object with same number if found in the array and return true. Else return false
 *
 * ​
 *
 * Create an array of 5 Account objects in the main method
 */
public class Account2 {

    private int accountNumber;
    private String accountType;
    private double balance;
    private int numberOfAccountHolders;

    public Account2(int accountNumber, String accountType, double balance, int numberOfAccountHolders) {
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

class AccountDemo2 extends Account{

    public AccountDemo2(int number, String accountType, double balance, int numberOfAccountHolders) {
        super(number, accountType, balance, numberOfAccountHolders);
    }

    public static boolean replaceAccountByNumber(Account[] objArray, Account obj){

        for(Account account:objArray){
            if(account.getNumber()== obj.getNumber()){
                account.setNumber(obj.getNumber());
                account.setAccountType(obj.getAccountType());
                account.setBalance(obj.getBalance());
                account.setNumberOfAccountHolders(obj.getNumberOfAccountHolders());
                return true;
            }
        }
        return false;

    }

    public static void main(String[] args) {

        Account account1= new Account(33,"atyyfrx",526.0,29);
        Account account2= new Account(73,"niyrmyr",838.0,81);
        Account account3= new Account(86,"tjhyvix",59.0,3);
        Account account4= new Account(53,"xtkrhmr",97.0,63);
        Account account5= new Account(97,"bebjwuk",230.0,26);


        Account [] objArray={account1,account2,account3,account4,account5};

        Account accountRes1= new Account(31,"mcxdkjh",701.0,64);

        boolean result= replaceAccountByNumber(objArray, accountRes1);
        System.out.println("Output for performing replace on accountRes1 is: "+ result  );

        System.out.println("Displaying contents of array: ");

        for(Account account:objArray){
            System.out.println(account.getNumber()+" " + account.getAccountType()+" " + account.getBalance()+" " + account.getNumberOfAccountHolders()+" ");
        }
        System.out.println();

        Account accountRes2= new Account(73,"zgcerte",224.0,29);
        result= replaceAccountByNumber(objArray, accountRes2);

        System.out.println("Output for performing replace on accountRes2 is: "+ result  );

        System.out.println("Displaying contents of array: ");

        for(Account account:objArray){
            System.out.println(account.getNumber()+" " + account.getAccountType()+" " + account.getBalance()+" " + account.getNumberOfAccountHolders()+" ");
        }
    }
}
