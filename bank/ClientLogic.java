package by.epam.unit4.bank;

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
        Account [] accounts = client.getAccounts();
        for (int i = 0; i < accounts.length; i++) {
            int min = accounts[i].getAccountNumber();
            int minIndex = i;
            for (int j = i+1; j < accounts.length; j++) {
                if (accounts[j].getAccountNumber() < min) {
                    min = accounts[j].getAccountNumber();
                    minIndex = j;
                }
            }
            if (i != minIndex) {
                Account tmp = accounts[i];
                accounts[i] = accounts[minIndex];
                accounts[minIndex] = tmp;
            }
        }
        client.setAccounts(accounts);
    }

    public static float accountsBalancesSum(Client client){
        int sum = 0;
        for(int i = 0; i < client.getAccounts().length; ++i){
            sum += client.getAccounts()[i].getBalance();
        }
        return sum;
    }

    public static float accountsPositiveBalancesSum(Client client){
        int sum = 0;
        for(int i = 0; i < client.getAccounts().length; ++i){
            if(client.getAccounts()[i].getBalance() > 0){
                sum += client.getAccounts()[i].getBalance();
            }
        }
        return sum;
    }

    public static float accountsNegativeBalancesSum(Client client){
        int sum = 0;
        for(int i = 0; i < client.getAccounts().length; ++i){
            if(client.getAccounts()[i].getBalance() < 0){
                sum += client.getAccounts()[i].getBalance();
            }
        }
        return sum;
    }
}
