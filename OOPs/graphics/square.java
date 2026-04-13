package graphics;
import java.util.*;

public class square implements shape {
    int s, a, p;
    Scanner sc = new Scanner(System.in);

    public void getter() {
        System.out.println("Enter the length of square:");
        s = sc.nextInt();
    }

    public void perimeter() {
        p = 4 * s;
        System.out.println("Perimeter: " + p);
    }

    public void area() {
        a = s * s;
        System.out.println("Area: " + a);
    }
}
