import java.util.*;
public class Account_sample 
{
    private int id;
    private double balance;
    private double annual;
    private double mi;
    private double mr;
    
    Account_sample()
    {
        id=0;
        balance=0;
        annual=0;
        mi=0;
        mr=0;
    }
    Account_sample(int id,double balance)
    {
        this.id=id;
        this.balance=balance;
    }

    public int setid(int id)
    {
        return this.id=id;
    }

    public int getid()
    {
        return this.id;
    }

    public double setbalance(double balance)
    {
        return this.balance=balance;
    }
    
    public double getbalance()
    {
        return this.balance;
    }

    public double setannual(double annual)
    {
        return this.annual=annual;
    }
    public double getannual()
    {
        return this.annual;
    }

    public double getMonthlyInterest(double mi)
    {
        return this.mi=mi;
    }
    public double getMonthlyInterestRate(double mr)
    {
        return this.mr=mr;
    }

    public int withdraw(int a)
    {
        if(balance>=a)
        {
            this.balance=balance-a;
            System.out.println("Withdrawn Amount= "+a);
            System.out.println("Current Balance= "+balance);
        }
        else
        {
            System.out.println("Insufficient Balance");
        }
    }
    public int deposit(int d)
    {
        this.balance=balance+d;
        System.out.println("Deposited Amount= "+d);
        System.out.println("Current Balance= "+balance);
    }
}
class Account
{
    public static void main(String args[]) 
    {
        Account_sample obj = new Account_sample();

    }
    
}

   

