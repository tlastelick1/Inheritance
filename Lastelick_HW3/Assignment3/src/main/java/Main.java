/*
 * This Main function uses class Point, class Trapezoid, class Parallelogram,
 * class Rectangle, Class Square.
 * It Initializes an object of every class.
 * It neatly displays the area of 1 trapezoid object, 1 rectangle object, 
 * 1 square object, 1 parallelogram object.
 */

/**
 *
 * @author Trevor Lastelick
 */
public class Main {
    public static void main(String[] args) {
        // Copy some points x,y coordinate sets from a mathematical plane
        Point coords = new Point(5,2,4,2,4,-3,5,-3);
        
        // Create Trapezoid t1 using coordinates givin to Point coords
        Trapezoid t1 = new Trapezoid(coords, 5, 8, 10, 9, 4);
        // Print area of Trapezoid t1
        System.out.printf("Area of a Trapezoid: %.2f\n", t1.area());
        
        // Create object of Rectangle r1
        Rectangle r1 = new Rectangle(coords, 5, 5, 8, 8, 3);
        // Print area of Rectangle r1
        System.out.printf("Area of a Rectangle: %.2f\n", r1.area());
        
        // Create object Square sq1
        Square sq1 = new Square(coords, 4, 4, 4, 4, 2);
        // Print area of Square sq1
        System.out.printf("Area of a Square: %.2f\n", sq1.area());
        
        // Create Parallelogram object p1
        Parallelogram p1 = new Parallelogram(coords, 2, 2, 4, 4, 8);
        // Print area of Parallelogram p1 
        System.out.printf("Area of a Parallelogram: %.2f\n", p1.area());
             
    } // end main
} // end class
