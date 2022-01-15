
import java.util.HashMap;
import java.util.Map;

public class Bank {
    private static Map<Integer, Client> clients = new HashMap<>();

    public static Client getClient(Integer accountId) {
        return clients.get(accountId);
    }

    public static void addClient(Client client) {
        clients.put(client.getAccountId(), client);
    }
}
