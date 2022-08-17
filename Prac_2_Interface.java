/*    ID   : 21CE027
      Name : Fachara Raj
      Aim  : Write a program to create a default method in an interface IPrinter. Create an interface IPrinter and IScanner. You can assume variables and methods for both interfaces. Create a concrete class to implement both the interfaces. Create 5 objects of the class, store it in Vector and display the result of the vector.   
 */
interface Prac_2_Interface {
    public int x = 7;

    void display1();

    default void show1() {
        System.out.println("This is default in interface");
    }
}

interface Iscanner {
    public int y = 7;

    void display2();

    default void show2() {
        System.out.println("This is default in interface");
    }
}

class Concrete implements Prac_2_Interface, Iscanner {
    public void display1() {
        System.out.println("Display1");
    }

    public void display2() {
        System.out.println("Display2");
    }

    
}
