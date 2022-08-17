/*   Id   : 21CE027
     Name : Fachara Raj
     Aim  : Create an abstract class GeometricObject as the superclass for Circle and Rectangle. GeometricObject models common features of geometric objects. Both Circle and Rectangle contain the getArea() and getPerimeter() methods for computing the area and perimeter of a circle and a rectangle. Since you can compute areas and perimeters for all geometric objects, so define the getArea() and getPerimeter() methods in the GeometricObject class. Give implementation in the specific type of geometric object. Create TestGeometricObject class to display area and perimeter of Rectangle and Triangle, compare area of both and display results. Design of all classes are given in the following UML diagram.  
 
 */

import java.util.Date;

public abstract class Prac_1_GeometricObject {
    String color;
    boolean filled;
    Date dateCreated;

    protected Prac_1_GeometricObject() {
    }

    public Prac_1_GeometricObject(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    abstract public double getArea();

    abstract public double getPerimeter();
}

class Circle extends Prac_1_GeometricObject {
    double radius;

    public Circle() {
        radius = 0;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getDiameter() {
        return 2 * radius;
    }

    public double getArea() {
        return (radius * radius * 3.14);
    }

    public double getPerimeter() {
        return (2 * 3.14 * radius);
    }
}

class Rectangle extends Prac_1_GeometricObject {
    double width;
    double height;

    public Rectangle() {
        width = 0;
        height = 0;
    }

    public Rectangle(String color, boolean filled, double width, double height) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getArea() {
        return (height * width);
    }

    public double getPerimeter() {
        return (2 * (height + width));
    }
}
