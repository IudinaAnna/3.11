 package com.company;
import java.util.Scanner;
class Account {
    private String name;
    private double balance;
    private double cash_withdrawal;
    public Account(String name,double balance) {
        this.name=name;
        if(balance>0.00)
            this.balance=balance;
    }
    public void deposit(double depositAmount) {
        if (depositAmount > 0.0)
            balance = balance + depositAmount;
    }
    public double getBalance()
    {
        return balance;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public String getName()
    {
        return name;
    }
    public void Cash_withdrawal(double cash_withdrawal) {
        double result=balance-cash_withdrawal;
        if(result<0) {
            System.out.println("Ошибка.Невозможно снять больше наличиных чем есть на счету!!!");
        }
        else {
            System.out.println("Вы сняли со своего счета: "+ cash_withdrawal);
            System.out.println("На вашем счету осталось: "+result);
        }
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Account acc=new Account("ANNA", 2000);
        acc.Cash_withdrawal(200);
    }
}
