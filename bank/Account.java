package by.epam.unit4.bank;

import java.util.Objects;

public class Account {
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
