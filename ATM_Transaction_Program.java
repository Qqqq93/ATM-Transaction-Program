import java.util.Scanner;

public class ATMProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double accountBalance = 1000.0; // Initial account balance

        while (true) {
            System.out.println("ATM Menu:");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Account Balance: $" + accountBalance);
                    break;
                case 2:
                    System.out.print("Enter the deposit amount: $");
                    double depositAmount = scanner.nextDouble();
                    if (depositAmount > 0) {
                        accountBalance += depositAmount;
                        System.out.println("Deposit successful. New balance: $" + accountBalance);
                    } else {
                        System.out.println("Invalid deposit amount.");
                    }
                    break;
                case 3:
                    System.out.print("Enter the withdrawal amount: $");
                    double withdrawalAmount = scanner.nextDouble();
                    if (withdrawalAmount > 0 && withdrawalAmount <= accountBalance) {
                        accountBalance -= withdrawalAmount;
                        System.out.println("Withdrawal successful. New balance: $" + accountBalance);
                    } else {
                        System.out.println("Invalid withdrawal amount or insufficient funds.");
                    }
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        }
    }
}
