import java.util.Scanner;
 
 
/*
    Week 1 Comprehensive Program: Account Class
    Covers: Classes, Objects, Instance Variables, Constructors,
    Set/Get Methods, Reference Types, Constants, Methods,
    Abstract Class, Interface
*/
 
 
// ACCOUNT CLASS
 
class Account {
    // Instance variables (private for encapsulation)
    private String name;
    private double balance;

    // Constant: minimum balance
    private static final double MIN_BALANCE = 0.0;

    /**
     * Constructor to initialize Account object
     * @param name Account holder's name
     * @param balance Initial balance (must be >= 0)
     */
   
    Account(String name, double balance) {
        this.name = name;
        if (balance >= MIN_BALANCE) {
            this.balance = balance;
        } else {
            this.balance = MIN_BALANCE;
        }
    }
 
    
    // Set Methods (Mutators)
    
    void setName(String name) {
        this.name = name;
    }

    void setBalance(double balance) {
        if (balance >= MIN_BALANCE) {
            this.balance = balance;
        }
    }

    // Get Methods (Accessors)
    
    String getName() {
        return name;
    }

    double getBalance() {
        return balance;
    }

    // Display Info
    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Balance: " + balance);
    }

    // Method with parameter and return
    double deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
        return balance;
    }

}
    
  
 
// ABSTRACT CLASS EXAMPLE
 
abstract class AccountBase {
    // abstract method
    abstract double calculateInterest();
 //normal method
    void displayAccountType() {
        System.out.println("This is a base account.");
    }
    
}
 
 
class SavingsAccount extends AccountBase {
    private double balance;
    private double rate; // interest rate

    SavingsAccount(double balance, double rate) {
        this.balance = balance;
        this.rate = rate;
    }
    @Override
    double calculateInterest() {
        return balance * rate / 100;
    }
}
 
 
// INTERFACE EXAMPLE
 
interface Printable {
    void print();
}
 
 
class AccountReport implements Printable {
    private Account account;
 
 
    AccountReport(Account account) {
        this.account = account;
    }
 
 
    @Override
    public void print() {
        System.out.println("\n--- Account Report ---");
        account.displayInfo();
    }
}
 
 
// -------------------------
// MAIN CLASS
// -------------------------
public class Main {
    public static void main(String[] args) {
 
 
        System.out.println("==== Week 1: Account Class Demo ====");
 
        Scanner input = new Scanner(System.in);
       
        // 1. Creating Account Objects
        Account acc1 = new Account("Alice", 100);
        Account acc2 = new Account("Bob", 200);
        acc1.displayInfo();
        acc2.displayInfo();
        // 2. Using Set/Get Methods
        acc1.setName("Alice Wonderland");
        System.out.println(acc1.getName());
        // 3. Primitive vs Reference Types
        Account acc3 = acc1; // Reference type
        acc3.setBalance(500);
        // 4. Constants
        System.out.println("Account 1 Balance after update: " + acc1.getBalance());
        // 5. Methods with Parameters & Return Values
        double newBalance = acc2.deposit(1000);
        System.out.println("Account 2 New Balance after deposit: " + newBalance);
        // 6. Abstract Class
        SavingsAccount sa = new SavingsAccount(1200, 0.05);
        sa.displayAccountType();
        System.out.println("Interest on Savings Account: " + sa.calculateInterest());
        // 7. Interface
        AccountReport report = new AccountReport(acc1);
        report.print();
        // 8. Scanner Example (Optional User Input)
        System.err.println("\n--- Enter New Name for Acc2 ---");
        String newName = input.nextLine();
        acc2.setName(newName);
        acc2.displayInfo();
        input.close();
       
    }
}

 
