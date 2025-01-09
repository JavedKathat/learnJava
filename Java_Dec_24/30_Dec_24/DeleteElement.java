import java.util.Scanner;

public class DeleteElement {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the size of Array : ");
//        int n = sc.nextInt();
//
//        int[] a = new int[n];
//        System.out.println("Insert the elements of array : ");
//        for (int i = 0; i < n; i++) {
//            a[i] = sc.nextInt();
//        }
//
//        System.out.println("Array is : ");
//        for (int i = 0; i < n; i++) {
//            System.out.print("| "+a[i]+ " ");
//        }
//        System.out.println("|");
//
//        int[] b= new int[n-1];
//
//        System.out.println("Enter the index to delete : ");
//        int idx = sc.nextInt();
//
//        for(int i = 0; i < n-1; i++) {
//            if(i < idx) {
//                b[i] = a[i];
//            }
//            else if(i >= idx){
//                b[i] = a[i+1];
//            }
//        }
//
//        System.out.println("After Delete "+a[idx]+ ", now, array is : ");
//        for(int i= 0; i < n-1; i++) {
//            System.out.print("| "+b[i]+" ");
//        }
//        System.out.println("|");
//    }

    public static void main(String[] args) {
        int n = 5;
        int[] a = new int[n];
        char continueChoice;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array: ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        do {
            System.out.println("Element to delete : ");
            int ed = sc.nextInt();
            int loc = -1;

            for(int i = 0; i < n; i++) {
                if(ed == a[i]) {
                    loc = i;
                }
            }

            for (int i = 0; i < n-1; i++) {
                if (i >= loc) {
                    a[i] = a[i+1];
                }
                if(i == n-2){
                    a[i+1] = 0;
                }
            }
//            n = n - 1;
            System.out.println("After Delete, now array is : ");
            for(int i= 0; i < n; i++) {
                System.out.print("| "+a[i]+" ");
            }
            System.out.println("|");

            System.out.print("Do you want to perform another operation? (y/n): ");
            continueChoice = sc.next().charAt(0);
        }while (continueChoice == 'y' || continueChoice == 'Y');

    }
}
