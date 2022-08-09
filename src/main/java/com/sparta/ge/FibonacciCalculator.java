package com.sparta.ge;

import java.util.Arrays;
import java.util.Scanner;

//0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
public class FibonacciCalculator {
    public static int getFibonacci(int number){
        if (number == 0){
            return 0;
        }
        if (number == 1 || number == 2){
            return 1;
        }
        return getFibonacci(number-1) + getFibonacci(number-2);
    }

    public static int[] getFibonacciSequence(int number){
        int[] fibNumbers = new int[number];
        for(int i=0; i<fibNumbers.length; i++){
            fibNumbers[i] = getFibonacci(i);
        }
        return fibNumbers;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int input = scanner.nextInt();
        if(input < 0 ){
        }
        System.out.println("The fibonacci number of " + input + " is " + getFibonacci(input));
        /*for(int i=1; i<=input; i++){
            System.out.print(getFibonacci(i) + " ");*/
        System.out.println(Arrays.toString(getFibonacciSequence(input)));
    }
}


