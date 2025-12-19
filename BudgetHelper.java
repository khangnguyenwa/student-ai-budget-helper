import java.util.Scanner;

public class BudgetHelper {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double totalSpending = 0;

        System.out.println("Welcome to Student AI Budget Helper!");
        System.out.print("How many expenses do you want to enter? ");
        int numberOfExpenses = scanner.nextInt();

        for (int i = 1; i <= numberOfExpenses; i++) {
            System.out.print("Enter expense amount #" + i + ": $");
            double expense = scanner.nextDouble();
            totalSpending += expense;
        }

        System.out.println("\nTotal spending: $" + totalSpending);

        System.out.println("\nAI Budget Advice:");
        if (totalSpending > 500) {
            System.out.println("- You are spending a large amount this month.");
            System.out.println("- Consider reducing eating out and tracking daily expenses.");
        } else {
            System.out.println("- Your spending is within a reasonable range.");
            System.out.println("- Keep monitoring your budget to maintain good habits.");
        }

        scanner.close();
    }
}
