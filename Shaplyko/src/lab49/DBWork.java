package lab49;

import java.sql.*;

public class DBWork {
    public static final String NUM = "5";
    public static final String DATE = "2011" + "06" + "11";
    public static final String RECEIVER = "2";
    public static final int SUM = 8200;
    public static final String SQL_INSERT_EXPENS = "INSERT INTO expenses (num, date, sum, receiver) VALUES (?,?,?,?)";
    public static final String SELECT_QUARY = "SELECT * FROM expenses";


    public void workQuary() throws ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/listexpenses", "root", "admin123");
            preparedStatement = connection.prepareStatement(SQL_INSERT_EXPENS);
            preparedStatement.setString(1, NUM);
            preparedStatement.setString(2, DATE);
            preparedStatement.setInt(3, SUM);
            preparedStatement.setString(4, RECEIVER);
            preparedStatement.executeUpdate();
            resultSet = printResult(preparedStatement, resultSet);
        } catch (SQLException e) {
            e.printStackTrace();

        } finally {
            DBUtils.close(resultSet, connection, preparedStatement);
        }
    }

    public ResultSet printResult(PreparedStatement preparedStatement, ResultSet resultSet) {
        try {
            resultSet = preparedStatement.executeQuery(SELECT_QUARY);
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