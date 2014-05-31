/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package generic;

import java.util.Objects;

/**
 *
 * @author sid
 * @param <F>
 * @param <S>
 */
public class Pair<F extends Comparable<F>,S> implements Comparable<F> {
    private F first; // compare based on first
    private S second;
    private int id;
    static int count = 0;
    
    Pair(F x, S y)
    {
        id = count++;
        set(x,y);
    }
    
    public void set(F x, S y)
    {
        first = x;
        second = y;        
    }
    
    public F getFirst()
    {
        return first;
    }
    
    public S getSecond()
    {
        return second;
    }
    
    public int getId()
    {
        return id;
    }
    
    @Override
    public int compareTo(F other) {
        return first.compareTo(other);
    }
    
    @Override
    public String toString()
    {
        return "First: " + first + " Second: " + second;
    }
    
    @Override
    public boolean equals(Object other){
    if (other instanceof Pair<?,?>)
        if (((Pair<?,?>)other).first.equals(first) && (((Pair<?,?>)other).second.equals(second)))
            return true;
    return false;
}

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.first);
        hash = 53 * hash + Objects.hashCode(this.second);
        return hash;
    }
}
