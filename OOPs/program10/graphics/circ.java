package graphics;
import java.util.*;

public class circ implements shape {
    double r, a, p;
    Scanner sc = new Scanner(System.in);

    public void getter() {
        System.out.println("Enter the radius of circle:");
        r = sc.nextDouble();
    }

    public void perimeter() {
        p = 2 * 3.14 * r;
        System.out.println("Perimeter: " + p);
    }

    public void area() {
        a = 3.14 * r * r;
        System.out.println("Area: " + a);
    }
}
