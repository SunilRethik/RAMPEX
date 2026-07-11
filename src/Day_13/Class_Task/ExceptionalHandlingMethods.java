package Day_13.Class_Task;

public class ExceptionalHandlingMethods {

    public static void main(String[] args) {

        BankAccounts b1 = new BankAccounts();

        b1.setName("Sunil");

        try {
            b1.deposit(-1);
        }
        catch (InvalidAmountException e) {
            System.out.println(e.getMessage());
        }
    }
}


 class BankAccounts {

    private String accName;
    private int accNo;
    private float balance;


    public void deposit(int amount)
            throws InvalidAmountException {

        if (amount < 0) {
            throw new InvalidAmountException();
        }

        balance = balance + amount;

        System.out.println(
                accName + " deposited Rs." + amount +
                        ", Balance: " + balance
        );
    }


    public void withdraw(float amount) {

        balance = balance - amount;

        System.out.println(
                "Amount withdrawn Rs." + amount +
                        ", Balance: " + balance
        );
    }


    public float checkBalance() {
        return balance;
    }


    public void setName(String name) {
        accName = name;
    }


    public String getName() {
        return accName;
    }
}


class InvalidAmountExceptions extends Exception {

    InvalidAmountExceptions() {
        super("Invalid amount! Enter a positive amount.");
    }
}


class LowBalanceException extends Exception {

    LowBalanceException() {
        super("Insufficient balance!");
    }
}