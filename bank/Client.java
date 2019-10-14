package by.epam.unit4.bank;

import java.util.Arrays;
import java.util.Objects;

public class Client {
    private String name;
    private Account [] accounts;

    public Client() {
    }

    public Client(String name, Account[] accounts) {
        this.name = name;
        this.accounts = accounts;
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
                Arrays.equals(getAccounts(), client.getAccounts());
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(getName());
        result = 31 * result + Arrays.hashCode(getAccounts());
        return result;
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", accounts=" + Arrays.toString(accounts) +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Account[] getAccounts() {
        return accounts;
    }

    public void setAccounts(Account[] accounts) {
        this.accounts = accounts;
    }
}
