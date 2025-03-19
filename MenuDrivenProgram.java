import java.util.Scanner;

public class MenuDrivenProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        while (true) {
            displayMenu();
            System.out.print("Enter your choice (1-3): ");
            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
                if (choice == 3) {
                    System.out.println("Exiting program. Goodbye!");
                    break;
                }
                handleMenuChoice(choice);
            } else {
                System.out.println("Invalid choice. Please enter a number between 1 and 3.");
                scanner.next();
            }
        }
        scanner.close();
    }

    public static void displayMenu() {
        System.out.println("Menu:");
        System.out.println("1. Greet User");
        System.out.println("2. Check Even/Odd");
        System.out.println("3. Exit");
    }

    public static void handleMenuChoice(int choice) {
        Scanner scanner = new Scanner(System.in);
        if (choice == 1) {
            greetUser();
        } else if (choice == 2) {
            checkEvenOrOdd();
        } else {
            System.out.println("Invalid choice. Please enter a number between 1 and 3.");
        }
    }

    public static void greetUser() {
        System.out.println("Hello! Welcome!");
    }

    public static void checkEvenOrOdd() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        if (scanner.hasNextInt()) {
            int num = scanner.nextInt();
            if (num % 2 == 0) {
                System.out.println(num + " is an Even number.");
            } else {
                System.out.println(num + " is an Odd number.");
            }
        } else {
            System.out.println("Invalid input. Please enter an integer.");
            scanner.next();
        }
    }
}