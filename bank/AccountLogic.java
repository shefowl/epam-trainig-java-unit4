package by.epam.unit4.bank;

public class AccountLogic {
    public static void changeBalance(Account account, float balance){
        if(account.isBlocked()){
            return;
        }

        account.setBalance(account.getBalance() + balance);
    }
}
