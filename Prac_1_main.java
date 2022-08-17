/*   Id   : 21CE027
     Name : Fachara Raj
     Aim  : Create an abstract class GeometricObject as the superclass for Circle and Rectangle. GeometricObject models common features of geometric objects. Both Circle and Rectangle contain the getArea() and getPerimeter() methods for computing the area and perimeter of a circle and a rectangle. Since you can compute areas and perimeters for all geometric objects, so define the getArea() and getPerimeter() methods in the GeometricObject class. Give implementation in the specific type of geometric object. Create TestGeometricObject class to display area and perimeter of Rectangle and Triangle, compare area of both and display results. Design of all classes are given in the following UML diagram.  
 
*/

import java.util.Scanner; 
 
public class Prac_1_main
{ 
    public static void main(String[] args) { 
 
        Circle c = new Circle("Red",true, 2.5); 
        Rectangle r = new Rectangle("Green",true,5,3); 
 
        System.out.println("Area of circle : "+c.getArea()); 
        System.out.println("Perimeter of circle : "+c.getPerimeter()); 
        System.out.println("Diameter of Circle : "+c.getDiameter());  
        System.out.println("\nArea of Rectangle : "+r.getArea()); 
        System.out.println("Perimeter of Rectangle : "+r.getPerimeter()); 
 
    } 
}

    

