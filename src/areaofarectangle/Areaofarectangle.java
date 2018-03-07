/*
 * Nick Dernovsek
 * areaofarectangle.java
 * This program will determine the area of a rectangle that 
 * is 5.7 by 4.8 units.
 */
package areaofarectangle;

/**
 *
 * @author nickd
 */
public class Areaofarectangle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double length = 5.7;
        double width = 4.8;
        double area = 0.0;
        //variables for the length and the width of the rectangle
        
        area = length*width;
        System.out.println ("The area for this rectangle is " +area + " meters.");
    }
    
}
