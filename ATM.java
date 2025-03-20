import java.util.Scanner;

// Abstract class representing an ATM
abstract class ATM {
    double balance;  // Initial Balance
    
    ATM(double balance) { // Constructor
        this.balance = balance;
    }
    
    abstract void withDraw(double amount);
    abstract void deposit(double amount);
    abstract void checkBalance();
} 

// SBI Bank ATM extending ATM class
class SBI extends ATM {
    
    SBI(double balance) {
        super(balance);         
    }
    
    // Withdraw method
    @Override
    void withDraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("WITHDRAW SUCCESS: Available Balance: " + balance);
        } else {
            System.out.println("Withdrawal Failed: Insufficient balance");
        }
    }

    // Deposit method
    @Override
    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("DEPOSIT SUCCESS: Available Balance: " + balance);
        } else {
            System.out.println("Deposit Failed: Invalid amount");
        }
    }

    // Check balance method
    @Override
    void checkBalance() {
        System.out.println("Current Balance: " + balance);
    }
}

// Main class to test the ATM functionality
class Main_ATM {
    public static void main(String[] args) {
        SBI obj = new SBI(100000); // Initializing ATM with Rs.100000
        Scanner s = new Scanner(System.in);
        
        while (true) {
            System.out.println("\n=== ATM MENU ===");
            System.out.println("==================");
            System.out.println("1. Withdraw Money");
            System.out.println("2. Deposit Money");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter Your Choice: ");
            
            int choice = s.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.print("Enter Amount to Withdraw: ");
                    double with_amt = s.nextDouble();
                    obj.withDraw(with_amt);
                    break;
                
                case 2:
                    System.out.print("Enter Amount to Deposit: ");
                    double dep_amt = s.nextDouble();
                    obj.deposit(dep_amt);
                    break;
                
                case 3:
                    obj.checkBalance();
                    break;
                
                case 4:
                    System.out.println("Thank You! Visit Again...");
                    s.close(); // Close Scanner
                    System.exit(0);
                    
                default:
                    System.out.println("Invalid Option! Please Enter a Valid Choice.");
            }
        }
    }
}
