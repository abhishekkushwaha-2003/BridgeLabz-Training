package jdbc.jdbcpractice.bankingTransactionManagement;

public class Account {

    private int account_id;
    private String account_holder;
    private double balance;

    public int getAccountId() {
        return account_id;
    }

    public void setAccountId(int account_id) {
        this.account_id = account_id;
    }

    public String getAccountHolder() {
        return account_holder;
    }

    public void setAccountHolder(String account_holder) {
        this.account_holder = account_holder;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
