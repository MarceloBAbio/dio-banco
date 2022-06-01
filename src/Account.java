public abstract class Account {
    protected static int SEQUENCIAL = 1;

    protected int agency;
    protected int id;
    protected double balance;

    public Account(int agency, int id) {
        this.agency = agency;
        this.id = id;
        this.balance = 0.0;
    }

    public int getAgency() {
        return this.agency;
    }

    public int getId() {
        return this.id;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void withdraw(double amount) {
        this.balance -= amount;

    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void transfer(double amount, Account transferedTo) {
        this.withdraw(amount);
        transferedTo.deposit(amount);
    }

    public void printAccount() {
        System.out.printf("Agency: %d\n", this.agency);
        System.out.printf("Account number: %d\n", this.id);
        System.out.printf("Balance: %.2f\n", this.balance);
    }
}
