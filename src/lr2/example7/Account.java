package lr2.example7;

public class Account implements BankAccount {
    private double balance;

    public Account(double init) {
        if (init >= 0) this.balance = init;
        else this.balance = 0;
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println("Депозит " + amount + " зачислен на ваш счет");
        } else
            System.out.println("Депозит должен быть положительным");
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= this.balance) {
            this.balance -= amount;
            System.out.println("Снятие " + amount + " с вашего счета");
        } else
            System.out.println("Недостаточно средств");
    }

    @Override
    public double getBalance() {
        return this.balance;
    }
}
