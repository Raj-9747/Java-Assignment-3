/*  Id   : 21CE027
    Name : Fachara Raj 
    Aim  : Write a program that illustrates the significance of interface default method.   
 */
interface A {
    public void Details();

    default void Address() {
        System.out.println(
                "Address :-\n'Shreej App.', Block No.-601,\nHari Om Nagar,\nMavdi Road,\nRajkot - 362001.");
    }
}

public class Prac_7_Interface implements A {
    public void Details() {
        System.out.println("Details:-");
        System.out.println("Name : Fachara Raj");
        System.out.println("ID No. : 21CE027");
        System.out.println("Collage name : CSPIT");
        System.out.println("Branch : Computer Engineering");
        System.out.println("Current Sem. : 3");
    }

 public static void main(String []args)
 {
 Prac_7_Interface p1=new Prac_7_Interface();
 p1.Details();
 p1.Address();
 }
}
