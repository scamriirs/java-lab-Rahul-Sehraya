class Account {
    int accountNo;
    double balance;

    Account(int accountNo, double balance) {
        this.accountNo = accountNo;
        this.balance = balance;
    }

    void checkBalance() {
        System.out.println("Account No: " + accountNo);
        System.out.println("Current Balance: ₹" + balance);
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: ₹" + amount);
        checkBalance();
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: ₹" + amount);
        } else {
            System.out.println("Insufficient Balance!");
        }
        checkBalance();
    }
}

class Savings extends Account {
    double interestRate;

    Savings(int accountNo, double balance, double interestRate) {
        super(accountNo, balance);
        this.interestRate = interestRate;
    }

    void addInterest() {
        double interest = balance * (interestRate / 100);
        balance += interest;
        System.out.println("Interest Added: ₹" + interest);
        checkBalance();
    }
}

class Current extends Account {
    double overdraftLimit;

    Current(int accountNo, double balance, double overdraftLimit) {
        super(accountNo, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    void withdraw(double amount) {
        if (amount <= balance + overdraftLimit) {
            balance -= amount;
            System.out.println("Withdrawn: ₹" + amount);
        } else {
            System.out.println("Overdraft Limit Exceeded!");
        }
        checkBalance();
    }
}

public class Accounts {
    public static void main(String[] args) {

        System.out.println("---- Savings Account ----");
        Savings s = new Savings(1001, 5000, 5);
        s.checkBalance();
        s.deposit(2000);
        s.withdraw(1000);
        s.addInterest();

        System.out.println("\n---- Current Account ----");
        Current c = new Current(2001, 3000, 2000);
        c.checkBalance();
        c.deposit(1500);
        c.withdraw(6000); // allowed due to overdraft
        c.withdraw(2000); // may exceed overdraft
    }
}
