/*    ID   : 21CE027
      Name : Fachara Raj
      Aim  : Write a program to create a default method in an interface IPrinter. Create an interface IPrinter and IScanner. You can assume variables and methods for both interfaces. Create a concrete class to implement both the interfaces. Create 5 objects of the class, store it in Vector and display the result of the vector.   
 */

import java.util.Vector;

public class Prac_2_main 
{
    public static void main(String[] args) 
    {
        Vector<Concrete> obj = new Vector<Concrete>(5);
        Concrete c[] = new Concrete[5];
        for (int i = 0; i < 5; i++) {
            c[i] = new Concrete();
        }
        for (int i = 0; i < 5; i++) {
            obj.add(c[i]);
        }
        for (int i = 0; i < 5; i++) {
            obj.elementAt(i).show1();
            obj.elementAt(i).show2();
            obj.elementAt(i).display1();
            obj.elementAt(i).display2();
        }
    }
}
