package lr2.example7;

public class Test {
    public static void main(String[] args) {
        BankAccount account = new Account(1000);

        System.out.println("Начальный баланс " + account.getBalance());

        account.deposit(100);
        System.out.println("Баланс после депозита " + account.getBalance());

        account.withdraw(200);
        System.out.println("Баланс после снятия " + account.getBalance());

        account.withdraw(3000);
        System.out.println("Баланс после неудачного снятия " + account.getBalance());
    }
}
