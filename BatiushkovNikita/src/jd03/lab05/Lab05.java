package jd03.lab05;

import java.sql.*;

public class Lab05 {
    public static final String NUM = "5";
    public static final String PAY_DATE = "2011" + "06" + "12";
    public static final String RESEIVER = "4";
    public static final int VALUE = 20900;

    public static final String INSERT_QUARY =
            "INSERT INTO expenses (num, paydate, value, receiver) VALUES " +
                    "(" + NUM + ", " + PAY_DATE + ", " + VALUE + ", " + RESEIVER + ")";

    public static final String SELECT_QUARY = "SELECT * FROM expenses";

    public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection(Util.getDBURL(), Util.getUserName(), Util.getPassword());
             Statement statement = connection.createStatement()) {
            statement.executeUpdate(INSERT_QUARY);
            try (ResultSet resultSet = statement.executeQuery(SELECT_QUARY)) {
                while (resultSet.next()) {
                    System.out.printf(resultSet.getString("num"));
                    System.out.printf("     ");
                    System.out.printf(resultSet.getString("paydate"));
                    System.out.printf("     ");
                    System.out.printf(resultSet.getString("receiver"));
                    System.out.printf("     ");
                    System.out.printf(resultSet.getString("value"));
                    System.out.println();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

