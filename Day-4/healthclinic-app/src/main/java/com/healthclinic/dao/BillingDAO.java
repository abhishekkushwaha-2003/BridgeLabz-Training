package com.healthclinic.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.healthclinic.db.DBConnection;
import com.healthclinic.model.Billing;

public class BillingDAO {

    // Generate Bill
    public boolean generateBill(Billing billing) {

        String sql = "INSERT INTO Billing(VisitID, Amount, PaymentStatus) VALUES(?,?,?)";

        try (Connection connection = DBConnection.getConnection();
             PreparedStatement ps = connection.prepareStatement(sql)) {

            ps.setInt(1, billing.getVisitId());
            ps.setDouble(2, billing.getAmount());
            ps.setString(3, billing.getPaymentStatus());

            return ps.executeUpdate() > 0;

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }

    // View All Bills
    public List<Billing> getAllBills() {

        List<Billing> bills = new ArrayList<>();

        String sql = "SELECT * FROM Billing";

        try (Connection connection = DBConnection.getConnection();
             PreparedStatement ps = connection.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {

                Billing billing = new Billing();

                billing.setBillId(rs.getInt("BillID"));
                billing.setVisitId(rs.getInt("VisitID"));
                billing.setAmount(rs.getDouble("Amount"));
                billing.setPaymentStatus(rs.getString("PaymentStatus"));

                bills.add(billing);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return bills;
    }

    // View Bills Using Stored Procedure
    public List<Billing> showBillsUsingProcedure() {

        List<Billing> bills = new ArrayList<>();

        String sql = "{CALL ShowBills()}";

        try (Connection connection = DBConnection.getConnection();
             CallableStatement cs = connection.prepareCall(sql);
             ResultSet rs = cs.executeQuery()) {

            while (rs.next()) {

                Billing bill = new Billing();

                bill.setBillId(rs.getInt("BillID"));
                bill.setVisitId(rs.getInt("VisitID"));
                bill.setAmount(rs.getDouble("Amount"));
                bill.setPaymentStatus(rs.getString("PaymentStatus"));

                bills.add(bill);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return bills;
    }
}