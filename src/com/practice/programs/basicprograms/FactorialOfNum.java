package com.practice.programs.basicprograms;

public class FactorialOfNum {
    public static void main(String[] args){
       System.out.println (factorialUsingRecursion ( 5 ));
        System.out.println (factorialWithoutRecursion ( 0 ));
    }

    public static int factorialUsingRecursion(int n){
        int num;
        while(n == 0){
            return 1;
        }

        return n * factorialUsingRecursion ( n - 1 );
    }

    public static int factorialWithoutRecursion(int n){
        int factorialValue = 1;
        for (int i = n; i >= 1; i--){
            factorialValue = factorialValue * i;
        }
        return factorialValue;
    }

}
