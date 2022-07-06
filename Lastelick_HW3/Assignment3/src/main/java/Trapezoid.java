/*
 * class Trapezoid shares an is-a relationship with class Quadrilateral. 
 * This class creates a geometric trapezoid when given an object of class Point,
 * which represents the 4 sets of x,y coordinates x1,y1 .. x4,y4. And also given
 * the left leg (leg1), the right leg (leg2), the bottom side (base1), the top 
 * side (base2) and the height. 
 * This class also returns the area of a trapezoid.
 *
 * Trapezoid(Point coords, double leg1, double leg2, double base1, double base2,
 * double height) - Initializes all parameters to superclass mv's. 
 * double area() - returns the formula to find area of a trapezoid.

/**
 *
 * @Trevor Lastelick 
 */
public class Trapezoid extends Quadrilateral{
    
    /**
     * Initializes all the parameters with their corresponding super mv's 
     * @param coordinates represents 4 sets of x,y coordinates on a plane 
     * @param leg1 Represents the left side of a shape
     * @param leg2 Represents the right side of a shape
     * @param base1 Represents the bottom side of a shape
     * @param base2 Represents the top side of a shape
     * @param height Is the height of the quadrilateral 
     */
    public Trapezoid(Point coords, double leg1, double leg2, double base1, 
            double base2, double height) 
    {
        super(coords, leg1, leg2, base1, base2, height);
    }
    
    /**
     * Returns the area specific to a trapezoid given both bases and the height
     * @return The formula for the area of a trapezoid 
     */
    public double area()
    {
         return (super.getBase1()+super.getBase2())*super.getHeight()/2;
    }
    
}
