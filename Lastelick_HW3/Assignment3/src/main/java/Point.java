/*
 * class Point initializes four points on a mathematical plane. These points
 * are used to construct geometrical shapes. 
 * Point() - Default constructor sets all mv's to 0
 * Point(double x1, double y1, double x2, double y2, double x3, double y3, 
 * double x4, double y4) - Sets all parameters to their corresponding mv's 
 * (does not perform any validation).
 * // SETTERS - set each point (two coordinates as parameters)
 * void setPoint1(double x1, double y1) .. double setPoint4(double x4, double y4)
 * string toString() - Displays all the x and y coordinates
 */

/**
 *
 * @author Trevor Lastelick
 */
public class Point {
    private double x1; // first x coordinate point on a plane
    private double y1; // first y coordniate point on a plane
    private double x2; // second point x coordinate on a plane
    private double y2; // second point y coordinate on a plane
    private double x3; // third point x coordinate on a plane
    private double y3; // third point y coordinate on a plane
    private double x4; // fourth point x coordinate on a plane
    private double y4; // fourth point y coordinate on a plane 
    
    /**
     * Default constructor sets all mv's to 0
     */ 
    public Point()
    {
        this.x1 = 0;
        this.y1 = 0;
        this.x2 = 0;
        this.y2 = 0;
        this.x3 = 0;
        this.y3 = 0;
        this.x4 = 0;
        this.y4 = 0;
    }

    /**
     * Overloaded constructor sets all parameters to corresponding mv's 
     * @param x1 Coordinate 1 x value
     * @param y1 Coordinate 1 y value
     * @param x2 Coordinate 2 x value
     * @param y2 Coordinate 2 y value
     * @param x3 Coordinate 3 x value
     * @param y3 Coordinate 3 y value
     * @param x4 Coordinate 4 x value
     * @param y4 Coordinate 4 y value 
     */
    public Point(double x1, double y1, double x2, double y2, double x3, 
            double y3, double x4, double y4)
    {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;
        this.x4 = x4;
        this.y4 = y4;
    }

    // SETTERS
    public void setPoint1(double x1, double y1)
    {
        this.x1 = x1;
        this.y1 = y1;
    }
    
    public void setPoint2(double x2, double y2)
    {
        this.x2 = x2;
        this.y2 = y2;
    }
    
    public void setPoint3(double x3, double y3)
    {
        this.x3 = x3;
        this.y3 = y3;
    }
    
    public void setPoint4(double x4, double y4)
    {
        this.x4 = x4;
        this.y4 = y4;
    }
    
    /**
     * Displays all the x and y coordinates of this class 
     * @return A Display with all the x's and their corresponding y's grouped 
     * together in their respective points 
     */
   // @Override
   // public String toString()
   // {
   //     return String.format("\nx1: %.2f\ny1: %.2f\nx2: %.2f\ny2: %.2f\nx3: "
   //             + "%.2f\ny3: %.2f\nx4: %.2f\ny4: %.2f\n", this.x1, this.y1, 
   //             this.x2, this.y2, this.x3, this.y3, this.x4, this.y4);
   // }
    
} // end Point class
