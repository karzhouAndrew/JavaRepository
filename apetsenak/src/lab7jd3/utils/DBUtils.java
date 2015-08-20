package lab7jd3.utils;


import java.sql.*;
import java.util.ResourceBundle;

public class DBUtils {
    private static final String DB_PROPERTIES_PATH = "lab7jd3.properties.DataBase";

    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        ResourceBundle resBundle = ResourceBundle.getBundle(DB_PROPERTIES_PATH);
        Connection connection = null;
        Class.forName("com.mysql.jdbc.Driver");
        connection = DriverManager.getConnection(resBundle.getString("dbURL"),
                resBundle.getString("login"),
                resBundle.getString("password"));
        return connection;
    }

    public static void close(Statement statement, PreparedStatement preparedStatement, ResultSet resultSet, Connection connection) {
        if (resultSet != null) {
            try {
                resultSet.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (statement != null) {
            try {
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (preparedStatement != null) {
            try {
                preparedStatement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static void close(PreparedStatement preparedStatement, Connection connection) {
        close(null, preparedStatement, null, connection);
    }

    public static void close(Statement statement, ResultSet resultSet, Connection connection) {
        close(statement, null, resultSet, connection);
    }
}
