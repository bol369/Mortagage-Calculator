package com.calculator;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Principal :");
        int principal = scanner.nextInt();

        System.out.print("Annual Interest Rate :");
        float an_in_rate = scanner.nextFloat();
        int percent = 100;
        int months_in_year = 12;
        float monthlyInterest = an_in_rate/percent/months_in_year;

        System.out.print("Period (Years) :");
        byte period = scanner.nextByte();
        int numberOfPayment = period * months_in_year;

        // Calculate the Monthly Payment
        double monthly_payment = principal * (monthlyInterest * Math.pow(1+monthlyInterest,numberOfPayment))
                /(Math.pow(1+monthlyInterest,numberOfPayment)-1);

        String currency = NumberFormat.getCurrencyInstance(new Locale("en","lk")).format(monthly_payment);


        System.out.println("Monthly Payment:" + currency);
    }
}
