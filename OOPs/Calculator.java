import java.awt.*;
import java.awt.event.*;

public class Calculator extends Frame {
    TextField t1, t2, t3;
    Label l1, l2, l3;
    Button b1, b2, b3, b4, b5, b6;

    Calculator() {
        setTitle("CALCULATOR");
        setLayout(null); // Set layout FIRST

        t1 = new TextField();
        l1 = new Label("Enter 1st No");
        l1.setBounds(100, 45, 145, 20);
        t1.setBounds(100, 75, 145, 20);

        t2 = new TextField();
        l2 = new Label("Enter 2nd No");
        l2.setBounds(100, 110, 145, 20);
        t2.setBounds(100, 145, 145, 20);

        t3 = new TextField();
        l3 = new Label("Result");
        l3.setBounds(100, 170, 145, 20);
        t3.setBounds(100, 195, 145, 20);

        b1 = new Button("+");
        b1.setBounds(65, 230, 80, 40);
        b2 = new Button("-");
        b2.setBounds(155, 230, 80, 40);
        b3 = new Button("*");
        b3.setBounds(245, 230, 80, 40);

        b4 = new Button("/");
        b4.setBounds(95, 280, 80, 40);
        b5 = new Button("%");
        b5.setBounds(195, 280, 80, 40);
        b6 = new Button("EXIT");
        b6.setBounds(140, 330, 70, 40);

        add(b1); add(b2); add(b3);
        add(b4); add(b5); add(b6);
        add(l1); add(t1);
        add(l2); add(t2);
        add(l3); add(t3);

        setSize(400, 420);
        setVisible(true);

        // ADD
        b1.addActionListener(e -> {
            int a = Integer.parseInt(t1.getText());
            int b = Integer.parseInt(t2.getText());
            t3.setText(String.valueOf(a + b));
        });

        // SUBTRACT
        b2.addActionListener(e -> {
            int a = Integer.parseInt(t1.getText());
            int b = Integer.parseInt(t2.getText());
            t3.setText(String.valueOf(a - b));
        });

        // MULTIPLY
        b3.addActionListener(e -> {
            int a = Integer.parseInt(t1.getText());
            int b = Integer.parseInt(t2.getText());
            t3.setText(String.valueOf(a * b));
        });

        // DIVIDE
        b4.addActionListener(e -> {
            try {
                int a = Integer.parseInt(t1.getText());
                int b = Integer.parseInt(t2.getText());
                t3.setText(String.valueOf(a / b));
            } catch (ArithmeticException ex) {
                t3.setText("Cannot divide by zero");
            }
        });

        // MODULUS
        b5.addActionListener(e -> {
            try {
                int a = Integer.parseInt(t1.getText());
                int b = Integer.parseInt(t2.getText());
                t3.setText(String.valueOf(a % b));
            } catch (ArithmeticException ex) {
                t3.setText("Error");
            }
        });

        // EXIT
        b6.addActionListener(e -> System.exit(0));
    }

    public static void main(String[] args) {
        new Calculator();
    }
}