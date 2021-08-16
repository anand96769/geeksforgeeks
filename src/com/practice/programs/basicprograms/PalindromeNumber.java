package com.practice.programs.basicprograms;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {

        System.out.println("Enter Number to check number is palidrome or not - ");
        Scanner scanner = new Scanner ( System.in );
        int num = scanner.nextInt ();
        if (isPalindromeNumber ( num )){
            System.out.println("The Given num is Palidrome num");
        }else{
            System.out.println ("Num is Not Palidrome nums");
        }

    }

    public static boolean isPalindromeNumber(int num){
        int remainder = 0;
        boolean isPalidromeNumber = false;
        int copyOfNum = num;
        while (num > 0){
            int rem = num % 10;
            num = num / 10;
            remainder = (remainder * 10) +rem;
        }

        if (remainder == copyOfNum){
            isPalidromeNumber = true;
        }

        return isPalidromeNumber;
    }
}
