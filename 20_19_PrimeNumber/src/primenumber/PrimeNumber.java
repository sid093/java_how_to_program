/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package primenumber;

import java.util.Scanner;

/**
 *
 * @author sid
 */
public class PrimeNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number;
        System.out.print("Enter number to check: ");
        while(in.hasNextInt())
        {
            number = in.nextInt();
            System.out.println("Number is" + (math.checkPrime(number) ? "":" not") + " a prime");
            System.out.print("Enter number to check: ");
        }
            // TODO code application logic here
    }
    
}
