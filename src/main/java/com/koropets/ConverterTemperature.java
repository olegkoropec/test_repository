package com.koropets;

import java.util.Scanner;

public class ConverterTemperature {

    private double x = 0;

    private void convertTem (double temperature, char convTo){
        x = temperature ;
        double y;
        if (convTo ==  'F' || convTo =='f'){
            y = x*9/5+32;
            System.out.printf( "%.2f F", y);}
        else if (convTo ==  'C' || convTo == 'c'){
            y = (x-32)*5/9;
            System.out.printf( "%.2f C", y)   ;}
        else
            System.out.println( "Enter other symbol of temperature. F or C");
    }

    public static void main(String[] args) {
        System.out.println( "Enter temperature.");
        Scanner sc = new Scanner(System.in);
        double  y = sc.nextDouble();
        System.out.println( "What temperature do you want convert to. F or C");
        char   ch = sc.next().charAt(0);
        ConverterTemperature ct = new ConverterTemperature();
        ct.convertTem(y, ch);
    }
}
