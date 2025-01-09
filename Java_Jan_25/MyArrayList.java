import java.util.ArrayList;
import java.util.Scanner;

public class MyArrayList {
    public static void main(String[] args) {
        ArrayList<String> food = new ArrayList<>(5);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your food items");
        for(int i = 0; i < 5; i++) {
            food.add(sc.next());
        }
        System.out.println("Your food list is : ");
        for(int i =
            0; i < food.size(); i++) {
            System.out.println(food.get(i));
        }
    }
}
