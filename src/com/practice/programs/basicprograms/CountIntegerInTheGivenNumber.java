package com.practice.programs.basicprograms;

import java.util.Scanner;

public class CountIntegerInTheGivenNumber {
    public static void main(String[] args){
        System.out.println("Enter Integer Num -> ");
        Scanner scanner = new Scanner ( System.in );
        int num = scanner.nextInt ();

        int totalCount = integerCountInTheGivenNum ( num );

        System.out.println("The Num of Integer is ->  "+totalCount);
    }

    public static int integerCountInTheGivenNum(int num){
        int count = 0;
        while (num > 0 ){
            num = num / 10;
            ++count;
        }
        return count;
    }
}
