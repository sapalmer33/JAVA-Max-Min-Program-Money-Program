
package lab2a.sam.palmer;

import java.util.Scanner;

public class Lab2aSamPalmer {

  
    public static void main(String[] args) {
       
        Scanner scan = new Scanner(System.in);
        double average;
        int count = 0, sum = 0, num;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        System.out.println("Please enter the 10 numbers between 1 - 100 you would like to evaluate: ");

        do {
            num = scan.nextInt();
            sum += num;
            count++;
            
            {
            if(num>max)
               max=num;
            if(num<min)
               min=num; 
            if (num < 1 || num > 100)
                System.exit(0);
            }
     
        } 
        while (count < 10);
        average = sum / 10;
        
        {

        System.out.println("Your average is: " + average);

        System.out.println("Your maximum number is: " + max);
        System.out.println("Your minimum number is: " + min);
       
        }}}
