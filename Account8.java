/*
Find interest value
Create a class Account with below attributes:

int id

double balance

double interestRate



Class should have getters, setters and constructor with parameters in above sequence of attributes.



Create a class Solution with main method.
 Read one integer and two double values using Scanner object and create object of Account class.
 These values should be mapped to id, balance and interestRate attributes.



Read one more integer value and store it in variable noOfYears.



Write a method calculateInterest which will take account object and no of years as input parameters and
return the interest amount.



Consider below logic to calculate the interest value:



For specified no of years, first find out the percentage value those no of years based on specified interestRate.
 E.g. if no of years is 5 and specified interestRate is 4%, then 4% of 5 is 0.2.
This percentage should be added to original interstRate for calculating the final interest value.
Hence for above example it will be 4.2 (instead of 4).


Display the interest amount rounded upto three decimal places.
Even if the result does not have decimal, it should be displayed with suffix ".000".



Consider below sample input and output:



Input:

1

1000

10

5

Output:

105.000



Output is 55 since the interest rate is 10 and no of years is 5.
 Hence, the final interest will be 10 + 10 percentage of 5, which is 10.5.
 Hence final answer is 105.000.
 */


import java.util.Scanner;

public class Account8 {

    private int id;
    private double balance;
    private double interestRate;

    public Account8(int id, double balance, double interestRate) {
        this.id = id;
        this.balance = balance;
        this.interestRate = interestRate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

}


class solution {


    public static double calculateInterest(Account8 ac,int noy){
        double interestAmount=0;

        interestAmount=(ac.getInterestRate()/100)*noy;

        return (ac.getBalance() * (ac.getInterestRate()+interestAmount) / 100);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int i=sc.nextInt();
        double b=sc.nextDouble();
        double ir=sc.nextDouble();

        Account8 ac1=new Account8(i,b,ir);

        int noy=sc.nextInt();
        double resTotal=calculateInterest(ac1,noy);
        System.out.format("%.3f",resTotal);

    }
}