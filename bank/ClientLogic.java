package by.epam.unit4.bank;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ClientLogic {
    public static Account findAccount(Client client,int accountNumber){
        for (Account i:client.getAccounts()) {
            if(i.getAccountNumber() == accountNumber){
                return i;
            }
        }
        return null;
    }

    public static void sortAccountsByNumber(Client client){
        List<Account> sorted = client.getAccounts();
        Collections.sort(sorted);
        client.setAccounts(sorted);
    }

    public static void sortAccountsByBalance(Client client){
        List<Account> sorted = client.getAccounts();
        Comparator<Account> comparator = new Account();
        Collections.sort(sorted, comparator);
        client.setAccounts(sorted);
    }


    public static float accountsBalancesSum(Client client){
        int sum = 0;
        for (Account i: client.getAccounts()) {
            if(!i.isBlocked()) {
                sum += i.getBalance();
            }
        }
        return sum;
    }

    public static float accountsPositiveBalancesSum(Client client){
        int sum = 0;
        for (Account i: client.getAccounts()) {
            if(i.getBalance() > 0){
                sum += i.getBalance();
            }
        }
        return sum;
    }

    public static float accountsNegativeBalancesSum(Client client){
        int sum = 0;
        for (Account i: client.getAccounts()) {
            if(i.getBalance() < 0){
                sum += i.getBalance();
            }
        }
        return sum;
    }
}
