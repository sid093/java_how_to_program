/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package generic;

/**
 *
 * @author sid
 */
public class GenericTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(Generic.isEqualTo(1, 10)); //isEqualTo works for primative
        System.out.println(Generic.isEqualTo(1, 1));
        System.out.println(Generic.isEqualTo('a','a')); 
        
        Pair p1 = new Pair(1,"Pair 1");
        System.out.println(p1);
        
        Pair p2 = new Pair(1,"Pair 1");
        System.out.println(p2);
        
        Pair p3 = new Pair(2.5,'a');
        System.out.println(p3);
        
        Pair p4 = new Pair(2.5,'b');
        System.out.println(p4);
        
        System.out.println(Generic.isEqualTo(p1, p2));
        System.out.println(Generic.isEqualTo(p3, p4));
    }
    
}
