import java.util.Arrays;
import java.util.List;

public class Client implements IClient {

    private Integer accountId;
    private String name;
    private Float balance;

    public Client(int accountId) {
        this.accountId = accountId;
        Client object = Bank.getClient(accountId);
        this.name = object.name;
        this.balance = object.balance;
    }

    public Client(Integer accountId, String nome, Float balance) {
        this.accountId = accountId;
        this.name = nome;
        this.balance = balance;
    }

    public Integer getAccountId() {
        return accountId;
    }

    @Override
    public List<String> getData() {
        return Arrays.asList(this.name, this.accountId.toString());
    }

    @Override
    public Float getBalance(Manager manager) {
        return this.balance;
    }
}
