package graphics;
import java.util.*;

public class rect implements shape {
    int l, b, p, a;
    Scanner sc = new Scanner(System.in);

    public void getter() {
        System.out.println("Enter the length of rectangle:");
        l = sc.nextInt();
        System.out.println("Enter the breadth of rectangle:");
        b = sc.nextInt();
    }

    public void perimeter() {
        p = 2 * (l + b);
        System.out.println("Perimeter: " + p);
    }

    public void area() {
        a = l * b;
        System.out.println("Area: " + a);
    }
}
