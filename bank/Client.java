package by.epam.unit4.bank;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Client {
    private String name;
    private List<Account> accounts;

    public Client() {
    }

    public Client(String name, List<Account> accounts) {
        this.name = name;
        this.accounts = new ArrayList<>(accounts);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if(o == null){
            return false;
        }

        if(this.getClass() != o.getClass()){
            return false;
        }

        Client client = (Client) o;
        return Objects.equals(getName(), client.getName()) &&
                Objects.equals(getAccounts(), client.getAccounts());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAccounts());
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", accounts=" + accounts +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Account> getAccounts() {
        return new ArrayList<> (accounts);
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = new ArrayList<>(accounts);
    }
}
