package com.autobots.java.lambda.bankApplication;

public class BankDemo {
    public static void main(String[] args) throws Exception {
        MBank aliyaMBank;
        aliyaMBank = new MBank(123456789111L,444444444);
//        System.out.println(aliyaMBank.getBalance());
        aliyaMBank.deposit(100000);
        System.out.println("-----------------");

        Optima ulugbekOptima = new Optima(123456789017L,123456789);
        Bank.transferFunds(aliyaMBank,ulugbekOptima,500);
//        System.out.println(aliyaMBank.getBalance());
//        System.out.println(ulugbekOptima.getBalance());

        Demir zinaidademir = new Demir(198765432166L,177177177);

//        Bank.transferFunds(zinaidademir,ulugbekOptima,1000);


    }
}
