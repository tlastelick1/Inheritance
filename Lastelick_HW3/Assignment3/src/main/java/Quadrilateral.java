/*
 * This class creates a geometric quadrilateral when given an object of class Point,
 * which represents the 4 sets of x,y coordinates x1,y1 .. x4,y4. And also given
 * the left leg (leg1), the right leg (leg2), the bottom side (base1), the top 
 * side (base2) and the height. 
 * It can find the distance between two sets of points.
 * It can find the height of a quadrilateral.
 *
 * Quadrilateral(Point coordinates) assigns mv coordinates to all mv's 
 * of class Point.
 * double findDistance(double x2, double y2, double x1, double y1) - Returns the 
 * distance (in units) of two sets of points.
 * double findHeight(double leg1, double leg2, double base1, double base2) - 
 * Returns the height of a quadrilateral (in units) given both its bases and legs. 
 * GETTERS - each getter simply returns its cooresponding private mv. 
 */

/**
 *
 * @author Trevor Lastelick 
 */
import java.lang.Math;
public class Quadrilateral {
    private Point coordinates; // composition
    private double leg1;    // left side of geometric shape
    private double leg2;    // right side of geometric shape
    private double base1;   // bottom base (side) of a geometric shape
    private double base2;   // top base (side) of a geometric shape 
    private double height;  // height of a geometric shape 
    
    //*****************
    // **** I created these mv's as doubles originally because of the 
    // **** mathematical functions I used in some of the methods. I decided
    // **** to leave them as doubles because it makes more sense that perfect
    // **** shapes won't always be given and the level of percision might 
    // **** need to be very precise (many decimals). 
    /******************
     
    
    /**
     * Mv coordinates will equal all mv's of parameter coordinates
     * @param coordinates Has-a relationship with class Point
     * @param leg1 Represents the left side of a shape
     * @param leg2 Represents the right side of a shape
     * @param base1 Represents the bottom side of a shape
     * @param base2 Represents the top side of a shape
     * @param height Is the height of the quadrilateral 
     */
    public Quadrilateral(Point coordinates, double leg1,
            double leg2, double base1, double base2, double height)
    {
        this.coordinates = coordinates; 
        this.height = height;
        this.leg1 = leg1;
        this.leg2 = leg2;
        this.base1 = base1;
        this.base2 = base2;
    }
    
    /**
     * Takes two sets of x,y coordinates as parameters and returns the length
     * of them in units 
     * @param x2 An x coordinate on a mathematical plane
     * @param y2 A y coordinate on a mathematical plane
     * @param x1 An x coordinate on a mathematical plane
     * @param y1 A y coordinate on a mathematical plane 
     * @return The distance between two sets of coordinates 
     */
    double findDistance(double x2, double y2, double x1, double y1)
    {
        return  Math.sqrt(Math.pow((x2-x1), 2.0) + Math.pow((y2-y1), 2.0));   
    }
     
    /**
     * Formula to find the height of a quadrilateral given both legs and bases
     * @param leg1 Left side of a quadrilateral
     * @param leg2 Right side of a quadrilateral 
     * @param base1 Top base of a quadrilateral 
     * @param base2 Bottom base of a quadrilateral
     * @return The height of the quadrilateral 
     */
    double findHeight(double leg1, double leg2, double base1, double base2)
    {
        double top = 0.00; // temp variable used to break down formula
        double bottom = 0.00; // temp variable used to break down formula
        double middle = 0.00; // temp variable used to break down formula
        // Computations of formula
        top = Math.pow(this.base2-this.base1, 2.0) + Math.pow(this.leg1, 2.0)
                - Math.pow(this.leg2, 2.0);
        //top = Math.pow(base2-base1, 2.0) + Math.pow(leg1, 2.0) - Math.pow(leg2, 2.0);
        bottom = 2*(this.base2-this.base1);
        middle = Math.pow(this.leg1, 2.0) - Math.pow((top/bottom), 2.0);
        return Math.sqrt(middle);
    }

    // GETTERS
    double getLeg1()
    {
        return leg1;
    }
    
    double getLeg2()
    {
        return leg2;
    }
    
    double getBase1()
    {
        return base1;
    }
    
    double getBase2()
    {
        return base2;
    }

    double getHeight()
    {
        return height;
    }

}
