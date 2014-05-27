/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package primenumber;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 *
 * @author sid
 */
public class math {
    
    public static boolean checkPrime(int num)
    {
        SortedSet<Integer> primeFactors = new TreeSet <>();
        primeFactors.add(1);
        primeFactors.add(num);
        int index = 2;
        
        while(num > 1)
        {
            if(num % index == 0)
            {
                primeFactors.add(index); 
                num /= index;
            }
            else
            {
                index++;
            }
        }
        
        System.out.println("Unique factors are: " + primeFactors);
        return (primeFactors.size() <= 2);
    }
    
}
