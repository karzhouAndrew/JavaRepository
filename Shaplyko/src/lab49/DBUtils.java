package lab49;

import java.sql.*;

public class DBUtils {
    public static void close(ResultSet resultSet, Connection connection, PreparedStatement preparedStatement) {
        try {
            if (resultSet != null) {
                resultSet.close();
            }
            if (connection != null) {
                connection.close();
            }
            if (preparedStatement != null) {
                preparedStatement.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}