import java.util.ArrayList;

/**
 * Created by alenasynkova on 2017-11-25.
 */
public class Chequing implements Account {

    private  static final double BALANCE = 1000.00;
    private int accountID;
    private double balance;
    private ArrayList<CreditCard> cards;


    public Chequing(int accID, ArrayList<CreditCard> cards) {
        balance = BALANCE;
        accountID = accID;
        this.cards = cards;
    }

    @Override
    public double getBalance() {
        return balance;   //change that
    }

    public int getAccountID() {
        return accountID;  //change that
    }


    public void purchase(double amount) {
        balance-=amount;
    }

    @Override
    public void setBalance(double amount) {
        balance = amount;
    }

    public void deposit(double amount){
        balance += amount;
    }

    public void transferToCard(double amount, CreditCard card) {
        CreditCard crcard;
        crcard = cards.get(0);
        balance = balance - amount;
        crcard.setBalance(amount);
    }

}

