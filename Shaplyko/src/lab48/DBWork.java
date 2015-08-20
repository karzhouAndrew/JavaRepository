package lab48;

import java.sql.*;

public class DBWork {
    public static final String NUM = "5";
    public static final String DATE = "2011" + "06" + "11";
    public static final String RECEIVER = "2";
    public static final int SUM = 8200;
    public static final String SQL_INSERT_EXPENS = "INSERT INTO expenses (num, date, sum, receiver) VALUES " +
            "(" + NUM + ", " + DATE + ", " + SUM + ", " + RECEIVER + ")";
    public static final String SELECT_QUARY = "SELECT * FROM expenses";

    public void workQuary() throws ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/listexpenses", "root", "admin123");
            statement = connection.createStatement();
            statement.executeUpdate(SQL_INSERT_EXPENS);
            resultSet = printResult(statement, resultSet);
        } catch (SQLException e) {
            e.printStackTrace();

        } finally {
            DBUtils.close(resultSet, connection, statement);
        }
    }

    public ResultSet printResult(Statement statement, ResultSet resultSet) {
        try {
            resultSet = statement.executeQuery(SELECT_QUARY);
            while (resultSet.next()) {
                System.out.printf(resultSet.getString("num") + "  ");
                System.out.printf(resultSet.getString("date") + "  ");
                System.out.printf(resultSet.getString("receiver") + "  ");
                System.out.printf(resultSet.getString("sum") + "  ");
                System.out.println();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return resultSet;
    }
}