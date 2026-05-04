import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Welcome to Simple Bank ===");

        System.out.print("Enter account number: ");
        int accountNumber = scanner.nextInt();

        System.out.print("Enter PIN: ");
        int pin = scanner.nextInt();

        BankAccount account = bank.findAccount(accountNumber, pin);

        if (account != null) {
            System.out.println("Welcome, " + account.getName() + "!");
            bank.performTransaction(account);
        } else {
            System.out.println("Invalid account number or PIN.");
        }

        scanner.close();
    }
}