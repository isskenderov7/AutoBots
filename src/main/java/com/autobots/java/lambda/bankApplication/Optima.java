package com.autobots.java.lambda.bankApplication;

public class Optima extends BankBase{
    private double balance =0;

    public Optima(long accountNumber, long routingNumber) throws Exception {
        super(accountNumber, routingNumber);
        addToAllBankRecords(this);
    }


    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public void deposit(double amount) {
        if (amount<0 || amount >=300000){
            throw new IllegalArgumentException("Invalid amount can not be deposit ");
        }
        balance+=amount;
    }

    @Override
    public void withDraw(double amount) {
        if(amount<0||amount>=250000){
            throw new IllegalArgumentException("Invalid amount cannot withDraw");
        }else {
            if (amount>balance){
                throw new IllegalArgumentException("Insufficient funds");
            }else {
                balance+=amount;
            }
        }
    }
}
