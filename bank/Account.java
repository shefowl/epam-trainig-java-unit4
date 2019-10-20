package by.epam.unit4.bank;

import java.util.Comparator;
import java.util.Objects;

public class Account implements Comparator<Account>, Comparable<Account> {
    private int accountNumber;
    private float balance;
    private boolean blocked;

    public Account() {
    }

    public Account(int accountNumber, float balance, boolean blocked) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.blocked = blocked;
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

        Account account = (Account) o;
        return getAccountNumber() == account.getAccountNumber() &&
                Float.compare(account.getBalance(), getBalance()) == 0 &&
                isBlocked() == account.isBlocked();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAccountNumber(), getBalance(), isBlocked());
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountNumber=" + accountNumber +
                ", balance=" + balance +
                ", blocked=" + blocked +
                '}';
    }

    @Override
    public int compareTo(Account o) {
        if(accountNumber < o.getAccountNumber()){
            return -1;
        }
        else if(accountNumber == o.getAccountNumber()){
            return 0;
        }
        else {
            return 1;
        }
    }

    @Override
    public int compare(Account o1, Account o2) {
        float balance1 = o1.getBalance();
        float balance2 = o2.getBalance();
        if(balance1 < balance2){
            return -1;
        }
        else if(balance1 == balance2){
            return 0;
        }
        else{
            return 1;
        }
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public boolean isBlocked() {
        return blocked;
    }

    public void setBlocked(boolean blocked) {
        this.blocked = blocked;
    }
}
