package com.sda.testowanie.account;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Account {

    private double balance;
    private String owner;
    private String number;

    public Account(String owner, String number) {
        this.owner = owner;
        if (isNumberValid(number)) {
            this.number=stripAccountNumber(number);
        }else {
            this.number="00123456789012345678901234";
        }
    }

    public double getBalance(){
        return balance;
    }

    public String getNumber() {
        return number;
    }

    public static boolean isNumberValid(String accountNumber){

        String number = stripAccountNumber(accountNumber);

        Pattern pt = Pattern.compile("^\\d{26}$");
        Matcher mt = pt.matcher(number);

        return mt.find();
    }

    public static String stripAccountNumber(String number){
        return number.trim()
                .strip()
                .replace(" ","")
                .replace("-","");
    }

    public double receiveAmount(double amount){
        return balance+=amount;
    }

    public double sendAmount(double amount){
        if (amount>0 && amount<=getBalance()){
            return balance-=amount;
        }else {
            return balance;
        }
    }

    public boolean isTransferValid(double amount){
        return amount > 0 && amount <= balance;
    }
}
