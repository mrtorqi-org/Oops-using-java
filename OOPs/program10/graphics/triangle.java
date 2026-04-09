package graphics;
import java.util.*;

public class triangle implements shape {
    double a, b, c, h, p, areaVal;
    Scanner sc = new Scanner(System.in);

    public void getter() {
        System.out.println("Enter the base of triangle:");
        b = sc.nextDouble();
        System.out.println("Enter the height of triangle:");
        h = sc.nextDouble();
        System.out.println("Enter the first side of triangle:");
        a = sc.nextDouble();
        System.out.println("Enter the second side of triangle:");
        c = sc.nextDouble();
    }

    public void perimeter() {
        p = a + b + c;
        System.out.println("Perimeter: " + p);
    }

    public void area() {
        areaVal = 0.5 * b * h;
        System.out.println("Area: " + areaVal);
    }
}
