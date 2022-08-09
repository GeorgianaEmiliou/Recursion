package com.sparta.ge;


//5! = 1*2*3*4*5
//Recursion
//1. Memory efficient
//2. Do not need to create objects
public class FactorialCalculator {

    private static int getFactorial(int number){
        //Base case - When do we stop?
        if (number == 1){
            return 1;
        }
        else{
            return (number * getFactorial(number-1));
        }
    }

    public static void main(String[] args) {
        System.out.println(getFactorial(5));
    }
}

