package Lesson;

public class Account {

    int acc_no;
    String name;
    float amount;

    void insert(int a, String n, float amt) {
        acc_no = a;
        name = n;
        amount = amt;
    }

    // deposit method
    void deposit(float amt) {
        amount = amount + amt;

        System.out.println(amt + " deposited");
    }

    //withdraw method
    void withdraw(float amt) {
        if (amount < amt) {
            System.out.println("Insufficient Balance");
        } else {
            amount = amount - amt;
            System.out.println(amt + " withdraw");
        }
    }

    //method to check the balance of the account
    void checkBalance() {
        System.out.println("Check balance of the account");
        System.out.println("Balance is: " + amount);
    }

    //method to display the values of an object
    void display() {
        System.out.println("Display the values of an Object");
        System.out.println(acc_no + " " + name + " " + amount);
    }
}

//Creating a test class to deposit and withdraw a amount
class TestAccount {
    public static void main(String[] args) {
        Account a1 = new Account();
        a1.insert(232323, "Seyha VORn", 1000);
        a1.display();
        a1.checkBalance();
        a1.deposit(10000);
        a1.checkBalance();
        a1.withdraw(14000);
        a1.checkBalance();
    }
}


