/**
 * Created by alenasynkova on 2017-11-25.
 */
public class CreditCard implements Account {

    private static final double MONTHLY_FEE = 10.0;
private int number;
private double balance;
private Chequing account;
    public CreditCard(int cardNumber, double balance, Chequing account) {



    }


    // Returns balance if the current balance is less than 1000, otherwise returns (balance - MONTHLY_FEE)
    @Override
    public double getBalance() {//change that
        if(balance<1000)
            return balance;
        else return balance - MONTHLY_FEE;
    }

    public int getCardNumber() {   //change that
  return number;
    }

    @Override
    public void purchase(double amount) {
        balance+=amount;

    }

    @Override
    public void setBalance(double amount) {
    balance=amount;
    }

    public void deposit(double amount){
        balance-=amount;
    }
    public void payCreditCardBill(double amount, Chequing account){
   Chequing chequingaccount;
   chequingaccount = account;
  balance=balance + amount;
  chequingaccount.setBalance(amount);
    }
    public void payCreditCardBill(double amount){
    balance=balance+amount;
    }

}
// we think that the property of object orientated program (OOP) that allows us to have two payCreditCardBill methods is Polymorphism because we use the smae words in different sitatutons for exmple amount.