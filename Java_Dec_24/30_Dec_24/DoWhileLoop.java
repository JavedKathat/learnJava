import java.util.Scanner;
public class DoWhileLoop {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                double num1, num2;
                char operator;
                char continueChoice;

                do {
                    try {
                        // Display menu for operations
                        System.out.println("Choose an operation:");
                        System.out.println("1. Addition (+)");
                        System.out.println("2. Subtraction (-)");
                        System.out.println("3. Multiplication (*)");
                        System.out.println("4. Division (/)");
                        System.out.print("Enter your choice (+, -, *, /): ");
                        operator = scanner.next().charAt(0); // Read operator

                        // Prompt user to enter two numbers
                        System.out.print("Enter first number: ");
                        num1 = scanner.nextDouble();
                        System.out.print("Enter second number: ");
                        num2 = scanner.nextDouble();

                        // Perform the operation based on user's choice
                        switch (operator) {
                            case '+':
                                System.out.println("Result: " + (num1 + num2));
                                break;
                            case '-':
                                System.out.println("Result: " + (num1 - num2));
                                break;
                            case '*':
                                System.out.println("Result: " + (num1 * num2));
                                break;
                            case '/':
                                if (num2 == 0) {
                                    throw new ArithmeticException("Error: Division by zero is not allowed.");
                                } else {
                                    System.out.println("Result: " + (num1 / num2));
                                }
                                break;
                            default:
                                System.out.println("Invalid operator.");
                                break;
                        }
                    } catch (java.util.InputMismatchException e) {
                        System.out.println("Error: Invalid input! Please enter valid numbers.");
                        scanner.nextLine(); // Clear the buffer to prevent infinite loop on invalid input
                    } catch (ArithmeticException e) {
                        System.out.println(e.getMessage()); // Handle division by zero or other arithmetic issues
                    } catch (Exception e) {
                        System.out.println("An unexpected error occurred: " + e.getMessage());
                    }

                    // Ask if the user wants to continue
                    System.out.print("Do you want to perform another operation? (y/n): ");
                    continueChoice = scanner.next().charAt(0);

                } while (continueChoice == 'y' || continueChoice == 'Y');

                System.out.println("Thank you for using the calculator!");
                scanner.close();
    }
}
