package com.training.day2;
import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner  scanner = new Scanner(System.in);

        int givenNumber = scanner.nextInt();

        boolean result = isPrime(givenNumber);

        System.out.println(givenNumber +": Is Prime");
    }

    public static boolean isPrime(int givenNumber) {
        boolean isPrimeResult = true;
        if(givenNumber > 1){
            int rootValue = (int) Math.sqrt(givenNumber);
            for(int count=2; count <= rootValue; count++){
                if(isPrime(count)){
                    if ( (givenNumber % count) == 0){
                        isPrimeResult = false;
                        break;
                    }
                }
            }
        }
        return isPrimeResult;
    }
}
