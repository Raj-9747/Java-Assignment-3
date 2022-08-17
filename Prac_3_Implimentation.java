/*   ID   : 21CE027
     Name : Fachara Raj
     Aim  : WAP that illustrate the interface inheritance. Interface P is extended by P1 and P2 interface. 
            Interface p12 extends both P1 and P2. Each interface declares one method and one constant. Create one class that implements P12. By using the object of the class invokes each of its method and displays constant. 

 */
interface p {
    final int p = 10;

    void display_1();
}

interface p1 extends p {
    final int p1 = 100;

    void display_2();
}

interface p2 extends p {
    final int p2 = 200;

    void display_3();
}

interface p12 extends p1, p2 {
    final int p12 = 300;

    void display_4();
}

public class Prac_3_Implimentation implements p12 {

    public void display_1() {
        System.out.println("Interface p " + p);
    }

    public void display_2() {
        System.out.println("Interface p1 " + p1);
    }

    public void display_3() {
        System.out.println("Interface p2 " + p2);
    }

    public void display_4() {
        System.out.println("Interface p12 " + p12);
    }
}
