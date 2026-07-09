package Day_15_Class_task;

public class Synchronized_Method {

    public static void main(String[] args) {

        BankAccount bank = new BankAccount("Sunil", 1000);

        GpayAccount gpay = new GpayAccount(bank);
        PhonePe phonePe = new PhonePe(bank);

        gpay.start();
        phonePe.start();
    }
}


// GPay Thread
class GpayAccount extends Thread {

    BankAccount b;

    GpayAccount(BankAccount bankAcc) {
        System.out.println("GPay Account created");
        this.b = bankAcc;
    }

    public void pay() {
        b.withdraw(500);
    }

    @Override
    public void run() {
        pay();
    }
}


// PhonePe Thread
class PhonePe extends Thread {

    BankAccount b;

    PhonePe(BankAccount bankAcc) {
        System.out.println("PhonePe Account created");
        this.b = bankAcc;
    }

    public void pay() {
        b.withdraw(300);
    }

    @Override
    public void run() {
        pay();
    }
}


// Bank Account
class BankAccount {

    String name;
    int balance;

    BankAccount(String name, int balance) {
        this.name = name;
        this.balance = balance;
    }

    // Synchronized Method
    public synchronized void withdraw(int amount) {

        if (balance >= amount) {

            System.out.println(
                    Thread.currentThread().getName()
                            + " is withdrawing ₹" + amount
            );

            balance = balance - amount;

            System.out.println(
                    "Remaining balance: ₹" + balance
            );

        } else {
            System.out.println("Insufficient balance");
        }
    }
}