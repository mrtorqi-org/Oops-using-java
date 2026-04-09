import java.util.*;
import graphics.*;

public class shapes {
    public static void main(String args[]) {
        int ch, wish;
        Scanner sc = new Scanner(System.in);

        circ cir = new circ();
        rect rec = new rect();
        square sq = new square();
        triangle tri = new triangle();

        do {
            System.out.println("1.Circle\n2.Square\n3.Triangle\n4.Rectangle\n");
            System.out.println("Enter your choice:");
            ch = sc.nextInt();

            switch (ch) {
                case 1:
                    cir.getter();
                    System.out.println("Area of circle:");
                    cir.area();
                    System.out.println("Perimeter of circle:");
                    cir.perimeter();
                    break;
                case 2:
                    sq.getter();
                    System.out.println("Area of square:");
                    sq.area();
                    System.out.println("Perimeter of square:");
                    sq.perimeter();
                    break;
                case 3:
                    tri.getter();
                    System.out.println("Area of triangle:");
                    tri.area();
                    System.out.println("Perimeter of triangle:");
                    tri.perimeter();
                    break;
                case 4:
                    rec.getter();
                    System.out.println("Area of rectangle:");
                    rec.area();
                    System.out.println("Perimeter of rectangle:");
                    rec.perimeter();
                    break;
                default:
                    System.out.println("Invalid Choice");
            }

            System.out.println("Do you wish to continue (1/0)?");
            wish = sc.nextInt();
        } while (wish == 1);
    }
}
