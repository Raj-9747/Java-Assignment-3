/*  Id   : 21CE027
    Name : Fachara Raj
    Aim  : Develop a program that illustrate method overriding concept.
 */
public class Prac_4_Overriding {
        void eat()
        {
        System.out.println("Animal is eating.");
        }
}      

class Dog extends Prac_4_Overriding 
{
        void eat()
        {
        System.out.println("Dog is eating bone.");
        }
}

