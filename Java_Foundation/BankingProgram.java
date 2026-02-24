import java.util.Scanner;

public class BankingProgram {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // declare the variable
        double balance = 0;
        int choice;
        boolean isWorking = true;

        while (isWorking) {
            // display a menu
            System.out.println("***************");
            System.out.println("Banking Program");
            System.out.println("***************");
            System.out.println("Menu");
            System.out.println("1: Check Balance");
            System.out.println("2: Deposit");
            System.out.println("3: Withdraw");
            System.out.println("4: Exit Program");
            System.out.println("***************");
            System.out.print("Select Option: ");
            int option = scanner.nextInt();
            System.out.println("***************");

            // Get and Process users choice
            switch (option) {
                case 1 -> showBalance(balance);
                case 2 -> balance += deposit();
                case 3 -> balance -= withDraw(balance);
                case 4 -> {
                    exitMessage();
                    isWorking = false;
                }
                default -> System.out.println("INVALID RESPONSE");
            }
        }
    }

    // showBalance()
    static void showBalance(double balance) {
        System.out.printf("$%.2f\n", balance);
    }

    // deposit() amount can't be negative
    static double deposit() {
        System.out.print("Enter the amount to deposit: ");
        double amount = scanner.nextDouble();
        if (amount <= 0) {
            System.out.println("***************");
            System.out.println("Amount can't be negative or zero");
            return 0;
        } else {
            return amount;
        }
    }

    // withdraw()
    static double withDraw(double balance) {
        System.out.print("Enter the amount to withdrawn: ");
        double amount = scanner.nextDouble();
        if (amount > balance) {
            System.out.println("***************");
            System.out.println("Insufficient Balance");
            return 0;
        } else if (amount <= 0) {
            System.out.println("***************");
            System.out.println("Amount can't be zero or negative");
            return 0;
        } else {
            return amount;
        }

    }

    // exit message
    static void exitMessage() {

        System.out.println("Thankyou for using the Service");
        System.out.println("Hope you liked it!");
    }

}
