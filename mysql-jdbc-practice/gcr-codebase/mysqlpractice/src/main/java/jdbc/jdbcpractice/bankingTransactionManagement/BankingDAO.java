package jdbc.jdbcpractice.bankingTransactionManagement;

import jdbc.jdbcpractice.util.DBConnectionBank;
import java.sql.*;

public class BankingDAO {

    public void transferMoney(int from, int to, double amount) throws SQLException {

        Connection con = DBConnectionBank.getConnection();
        con.setAutoCommit(false);

        try {

            // Debit
            PreparedStatement debit = con.prepareStatement(
                    "UPDATE accounts SET balance = balance - ? WHERE account_id = ?");
            debit.setDouble(1, amount);
            debit.setInt(2, from);
            debit.executeUpdate();

            // Credit
            PreparedStatement credit = con.prepareStatement(
                    "UPDATE accounts SET balance = balance + ? WHERE account_id = ?");
            credit.setDouble(1, amount);
            credit.setInt(2, to);
            credit.executeUpdate();

            PreparedStatement history = con.prepareStatement(
                    "INSERT INTO transactions (from_account, to_account, amount) VALUES (?, ?, ?)");
            history.setInt(1, from);
            history.setInt(2, to);
            history.setDouble(3, amount);
            history.executeUpdate();

            con.commit();
            System.out.println("Transaction successful");

        } catch (Exception e) {

            con.rollback();
            System.out.println("Transaction failed, rolled back");
            e.printStackTrace();

        } finally {
            con.close();
        }
    }

    public void checkBalance(int accountId) throws SQLException {

        Connection con = DBConnectionBank.getConnection();

        PreparedStatement ps = con.prepareStatement(
                "SELECT account_holder, balance FROM accounts WHERE account_id=?");
        ps.setInt(1, accountId);

        ResultSet rs = ps.executeQuery();

        if (rs.next()) {
            System.out.println(
                    rs.getString("account_holder") +
                    " | Balance: " +
                    rs.getDouble("balance"));
        }

        con.close();
    }

    public void transactionHistory() throws SQLException {

        Connection con = DBConnectionBank.getConnection();

        ResultSet rs = con.createStatement()
                .executeQuery("SELECT * FROM transactions");

        while (rs.next()) {
            System.out.println(
                    rs.getInt("transaction_id") + " | " +
                    rs.getInt("from_account") + " -> " +
                    rs.getInt("to_account") + " | " +
                    rs.getDouble("amount") + " | " +
                    rs.getTimestamp("transaction_date"));
        }

        con.close();
    }
}
