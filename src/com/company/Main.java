package com.company;
import java.util.Scanner;
public class Main {



    public static void main(String[] args) {
        // write your code here
        int i =0;
        int num =0;
        //Empty String
        String  primeNumbers = "";
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter any number:");
        //capture the input in an integer
        int number=scan.nextInt();
        scan.close();
        for (i = 1; i <= number; i++)
        {
            int counter=0;
            for(num =i; num>=1; num--)
            {
                if(i%num==0)
                {
                    counter = counter + 1;
                }
            }
            if (counter ==2)
            {
                System.out.printf("%d is   a prime number\r\n", i);
            }   else {
                System.out.printf("%d is  not a prime number\r\n", i);
            }
            {
                //Added the Prime number to the String
                primeNumbers = primeNumbers + i + " ";
            }
        }

    }
}
