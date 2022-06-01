public class SavingsAccount extends Account {
    private static double SAVINGS_RATE = 5 / 10000;

    public SavingsAccount(int agency) {
        super(agency, SEQUENCIAL);
        SEQUENCIAL++;
        // TODO Auto-generated constructor stub
    }

    public void applySavingsIncome() {
        double income = this.balance * SAVINGS_RATE;
        this.balance += income;
    }
}
