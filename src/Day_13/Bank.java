package Day_13;

public class Bank {

    public static void main(String[] args) {

        SibAccount s1 = new SibAccount();

        s1.setName("Sunil");
        s1.setAccId(101);
        s1.setBalance(5000);

        try {
            s1.deposit(-5);
        }
        catch (ArithmeticException e) {
            System.out.println("Enter positive amount value");
        }

        s1.deposit(2000);
        s1.withdraw(1000);
        s1.deposit(3000, 1234);
        s1.checkBalance();
    }
}


// Interface
interface Rbi {

    void deposit(float amount);

    void withdraw(float amount);

    void checkBalance();
}


// Implementation Class
class SibAccount implements Rbi {

    // Encapsulation
    private String accName;
    private int accId;
    private float balance;
    private float fdBalance;

    private float maxAmount = 10000;


    // Getters

    public String getName() {
        return accName;
    }

    public int getAccId() {
        return accId;
    }

    public float getBalance() {
        return balance;
    }

    public float getMaxAmount() {
        return maxAmount;
    }


    // Setters

    public void setName(String name) {
        accName = name;
    }

    public void setAccId(int id) {
        accId = id;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public void setMaxAmount(float amount) {
        maxAmount = amount;
    }


    // Normal Account Deposit

    @Override
    public void deposit(float amount) {

        if (amount < 0) {
            throw new ArithmeticException();
        }

        balance = balance + amount;

        System.out.println(
                "Amount deposited in " + accName +
                        "'s Account Rs: " + amount +
                        " Remaining balance: " + balance
        );
    }


    // FD Deposit - Method Overloading

    public void deposit(float amount, int accCode) {

        fdBalance = fdBalance + amount;

        System.out.println(
                "Amount deposited in FD Account: " + amount +
                        " Remaining FD balance: " + fdBalance
        );
    }


    // Withdrawal

    @Override
    public void withdraw(float amount) {

        if (amount < 0) {

            System.out.println("Invalid amount");

        }
        else if (amount > maxAmount) {

            System.out.println("Entered amount exceeds the limit");

        }
        else if (amount > balance) {

            System.out.println("Insufficient funds");

        }
        else {

            balance = balance - amount;

            System.out.println(
                    "Amount withdrawn from " + accName +
                            "'s Account Rs: " + amount +
                            " Remaining balance: " + balance
            );
        }
    }


    // Check Balance

    @Override
    public void checkBalance() {

        System.out.println("Main Balance: " + balance);
        System.out.println("FD Balance: " + fdBalance);
    }
}