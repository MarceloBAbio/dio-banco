public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Creating 'World Bank' bank");
        Bank bank1 = new Bank("World Bank");
        System.out.println("Registering 'Marcelo' client to the World Bank");
        Client client1 = new Client("Marcelo", bank1);
        bank1.addClient(client1);
        bank1.listClients();

        System.out.println();
        System.out.println("Adding a current account and a savings account to the client");
        Account curAcc = new CurrentAccount(1);
        client1.addAccount(curAcc);
        Account savAcc = new SavingsAccount(1);
        client1.addAccount(savAcc);

        System.out.println("Depositing $100,00 to client's current account");
        curAcc.deposit(100);
        curAcc.printAccount();

        System.out.println();
        System.out.println("Transferring $40,00 to client's savings account");
        curAcc.transfer(40, savAcc);
        client1.listAccounts();
    }
}
