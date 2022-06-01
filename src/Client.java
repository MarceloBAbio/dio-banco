import java.util.ArrayList;
import java.util.List;

public class Client {
    private static int SEQUENCIAL = 1;

    private int id;
    private String name;
    private Bank bank;
    private List<Account> listOfAccounts;

    public Client(String name, Bank bank) {
        this.id = SEQUENCIAL;
        this.name = name;
        this.bank = bank;
        this.listOfAccounts = new ArrayList<Account>();
        SEQUENCIAL++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Bank getBank() {
        return bank;
    }

    public int getId() {
        return id;
    }

    public void addAccount(Account newAccount) {
        this.listOfAccounts.add(newAccount);
    }

    public void listAccounts() {
        for (int i = 0; i < listOfAccounts.size(); i++) {
            listOfAccounts.get(i).printAccount();
        }
    }

    public void removeId(int id) {
        for (int i = 0; i < listOfAccounts.size(); i++) {
            if (listOfAccounts.get(i).id == id) {
                listOfAccounts.remove(i);
            }
        }
    }

    public void printClient() {
        System.out.println("Name: " + this.name);
        System.out.println("Bank: " + this.bank.getName());
    }
}
