import java.util.Scanner;

public class BankAccount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // User inputs
        System.out.print("Enter account type (SAVINGS, CURRENT, PREMIUM): ");
        String accountType = scanner.nextLine().toUpperCase(); // Normalize input
        System.out.print("Enter account balance: ");
        double balance = scanner.nextDouble();
        System.out.print("Enter withdrawal amount: ");
        double withdrawalAmount = scanner.nextDouble();

        // 1. Basic if-else
        if (balance >= withdrawalAmount) {
            System.out.println("✅ Withdrawal approved.");
        } else {
            System.out.println("❌ Insufficient funds.");
        }

        // 2. if-else-if ladder to evaluate balance level
        if (balance >= 1_000_000) {
            System.out.println("🌟 You're a VIP client.");
        } else if (balance >= 100_000) {
            System.out.println("💼 You're eligible for a Premium account.");
        } else if (balance >= 10_000) {
            System.out.println("🟢 You're a Regular client.");
        } else {
            System.out.println("🔴 Consider depositing more to avoid fees.");
        }

        // 3. Nested if for more specific checks
        if (accountType.equals("SAVINGS")) {
            System.out.println("🔐 Savings account detected.");
            if (withdrawalAmount > 50_000) {
                System.out.println("⚠️ Withdrawal limit exceeded for Savings account.");
            }
        }

        // 4. switch for behavior based on account type
        switch (accountType) {
            case "SAVINGS":
                System.out.println("Interest rate: 4% per annum.");
                break;
            case "CURRENT":
                System.out.println("No interest, unlimited withdrawals.");
                break;
            case "PREMIUM":
                System.out.println("Premium benefits: lounge access, cashback.");
                break;
            default:
                System.out.println("❓ Unknown account type.");
        }

        scanner.close();
    }
}
