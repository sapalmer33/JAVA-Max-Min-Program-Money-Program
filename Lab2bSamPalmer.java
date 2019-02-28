
package lab2b.sam.palmer;

import java.util.Scanner;

public class Lab2bSamPalmer {

   
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        int change;
        int amount;
        System.out.print("Enter the purchase amount (Example: 1.23) : ");
        amount = (int) Math.round(keyboard.nextDouble() * 100);
        
            change = amount;
               
            int ones = change / 100;
            if (ones > 0) {
                change = change % 100;
                System.out.println("Dollars : " + ones);
            }
            
            int half_dollars = change / 50;
            if (half_dollars > 0) {
                change = change % 50;
                System.out.println("Half-Dollars : " + half_dollars);
            }
            
            int quarters = change / 25;
            if (quarters > 0) {
                change = change % 25;
                System.out.println("Quarters : " + quarters);
            }
            
            int dimes = change / 10;
            if (dimes > 0) {
                change = change % 10;
                System.out.println("Dimes : " + dimes);
            }
            
            int nickels = change / 5;
            if (nickels > 0) {
                change = change % 5;
                System.out.println("Nickels : " + nickels);
            }
            
            int pennies = change;
            System.out.println("Pennies : " + pennies);
        }

        }
   