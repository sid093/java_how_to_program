/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package carbonfootprintinterface;

/**
 *
 * @author sid
 */
public interface CarbonFootprint {
    public float getCarbonFootprint();
}

class Building implements CarbonFootprint {
    private int numberOfPeople;
    private String name;
    private float powerUnitsConsumed;
    
    public Building(String title, int people, float power)
    {
        numberOfPeople = people;
        name = title;
        powerUnitsConsumed = power;
    }
    
    @Override
    public float getCarbonFootprint()
    {
        return (float)(powerUnitsConsumed * 0.67 + numberOfPeople * 0.007);
    }
    
    @Override
    public String toString()
    {
        return "Building " + name + " with " + numberOfPeople + " people consumed " + powerUnitsConsumed + " units of power";
    }
    
}

class Bicycle implements CarbonFootprint {
    private String make;
    private float distance;
    
    public Bicycle(String name, float travelled)
    {
        make = name;
        distance = travelled;
    }
    
    @Override
    public float getCarbonFootprint()
    {
        return (float)(distance * 0.0003);
    }
    
    @Override
    public String toString()
    {
        return "Bicycle of make: " + make + " travelled:  " + distance + " kms";
    }
    
}

class Car implements CarbonFootprint {
    private String make;
    private float mileage;
    
    public Car(String name, float km)
    {
        make = name;
        mileage = km;
    }
    
    @Override
    public String toString()
    {
        return "Car of make: " + make + " with mileage: " + mileage + " kms";
    }
    
    @Override
    public float getCarbonFootprint()
    {
        return (float)(mileage * 0.037);
    }
}