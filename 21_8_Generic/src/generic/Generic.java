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
public class Generic {
    public static <T extends Comparable<T>> boolean isEqualTo(T first, T second)
    {
        return first.equals(second);
    }
}
