package Day_13.Class_Task;

 class CustomExection {

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

class BankAccount {

    float balance = 1000;

    public void deposit(float amount)
            throws InvalidAmountException {

        if (amount < 0) {
            throw new InvalidAmountException();
        }

        balance += amount;

        System.out.println("Amount Deposited: " + amount);
        System.out.println("Balance: " + balance);
    }
}

// Custom Exception
class InvalidAmountException extends Exception {

    InvalidAmountException() {
        super("Enter a positive amount");
    }
}