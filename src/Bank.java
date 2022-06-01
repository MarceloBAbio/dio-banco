import java.util.ArrayList;
import java.util.List;

public class Bank {
    private String name;
    private List<Client> listOfClients;

    public Bank(String name) {
        this.name = name;
        this.listOfClients = new ArrayList<Client>();
    }

    public String getName() {
        return name;
    }

    public void addClient(Client client) {
        listOfClients.add(client);
    }

    public void removeClient(int clientId) {
        for (int i = 0; i < listOfClients.size(); i++) {
            if (listOfClients.get(i).getId() == clientId) {
                listOfClients.remove(i);
            }
        }
    }

    public void listClients() {
        for (int i = 0; i < listOfClients.size(); i++) {
            listOfClients.get(i).printClient();
        }
    }
}
