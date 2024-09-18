package com.dhk.dsa;

public class Fabonacee {
    public static void main(String[] args) {
        System.out.println();
//        printFabonacee(5);
        System.out.print(0+" "+1);
        fabonaceeUsingRecursion(0,1,20);
    }
    private static void printFabonacee(int length){
        int firstNumber = 0;
        int secondNumber = 1;
        for(int i=0;i<length;i++){
            int newNumber = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = newNumber;
            System.out.print(newNumber+" ");
        }

    }
    private static void fabonaceeUsingRecursion(int firstNumber, int secondNumber, int length){


            int newNumber = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = newNumber;
            length -- ;
            System.out.print(" " + newNumber);

        if(length-2 >= 0){
            fabonaceeUsingRecursion(firstNumber, secondNumber, length);
        }
    }
}
