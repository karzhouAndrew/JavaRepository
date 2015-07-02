package jd03.lab06;
/*
Напишите программу получающую данные о расходе в качестве исходных параметров main,
и добавляющую этот расход в базу, после чего выводящую таблицу расходов на экран.
Измените предыдущую задачу таким образом, чтобы она использовала прекомпилированные запросы.
*/

import java.sql.*;

public class Lab06 {
    public static final String NUM = "5";
    public static final String PAY_DATE = "2011" + "06" + "12";
    public static final String RESEIVER = "4";
    public static final int VALUE = 20900;

    public static final String INSERT_QUARY = "INSERT INTO expenses (num, paydate, value, receiver) VALUES (?, ?, ?, ?)";
    public static final String SELECT_QUARY = "SELECT * FROM expenses";

    public static void main(String[] args) {
        String dbURL = Util.getDBURL();
        String userName = Util.getUserName();
        String password = Util.getPassword();

        try (Connection connection = DriverManager.getConnection(dbURL, userName, password);
             PreparedStatement pStatement = connection.prepareStatement(INSERT_QUARY)) {
            pStatement.setString(1, NUM);
            pStatement.setString(2, PAY_DATE);
            pStatement.setInt(3, VALUE);
            pStatement.setString(4, RESEIVER);
            pStatement.execute();
            viewExpenses(pStatement);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void viewExpenses(PreparedStatement pStatement) {
        try (ResultSet resultSet = pStatement.executeQuery(SELECT_QUARY)) {
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
    }
}
