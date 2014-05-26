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
public class ShapeInheritanceTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {        Sphere s = new Sphere("sphere1", 5);
        Cube c = new Cube("cube1", 4);
        Square sq = new Square("square1", 3);
        Rectangle r = new Rectangle("rectangle1", 3, 4);
        System.out.println(s);
        System.out.println(c);
        System.out.println(sq);
        System.out.println(r);
        System.out.println("Number of Squares: " + Square.getCount());
        System.out.println("Number of Rectangles: " + Rectangle.getCount());
        System.out.println("Number of 2-Dimensionals: " + twoDimensional.getCount());
        System.out.println("Number of 3-Dimensionals: " + threeDimensional.getCount());
        System.out.println("Number of Spheres: " + Sphere.getCount());
        System.out.println("Number of Shapes: " + Shape.getCount());
        // TODO code application logic here
    }
    
}
