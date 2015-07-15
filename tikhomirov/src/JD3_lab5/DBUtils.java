package JD3_lab5;

import java.sql.*;

public class DBUtils {
    public static final String DB_URL = "jdbc:mysql://localhost:3306/testsite";
    public static final String USER_NAME = "root";
    public static final String PASSWORD = "TikhomiroV.89";
    public static final String CLASS_NAME = "com.mysql.jdbc.Driver";

    public static Connection createConnection() {
        try {
            Class.forName(CLASS_NAME);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(DB_URL, USER_NAME, PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }

    public static Statement createStatement() {
        Statement statement = null;
        try {
            statement = createConnection().createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return statement;
    }

    public static PreparedStatement createPreparedStatement(String template) {
        PreparedStatement pStatement = null;
        try {
            pStatement = createConnection().prepareStatement(template);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return pStatement;
    }

    public static void close(Connection connection, PreparedStatement preparedStatement, ResultSet resultset) {
        try {
            if (resultset != null) {
                resultset.close();
            }

            if (preparedStatement != null) {
                preparedStatement.close();
            }
            if (connection != null) {
                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
