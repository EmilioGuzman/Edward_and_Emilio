/**
 * Created by alenasynkova on 2017-11-25.
 */
public class CreditCard implements Account {

    private static final double MONTHLY_FEE = 10.0;

    public CreditCard(int cardNumber, double balance, Chequing account) {
    }


    // Returns balance if the current balance is less than 1000, otherwise returns (balance - MONTHLY_FEE)
    @Override
    public double getBalanca() {
        return 0;   //change that
    }

    public int getCardNumber() {
        return 0;    //change that
    }

    @Override
    public void purchase(double amount) {
        assert balance > 0;

    }

    @Override
    public void setBalance(double amount) {

    }

}
