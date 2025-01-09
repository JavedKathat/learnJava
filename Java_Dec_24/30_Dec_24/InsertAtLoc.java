import java.util.Scanner;

public class InsertAtLoc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array a : ");
        int n = sc.nextInt();

        System.out.println("Enter array a : ");
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Array a is : ");
        for(int x: a) {
            System.out.print("| "+x+" ");
        }
        System.out.println("|");

        System.out.println("Enter an element to insert");
        int val = sc.nextInt();

        System.out.println("Enter index location to insert : ");
        int loc = sc.nextInt();

        if(loc < 0 || loc >= n) {
            System.out.println("Please enter a valid index");
        }else {
            int[] b = new int[n+1];

            for (int i = 0, j = 0; i < n; i++, j++) {
//                if(i == loc) {
//                    b[j]= val;
//                    b[j+1] = a[i];
//                    ++j;
//                }else{
//                    b[j] = a[i];
//                }

                if(i == loc){
                    b[i] = val;
                    b[i+1]= a[i];
//                    ++i;
                }else {
                    b[i] = a[i];
                }
            }

            System.out.println("Array b is : ");
            for(int i = 0; i < n+1; i++) {
                System.out.print("| "+b[i]+" ");
            }
        }
    }
}
