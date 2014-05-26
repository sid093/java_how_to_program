/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package shapeinheritancetest;

/**
 *
 * @author sid
 */
abstract public class Shape {
    private String name;
    private float area;
    private static int count = 0;
    
    public Shape(String nameOfObject)
    {
        name = nameOfObject;
        count++;
    }
    
    public float getArea()
    {
        return area;
    }
    
    public void setArea(float value)
    {
        area = value;
    }
    
    public static int getCount()
    {
        return count;
    }
    
    @Override
    abstract public String toString();
    
    abstract public void calculateArea();
}

abstract class twoDimensional extends Shape {
    private static int count = 0;
    
    public twoDimensional(String nameOfObject)
    {
        super(nameOfObject);
        twoDimensional.count++;
    }
    
    public static int getCount() //explicit override, works with Shape.count, Desired functionality
    {
        return count;
    }
}

abstract class threeDimensional extends Shape {
    private float volume;
    private static int count = 0;//attempt to override static count variable fails, no override of getCount()
    
    public threeDimensional(String nameOfObject)
    {
        super(nameOfObject);
        threeDimensional.count++;
    }
    
    public float getVolume()
    {
        return volume;
    }
    
    public void setVolume(float value)
    {
        volume = value;
    }
    
    abstract public void calculateVolume();
}

class Rectangle extends twoDimensional {
    private int length;
    private int width;
    private static int count = 0;
    
    public Rectangle(String nameOfObject, int len, int wid)
    {
        super(nameOfObject);
        length = len;
        width = wid;
        calculateArea();
        Rectangle.count++;
    }
    
    @Override
    public void calculateArea()
    {
        setArea(length * width);
    }
    
    @Override
    public String toString()
    {
        return "Rectangle of length: " + length + " width: " + width + " Area: " + getArea();
    }
    
    public static int getCount()//explicit override, works with Rectangle.count, Desired functionality
    {
        return count;
    }
}

class Square extends twoDimensional {
    private int side;
    private static int count = 0; ////explicit override
    
    public Square(String nameOfObject, int x)
    {
        super(nameOfObject);
        side = x;
        calculateArea();
        count++;
    }
    
    @Override
    public void calculateArea()
    {
        setArea(side*side);
    }
    
    @Override
    public String toString()
    {
        return "Square of side: " + side + " Area: " + getArea();
    }
    
    public static int getCount()//explicit override, works with Square.count, Desired functionality
    {
        return count;
    }
}

class Cube extends threeDimensional {
    private int side;
    private static int count = 0;
    
    public Cube(String nameOfObject, int x)
    {
        super(nameOfObject);
        side = x;
        calculateArea();
        calculateVolume();
        Cube.count++;
    }
    
    @Override
    public void calculateArea()
    {
        setArea(6*side*side);
    }
    
    @Override
    public void calculateVolume()
    {
        setVolume(side*side*side);
    }
    
    @Override
    public String toString()
    {
        return "Cube of side: " + side + " Area: " + getArea() + " Volume: " + getVolume();
    }
    
}

class Sphere extends threeDimensional {
    private int radius;
    private static int count = 0;
    
    public Sphere(String nameOfObject, int x)
    {
        super(nameOfObject);
        radius = x;
        calculateArea();
        calculateVolume();
        Sphere.count++;
    }
    
    @Override
    public void calculateArea()
    {
        setArea((float)(4*Math.PI*radius*radius));
    }
    
    @Override
    public void calculateVolume()
    {
        setVolume((float)((4*Math.PI*radius*radius*radius)/3));
    }
    
    @Override
    public String toString()
    {
        return "Sphere of radius: " + radius + " Area: " + getArea() + " Volume: " + getVolume();
    }
    
}