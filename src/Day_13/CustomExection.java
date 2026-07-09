package Day_13;

public class CustomExection {

    public static void main(String[] args) {

        BankAccount b1 = new BankAccount();

        try {
            b1.deposit(-500);
        }
        catch (InvalidAmountException e) {
            System.out.println(e.getMessage());
        }
    }
}


class BankAccountt {

    float balance = 1000;

    public void deposit(float amount)
            throws InvalidAmountException {

        if (amount < 0) {
            throw new InvalidAmountException();
        }

        balance = balance + amount;

        System.out.println("Amount Deposited: " + amount);
        System.out.println("Balance: " + balance);
    }
}


// Custom Exception
class InvalidAmountExceptions extends Exception {

    InvalidAmountExceptions() {
        super("Enter a positive amount");
    }
}