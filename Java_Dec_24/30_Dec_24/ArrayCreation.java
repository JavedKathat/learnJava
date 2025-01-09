import java.util.Scanner;

public class ArrayCreation {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of elements in array :");
        n = sc.nextInt();
        int[] a = new int[n];
        System.out.print("Enter values :");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Element are : ");
        for (int i = 0; i < n; i++) {
            System.out.print(" | " + a[i]);
        }
        System.out.println(" |");
        sc.close();
    }
}
