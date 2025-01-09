import java.util.Random;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Main {
    // public static void main(String[] args) {
    // double x = 32.64;
    // double y = 22;
    // double z;
    // z = Math.round(x);
    // System.out.println(z);
    // }

    // Right angle triangle
    // public static void main(String[] args) {
    // double a;
    // double b;
    // double c;
    // Scanner sc = new Scanner(System.in);
    // System.out.println("Enter side a : ");
    // a = sc.nextDouble();
    // System.out.println("Enter side a : ");
    // b = sc.nextDouble();

    // c = Math.sqrt((a * a) + (b * b));

    // System.out.println("Area of Right Angle Triangle : " + c);
    // sc.close();
    // }

    // Generate random numbers
    public static void main(String[] args) {
        Random random = new Random();

        // int x = random.nextInt(6) + 1;
        // System.out.println(x);
        // JOptionPane.showMessageDialog(null, "Random number is : " + x);
        double y = random.nextDouble();
        JOptionPane.showMessageDialog(null, "Random number is : " + y);
    }
}