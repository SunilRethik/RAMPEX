package Day_29;

import java.sql.*;

public class InsertBooking {

    public static void main(String[] args) throws Exception {

        Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/transportdb",
                "root", "root123");

        String sql = "INSERT INTO bus_booking " +
                "(from_city, to_city, travel_date, price) " +
                "VALUES (?, ?, ?, ?)";

        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, "Chennai");
        ps.setString(2, "Madurai");
        ps.setString(3, "15-08-2026");
        ps.setInt(4, 650);

        int rows = ps.executeUpdate();

        System.out.println(rows + " row(s) inserted");

        ps.close();
        con.close();
    }
}